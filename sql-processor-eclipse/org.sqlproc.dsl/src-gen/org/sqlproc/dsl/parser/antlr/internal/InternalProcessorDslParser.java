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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_IDENT", "RULE_LPAREN", "RULE_COMMA", "RULE_RPAREN", "RULE_EQUALS", "RULE_SEMICOLON", "RULE_AT", "RULE_STRING", "RULE_COLON", "RULE_LBRACE", "RULE_RBRACE", "RULE_REST", "RULE_IDENT_DOT", "RULE_NUMBER", "RULE_MINUS", "RULE_PLUS", "RULE_QUESTI", "RULE_NOT", "RULE_BAND", "RULE_BOR", "RULE_HASH", "RULE_CARET", "RULE_LESS_THAN", "RULE_MORE_THAN", "RULE_ESC_CHAR", "RULE_AND", "RULE_OR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'QRY'", "'CRUD'", "'CALL'", "'OUT'", "'OPT'", "'LOPT'", "'IOPT'", "'SOPT'", "'BOPT'"
    };
    public static final int T__42=42;
    public static final int RULE_BAND=23;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_RBRACE=15;
    public static final int RULE_CARET=26;
    public static final int RULE_MORE_THAN=28;
    public static final int RULE_SEMICOLON=10;
    public static final int RULE_PLUS=20;
    public static final int RULE_OR=31;
    public static final int RULE_HASH=25;
    public static final int RULE_COMMA=7;
    public static final int RULE_AND=30;
    public static final int RULE_SL_COMMENT=33;
    public static final int RULE_QUESTI=21;
    public static final int EOF=-1;
    public static final int RULE_NOT=22;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_MINUS=19;
    public static final int RULE_COLON=13;
    public static final int RULE_STRING=12;
    public static final int RULE_REST=16;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_ESC_CHAR=29;
    public static final int T__36=36;
    public static final int RULE_NUMBER=18;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_IDENT=5;
    public static final int T__39=39;
    public static final int RULE_LPAREN=6;
    public static final int RULE_LBRACE=14;
    public static final int RULE_EQUALS=9;
    public static final int RULE_RPAREN=8;
    public static final int RULE_LESS_THAN=27;
    public static final int RULE_BOR=24;
    public static final int RULE_WS=4;
    public static final int RULE_IDENT_DOT=17;
    public static final int RULE_AT=11;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:77:1: ruleArtifacts returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+ ) ;
    public final EObject ruleArtifacts() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        Token this_WS_6=null;
        EObject lv_features_1_0 = null;

        EObject lv_statements_3_0 = null;

        EObject lv_mappings_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:80:28: ( ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+ ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+ )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:1: ( (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:81:2: (this_WS_0= RULE_WS )* ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:85:3: ( ( ( (lv_features_1_0= ruleOptionalFeature ) ) (this_WS_2= RULE_WS )* ) | ( ( (lv_statements_3_0= ruleMetaStatement ) ) (this_WS_4= RULE_WS )* ) | ( ( (lv_mappings_5_0= ruleMappingRule ) ) (this_WS_6= RULE_WS )* ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_IDENT) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_LPAREN) ) {
                        switch ( input.LA(3) ) {
                        case 34:
                        case 35:
                        case 36:
                            {
                            alt5=2;
                            }
                            break;
                        case 37:
                            {
                            alt5=3;
                            }
                            break;
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                            {
                            alt5=1;
                            }
                            break;

                        }

                    }


                }


                switch (alt5) {
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

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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


    // $ANTLR start "entryRuleMetaStatement"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:161:1: entryRuleMetaStatement returns [EObject current=null] : iv_ruleMetaStatement= ruleMetaStatement EOF ;
    public final EObject entryRuleMetaStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaStatement = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:162:2: (iv_ruleMetaStatement= ruleMetaStatement EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:163:2: iv_ruleMetaStatement= ruleMetaStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaStatementRule()); 
            }
            pushFollow(FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement282);
            iv_ruleMetaStatement=ruleMetaStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaStatement292); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:170:1: ruleMetaStatement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:173:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:174:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:174:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:174:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleSTATEMEN_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_statement_7_0= ruleSql ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:174:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:175:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:175:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:176:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement334); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMetaStatement350); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMetaStatementAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:196:1: ( (lv_type_2_0= ruleSTATEMEN_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:197:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:197:1: (lv_type_2_0= ruleSTATEMEN_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:198:3: lv_type_2_0= ruleSTATEMEN_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getTypeSTATEMEN_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement370);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:214:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:214:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMetaStatement382); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMetaStatementAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:218:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:219:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:219:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:220:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaStatement398); if (state.failed) return current;
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
            	    break loop6;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMetaStatement416); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMetaStatementAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaStatement426); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMetaStatementAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:244:1: ( (lv_statement_7_0= ruleSql ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:245:1: (lv_statement_7_0= ruleSql )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:245:1: (lv_statement_7_0= ruleSql )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:246:3: lv_statement_7_0= ruleSql
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaStatementAccess().getStatementSqlParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSql_in_ruleMetaStatement446);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement457); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:274:1: entryRuleSql returns [EObject current=null] : iv_ruleSql= ruleSql EOF ;
    public final EObject entryRuleSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:275:2: (iv_ruleSql= ruleSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:276:2: iv_ruleSql= ruleSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlRule()); 
            }
            pushFollow(FOLLOW_ruleSql_in_entryRuleSql492);
            iv_ruleSql=ruleSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSql502); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:283:1: ruleSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleSqlFragment ) )+ ;
    public final EObject ruleSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:286:28: ( ( (lv_sqls_0_0= ruleSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:287:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:287:1: ( (lv_sqls_0_0= ruleSqlFragment ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_WS && LA7_0<=RULE_EQUALS)||(LA7_0>=RULE_AT && LA7_0<=RULE_ESC_CHAR)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:288:1: (lv_sqls_0_0= ruleSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:288:1: (lv_sqls_0_0= ruleSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:289:3: lv_sqls_0_0= ruleSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSqlAccess().getSqlsSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlFragment_in_ruleSql547);
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:313:1: entryRuleSqlFragment returns [EObject current=null] : iv_ruleSqlFragment= ruleSqlFragment EOF ;
    public final EObject entryRuleSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:314:2: (iv_ruleSqlFragment= ruleSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:315:2: iv_ruleSqlFragment= ruleSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment583);
            iv_ruleSqlFragment=ruleSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlFragment593); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:322:1: ruleSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:325:28: ( ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:326:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:326:1: ( ( (lv_value_0_0= ruleSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_IDENT:
            case RULE_LPAREN:
            case RULE_COMMA:
            case RULE_RPAREN:
            case RULE_EQUALS:
            case RULE_RBRACE:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_NUMBER:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_BOR:
            case RULE_HASH:
            case RULE_CARET:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt8=1;
                }
                break;
            case RULE_AT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_COLON:
                {
                alt8=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:326:2: ( (lv_value_0_0= ruleSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:326:2: ( (lv_value_0_0= ruleSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:327:1: (lv_value_0_0= ruleSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:327:1: (lv_value_0_0= ruleSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:328:3: lv_value_0_0= ruleSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getValueSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlValue_in_ruleSqlFragment639);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:345:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:345:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:345:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleSqlFragment657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:349:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:350:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:350:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:351:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleSqlFragment677);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:368:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:368:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:368:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSqlFragment696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:372:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:373:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:373:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:374:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleSqlFragment716);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:391:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:391:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:391:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSqlFragment735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:395:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:396:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:396:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:397:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSqlFragment755);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:414:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:414:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:414:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleSqlFragment774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:418:1: ( (lv_meta_8_0= ruleMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:419:1: (lv_meta_8_0= ruleMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:419:1: (lv_meta_8_0= ruleMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:420:3: lv_meta_8_0= ruleMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSqlFragmentAccess().getMetaMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMetaSql_in_ruleSqlFragment794);
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

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlFragment805); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:448:1: entryRuleSqlValue returns [String current=null] : iv_ruleSqlValue= ruleSqlValue EOF ;
    public final String entryRuleSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:449:2: (iv_ruleSqlValue= ruleSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:450:2: iv_ruleSqlValue= ruleSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleSqlValue_in_entryRuleSqlValue842);
            iv_ruleSqlValue=ruleSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlValue853); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:457:1: ruleSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:460:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:461:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:461:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:461:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:461:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COMMA_5= RULE_COMMA | this_MINUS_6= RULE_MINUS | this_PLUS_7= RULE_PLUS | this_LPAREN_8= RULE_LPAREN | this_RPAREN_9= RULE_RPAREN | this_RBRACE_10= RULE_RBRACE | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_BOR_14= RULE_BOR | this_HASH_15= RULE_HASH | this_CARET_16= RULE_CARET | this_EQUALS_17= RULE_EQUALS | this_LESS_THAN_18= RULE_LESS_THAN | this_MORE_THAN_19= RULE_MORE_THAN | this_ESC_CHAR_20= RULE_ESC_CHAR )
            int alt9=21;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt9=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt9=2;
                }
                break;
            case RULE_IDENT:
                {
                alt9=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt9=4;
                }
                break;
            case RULE_WS:
                {
                alt9=5;
                }
                break;
            case RULE_COMMA:
                {
                alt9=6;
                }
                break;
            case RULE_MINUS:
                {
                alt9=7;
                }
                break;
            case RULE_PLUS:
                {
                alt9=8;
                }
                break;
            case RULE_LPAREN:
                {
                alt9=9;
                }
                break;
            case RULE_RPAREN:
                {
                alt9=10;
                }
                break;
            case RULE_RBRACE:
                {
                alt9=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt9=12;
                }
                break;
            case RULE_NOT:
                {
                alt9=13;
                }
                break;
            case RULE_BAND:
                {
                alt9=14;
                }
                break;
            case RULE_BOR:
                {
                alt9=15;
                }
                break;
            case RULE_HASH:
                {
                alt9=16;
                }
                break;
            case RULE_CARET:
                {
                alt9=17;
                }
                break;
            case RULE_EQUALS:
                {
                alt9=18;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt9=19;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt9=20;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt9=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:461:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:469:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:477:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:485:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:493:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:501:10: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue1024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_5, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:509:10: this_MINUS_6= RULE_MINUS
                    {
                    this_MINUS_6=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue1050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_6, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:517:10: this_PLUS_7= RULE_PLUS
                    {
                    this_PLUS_7=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue1076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_7, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:525:10: this_LPAREN_8= RULE_LPAREN
                    {
                    this_LPAREN_8=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue1102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_8, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:533:10: this_RPAREN_9= RULE_RPAREN
                    {
                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue1128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_9, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:541:10: this_RBRACE_10= RULE_RBRACE
                    {
                    this_RBRACE_10=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue1154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACE_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACE_10, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:549:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue1180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:557:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue1206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:565:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue1232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:573:10: this_BOR_14= RULE_BOR
                    {
                    this_BOR_14=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue1258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_14, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:581:10: this_HASH_15= RULE_HASH
                    {
                    this_HASH_15=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue1284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_15, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:589:10: this_CARET_16= RULE_CARET
                    {
                    this_CARET_16=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue1310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_16, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:597:10: this_EQUALS_17= RULE_EQUALS
                    {
                    this_EQUALS_17=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue1336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_17, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:605:10: this_LESS_THAN_18= RULE_LESS_THAN
                    {
                    this_LESS_THAN_18=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue1362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_18, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:613:10: this_MORE_THAN_19= RULE_MORE_THAN
                    {
                    this_MORE_THAN_19=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue1388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_19, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:621:10: this_ESC_CHAR_20= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_20=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue1414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_20, grammarAccess.getSqlValueAccess().getESC_CHARTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:628:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:628:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:648:23: (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR )
            	    int alt10=21;
            	    switch ( input.LA(1) ) {
            	    case RULE_REST:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case RULE_IDENT_DOT:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case RULE_IDENT:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case RULE_NUMBER:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case RULE_WS:
            	        {
            	        alt10=5;
            	        }
            	        break;
            	    case RULE_COMMA:
            	        {
            	        alt10=6;
            	        }
            	        break;
            	    case RULE_MINUS:
            	        {
            	        alt10=7;
            	        }
            	        break;
            	    case RULE_PLUS:
            	        {
            	        alt10=8;
            	        }
            	        break;
            	    case RULE_LPAREN:
            	        {
            	        alt10=9;
            	        }
            	        break;
            	    case RULE_RPAREN:
            	        {
            	        alt10=10;
            	        }
            	        break;
            	    case RULE_RBRACE:
            	        {
            	        alt10=11;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt10=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt10=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt10=14;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt10=15;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt10=16;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt10=17;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt10=18;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt10=19;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt10=20;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt10=21;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:648:28: this_REST_21= RULE_REST
            	            {
            	            this_REST_21=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleSqlValue1583); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_21);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_21, grammarAccess.getSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:656:10: this_IDENT_DOT_22= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_22=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue1609); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_22, grammarAccess.getSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:664:10: this_IDENT_23= RULE_IDENT
            	            {
            	            this_IDENT_23=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleSqlValue1635); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_23, grammarAccess.getSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:672:10: this_NUMBER_24= RULE_NUMBER
            	            {
            	            this_NUMBER_24=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSqlValue1661); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_24, grammarAccess.getSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:680:10: this_WS_25= RULE_WS
            	            {
            	            this_WS_25=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleSqlValue1687); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_25, grammarAccess.getSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:688:10: this_COMMA_26= RULE_COMMA
            	            {
            	            this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSqlValue1713); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_26, grammarAccess.getSqlValueAccess().getCOMMATerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:696:10: this_MINUS_27= RULE_MINUS
            	            {
            	            this_MINUS_27=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleSqlValue1739); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_27, grammarAccess.getSqlValueAccess().getMINUSTerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:704:10: this_PLUS_28= RULE_PLUS
            	            {
            	            this_PLUS_28=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleSqlValue1765); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_28, grammarAccess.getSqlValueAccess().getPLUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:712:10: this_LPAREN_29= RULE_LPAREN
            	            {
            	            this_LPAREN_29=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleSqlValue1791); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_29, grammarAccess.getSqlValueAccess().getLPARENTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:720:10: this_RPAREN_30= RULE_RPAREN
            	            {
            	            this_RPAREN_30=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleSqlValue1817); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_30, grammarAccess.getSqlValueAccess().getRPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:728:10: this_RBRACE_31= RULE_RBRACE
            	            {
            	            this_RBRACE_31=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleSqlValue1843); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RBRACE_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RBRACE_31, grammarAccess.getSqlValueAccess().getRBRACETerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:736:10: this_QUESTI_32= RULE_QUESTI
            	            {
            	            this_QUESTI_32=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleSqlValue1869); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_32, grammarAccess.getSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:744:10: this_NOT_33= RULE_NOT
            	            {
            	            this_NOT_33=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleSqlValue1895); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_33, grammarAccess.getSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:752:10: this_BAND_34= RULE_BAND
            	            {
            	            this_BAND_34=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleSqlValue1921); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_34, grammarAccess.getSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:760:10: this_BOR_35= RULE_BOR
            	            {
            	            this_BOR_35=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleSqlValue1947); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_35, grammarAccess.getSqlValueAccess().getBORTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:768:10: this_HASH_36= RULE_HASH
            	            {
            	            this_HASH_36=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleSqlValue1973); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_36, grammarAccess.getSqlValueAccess().getHASHTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:776:10: this_CARET_37= RULE_CARET
            	            {
            	            this_CARET_37=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleSqlValue1999); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_37, grammarAccess.getSqlValueAccess().getCARETTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:784:10: this_EQUALS_38= RULE_EQUALS
            	            {
            	            this_EQUALS_38=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleSqlValue2025); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_38, grammarAccess.getSqlValueAccess().getEQUALSTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:792:10: this_LESS_THAN_39= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_39=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleSqlValue2051); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_39, grammarAccess.getSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:800:10: this_MORE_THAN_40= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_40=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleSqlValue2077); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_40, grammarAccess.getSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:808:10: this_ESC_CHAR_41= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_41=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue2103); if (state.failed) return current;
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
            	    break loop11;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:823:1: entryRuleMetaSql returns [EObject current=null] : iv_ruleMetaSql= ruleMetaSql EOF ;
    public final EObject entryRuleMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:824:2: (iv_ruleMetaSql= ruleMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:825:2: iv_ruleMetaSql= ruleMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleMetaSql_in_entryRuleMetaSql2151);
            iv_ruleMetaSql=ruleMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaSql2161); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:832:1: ruleMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:835:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:836:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:836:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) | ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) ) | ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt17=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt17=2;
                }
                break;
            case RULE_BAND:
                {
                alt17=3;
                }
                break;
            case RULE_BOR:
                {
                alt17=4;
                }
                break;
            case RULE_EQUALS:
                {
                alt17=5;
                }
                break;
            case RULE_HASH:
                {
                alt17=6;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:836:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:836:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:836:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql2198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:840:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:841:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:841:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:842:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2218);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:858:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_BOR) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:858:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2230); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:862:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:863:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:863:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:864:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2250);
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
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:881:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:882:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:882:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:883:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleMetaSql2277); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:899:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:900:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:900:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:901:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleMetaSql2303);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:921:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:922:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:922:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:923:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2334);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:939:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_BOR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:939:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2346); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:943:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:944:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:944:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:945:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2366);
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
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:962:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:962:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:962:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:962:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:963:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:963:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:964:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleMetaSql2393); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:980:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:981:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:981:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:982:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2419);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:998:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_BOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:998:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2431); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1002:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1003:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1003:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1004:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2451);
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
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1021:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1021:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1021:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1021:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1022:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1022:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1023:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2478); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1039:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1040:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1040:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1041:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2504);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1057:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_BOR) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1057:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleMetaSql2516); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1061:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1062:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1062:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1063:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2536);
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
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:6: ( ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:7: ( (lv_type_18_0= RULE_EQUALS ) ) (this_WS_19= RULE_WS )* ( (lv_ftype_20_0= RULE_IDENT ) ) ( (lv_ifs_21_0= ruleIfSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1080:7: ( (lv_type_18_0= RULE_EQUALS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1081:1: (lv_type_18_0= RULE_EQUALS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1081:1: (lv_type_18_0= RULE_EQUALS )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1082:3: lv_type_18_0= RULE_EQUALS
                    {
                    lv_type_18_0=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMetaSql2563); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1098:2: (this_WS_19= RULE_WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1098:3: this_WS_19= RULE_WS
                    	    {
                    	    this_WS_19=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMetaSql2580); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WS_19, grammarAccess.getMetaSqlAccess().getWSTerminalRuleCall_4_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1102:3: ( (lv_ftype_20_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1103:1: (lv_ftype_20_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1103:1: (lv_ftype_20_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1104:3: lv_ftype_20_0= RULE_IDENT
                    {
                    lv_ftype_20_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMetaSql2598); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1120:2: ( (lv_ifs_21_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1121:1: (lv_ifs_21_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1121:1: (lv_ifs_21_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1122:3: lv_ifs_21_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getIfsIfSqlParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleMetaSql2624);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1139:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1139:6: ( ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1139:7: ( (lv_type_22_0= RULE_HASH ) ) this_NUMBER_23= RULE_NUMBER ( (lv_ord_24_0= ruleOrdSql ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1139:7: ( (lv_type_22_0= RULE_HASH ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1140:1: (lv_type_22_0= RULE_HASH )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1140:1: (lv_type_22_0= RULE_HASH )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1141:3: lv_type_22_0= RULE_HASH
                    {
                    lv_type_22_0=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleMetaSql2649); if (state.failed) return current;
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

                    this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMetaSql2665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_23, grammarAccess.getMetaSqlAccess().getNUMBERTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1161:1: ( (lv_ord_24_0= ruleOrdSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1162:1: (lv_ord_24_0= ruleOrdSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1162:1: (lv_ord_24_0= ruleOrdSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1163:3: lv_ord_24_0= ruleOrdSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaSqlAccess().getOrdOrdSqlParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSql_in_ruleMetaSql2685);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1187:1: entryRuleIfSql returns [EObject current=null] : iv_ruleIfSql= ruleIfSql EOF ;
    public final EObject entryRuleIfSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1188:2: (iv_ruleIfSql= ruleIfSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1189:2: iv_ruleIfSql= ruleIfSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfSql_in_entryRuleIfSql2722);
            iv_ruleIfSql=ruleIfSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSql2732); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1196:1: ruleIfSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ ;
    public final EObject ruleIfSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1199:28: ( ( (lv_sqls_0_0= ruleIfSqlFragment ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1200:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1200:1: ( (lv_sqls_0_0= ruleIfSqlFragment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WS && LA18_0<=RULE_LBRACE)||(LA18_0>=RULE_REST && LA18_0<=RULE_BAND)||(LA18_0>=RULE_HASH && LA18_0<=RULE_ESC_CHAR)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1201:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1201:1: (lv_sqls_0_0= ruleIfSqlFragment )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1202:3: lv_sqls_0_0= ruleIfSqlFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlAccess().getSqlsIfSqlFragmentParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlFragment_in_ruleIfSql2777);
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
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1226:1: entryRuleIfSqlFragment returns [EObject current=null] : iv_ruleIfSqlFragment= ruleIfSqlFragment EOF ;
    public final EObject entryRuleIfSqlFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlFragment = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1227:2: (iv_ruleIfSqlFragment= ruleIfSqlFragment EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1228:2: iv_ruleIfSqlFragment= ruleIfSqlFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment2813);
            iv_ruleIfSqlFragment=ruleIfSqlFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlFragment2823); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1235:1: ruleIfSqlFragment returns [EObject current=null] : ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1238:28: ( ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1239:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1239:1: ( ( (lv_value_0_0= ruleIfSqlValue ) ) | (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) ) | (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) ) | (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) ) | (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_IDENT:
            case RULE_LPAREN:
            case RULE_COMMA:
            case RULE_RPAREN:
            case RULE_EQUALS:
            case RULE_SEMICOLON:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_NUMBER:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_HASH:
            case RULE_CARET:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt19=1;
                }
                break;
            case RULE_AT:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_COLON:
                {
                alt19=4;
                }
                break;
            case RULE_LBRACE:
                {
                alt19=5;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1239:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1239:2: ( (lv_value_0_0= ruleIfSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1240:1: (lv_value_0_0= ruleIfSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1240:1: (lv_value_0_0= ruleIfSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1241:3: lv_value_0_0= ruleIfSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getValueIfSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment2869);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1258:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1258:6: (this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1258:7: this_AT_1= RULE_AT ( (lv_col_2_0= ruleColumn ) )
                    {
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleIfSqlFragment2887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getIfSqlFragmentAccess().getATTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1262:1: ( (lv_col_2_0= ruleColumn ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1263:1: (lv_col_2_0= ruleColumn )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1263:1: (lv_col_2_0= ruleColumn )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1264:3: lv_col_2_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getColColumnParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleColumn_in_ruleIfSqlFragment2907);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1281:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1281:6: (this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1281:7: this_STRING_3= RULE_STRING ( (lv_cnst_4_0= ruleConstant ) )
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlFragment2926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getIfSqlFragmentAccess().getSTRINGTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1285:1: ( (lv_cnst_4_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1286:1: (lv_cnst_4_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1286:1: (lv_cnst_4_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1287:3: lv_cnst_4_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getCnstConstantParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlFragment2946);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1304:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1304:6: (this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1304:7: this_COLON_5= RULE_COLON ( (lv_ident_6_0= ruleIdentifier ) )
                    {
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlFragment2965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getIfSqlFragmentAccess().getCOLONTerminalRuleCall_3_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1308:1: ( (lv_ident_6_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1309:1: (lv_ident_6_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1309:1: (lv_ident_6_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1310:3: lv_ident_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getIdentIdentifierParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlFragment2985);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1327:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1327:6: (this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1327:7: this_LBRACE_7= RULE_LBRACE ( (lv_meta_8_0= ruleIfMetaSql ) ) this_RBRACE_9= RULE_RBRACE
                    {
                    this_LBRACE_7=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment3004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_7, grammarAccess.getIfSqlFragmentAccess().getLBRACETerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1331:1: ( (lv_meta_8_0= ruleIfMetaSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1332:1: (lv_meta_8_0= ruleIfMetaSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1332:1: (lv_meta_8_0= ruleIfMetaSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1333:3: lv_meta_8_0= ruleIfMetaSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlFragmentAccess().getMetaIfMetaSqlParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment3024);
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

                    this_RBRACE_9=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment3035); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1361:1: entryRuleIfSqlValue returns [String current=null] : iv_ruleIfSqlValue= ruleIfSqlValue EOF ;
    public final String entryRuleIfSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1362:2: (iv_ruleIfSqlValue= ruleIfSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1363:2: iv_ruleIfSqlValue= ruleIfSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue3072);
            iv_ruleIfSqlValue=ruleIfSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlValue3083); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1370:1: ruleIfSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1373:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_QUESTI_11= RULE_QUESTI | this_NOT_12= RULE_NOT | this_BAND_13= RULE_BAND | this_HASH_14= RULE_HASH | this_CARET_15= RULE_CARET | this_EQUALS_16= RULE_EQUALS | this_LESS_THAN_17= RULE_LESS_THAN | this_MORE_THAN_18= RULE_MORE_THAN | this_ESC_CHAR_19= RULE_ESC_CHAR )
            int alt20=20;
            switch ( input.LA(1) ) {
            case RULE_REST:
                {
                alt20=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt20=2;
                }
                break;
            case RULE_IDENT:
                {
                alt20=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt20=4;
                }
                break;
            case RULE_WS:
                {
                alt20=5;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt20=6;
                }
                break;
            case RULE_COMMA:
                {
                alt20=7;
                }
                break;
            case RULE_MINUS:
                {
                alt20=8;
                }
                break;
            case RULE_PLUS:
                {
                alt20=9;
                }
                break;
            case RULE_LPAREN:
                {
                alt20=10;
                }
                break;
            case RULE_RPAREN:
                {
                alt20=11;
                }
                break;
            case RULE_QUESTI:
                {
                alt20=12;
                }
                break;
            case RULE_NOT:
                {
                alt20=13;
                }
                break;
            case RULE_BAND:
                {
                alt20=14;
                }
                break;
            case RULE_HASH:
                {
                alt20=15;
                }
                break;
            case RULE_CARET:
                {
                alt20=16;
                }
                break;
            case RULE_EQUALS:
                {
                alt20=17;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt20=18;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt20=19;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt20=20;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1374:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue3124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1382:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue3150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1390:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue3176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1398:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue3202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1406:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue3228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1414:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue3254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1422:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue3280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1430:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue3306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1438:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue3332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1446:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue3358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1454:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue3384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1462:10: this_QUESTI_11= RULE_QUESTI
                    {
                    this_QUESTI_11=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue3410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_11, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1470:10: this_NOT_12= RULE_NOT
                    {
                    this_NOT_12=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue3436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_12, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1478:10: this_BAND_13= RULE_BAND
                    {
                    this_BAND_13=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue3462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_13, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1486:10: this_HASH_14= RULE_HASH
                    {
                    this_HASH_14=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue3488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_14, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1494:10: this_CARET_15= RULE_CARET
                    {
                    this_CARET_15=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue3514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_15, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1502:10: this_EQUALS_16= RULE_EQUALS
                    {
                    this_EQUALS_16=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue3540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_16, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1510:10: this_LESS_THAN_17= RULE_LESS_THAN
                    {
                    this_LESS_THAN_17=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_17, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1518:10: this_MORE_THAN_18= RULE_MORE_THAN
                    {
                    this_MORE_THAN_18=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue3592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_18, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1526:10: this_ESC_CHAR_19= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_19=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue3618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_19, grammarAccess.getIfSqlValueAccess().getESC_CHARTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:23: (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR )
            	    int alt21=20;
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
            	    case RULE_WS:
            	        {
            	        alt21=5;
            	        }
            	        break;
            	    case RULE_SEMICOLON:
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
            	    case RULE_QUESTI:
            	        {
            	        alt21=12;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt21=13;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt21=14;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt21=15;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt21=16;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt21=17;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt21=18;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt21=19;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt21=20;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1552:28: this_REST_20= RULE_REST
            	            {
            	            this_REST_20=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleIfSqlValue3780); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_20);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_20, grammarAccess.getIfSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1560:10: this_IDENT_DOT_21= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_21=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue3806); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_21);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_21, grammarAccess.getIfSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1568:10: this_IDENT_22= RULE_IDENT
            	            {
            	            this_IDENT_22=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIfSqlValue3832); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_22);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_22, grammarAccess.getIfSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1576:10: this_NUMBER_23= RULE_NUMBER
            	            {
            	            this_NUMBER_23=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIfSqlValue3858); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_23, grammarAccess.getIfSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1584:10: this_WS_24= RULE_WS
            	            {
            	            this_WS_24=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlValue3884); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_24, grammarAccess.getIfSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1592:10: this_SEMICOLON_25= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_25=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue3910); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_25, grammarAccess.getIfSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1600:10: this_COMMA_26= RULE_COMMA
            	            {
            	            this_COMMA_26=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleIfSqlValue3936); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_26, grammarAccess.getIfSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1608:10: this_MINUS_27= RULE_MINUS
            	            {
            	            this_MINUS_27=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIfSqlValue3962); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_27, grammarAccess.getIfSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1616:10: this_PLUS_28= RULE_PLUS
            	            {
            	            this_PLUS_28=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIfSqlValue3988); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_28, grammarAccess.getIfSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1624:10: this_LPAREN_29= RULE_LPAREN
            	            {
            	            this_LPAREN_29=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlValue4014); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_29, grammarAccess.getIfSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1632:10: this_RPAREN_30= RULE_RPAREN
            	            {
            	            this_RPAREN_30=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlValue4040); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_30, grammarAccess.getIfSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1640:10: this_QUESTI_31= RULE_QUESTI
            	            {
            	            this_QUESTI_31=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfSqlValue4066); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_31, grammarAccess.getIfSqlValueAccess().getQUESTITerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1648:10: this_NOT_32= RULE_NOT
            	            {
            	            this_NOT_32=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlValue4092); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_32, grammarAccess.getIfSqlValueAccess().getNOTTerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1656:10: this_BAND_33= RULE_BAND
            	            {
            	            this_BAND_33=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfSqlValue4118); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_33, grammarAccess.getIfSqlValueAccess().getBANDTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1664:10: this_HASH_34= RULE_HASH
            	            {
            	            this_HASH_34=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleIfSqlValue4144); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_34, grammarAccess.getIfSqlValueAccess().getHASHTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1672:10: this_CARET_35= RULE_CARET
            	            {
            	            this_CARET_35=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIfSqlValue4170); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_35, grammarAccess.getIfSqlValueAccess().getCARETTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1680:10: this_EQUALS_36= RULE_EQUALS
            	            {
            	            this_EQUALS_36=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIfSqlValue4196); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_36, grammarAccess.getIfSqlValueAccess().getEQUALSTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1688:10: this_LESS_THAN_37= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_37=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue4222); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_37, grammarAccess.getIfSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1696:10: this_MORE_THAN_38= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_38=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue4248); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_38, grammarAccess.getIfSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1704:10: this_ESC_CHAR_39= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_39=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue4274); if (state.failed) return current;
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
            	    break loop22;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1719:1: entryRuleIfMetaSql returns [EObject current=null] : iv_ruleIfMetaSql= ruleIfMetaSql EOF ;
    public final EObject entryRuleIfMetaSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfMetaSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1720:2: (iv_ruleIfMetaSql= ruleIfMetaSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1721:2: iv_ruleIfMetaSql= ruleIfMetaSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfMetaSqlRule()); 
            }
            pushFollow(FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql4322);
            iv_ruleIfMetaSql=ruleIfMetaSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfMetaSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfMetaSql4332); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1728:1: ruleIfMetaSql returns [EObject current=null] : ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1731:28: ( ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1732:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1732:1: ( (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* ) | ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* ) | ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* ) | ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case RULE_WS:
                {
                alt27=1;
                }
                break;
            case RULE_QUESTI:
                {
                alt27=2;
                }
                break;
            case RULE_BAND:
                {
                alt27=3;
                }
                break;
            case RULE_BOR:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1732:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1732:2: (this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1732:3: this_WS_0= RULE_WS ( (lv_ifs_1_0= ruleIfSql ) ) (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfMetaSql4369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_0, grammarAccess.getIfMetaSqlAccess().getWSTerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1736:1: ( (lv_ifs_1_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1737:1: (lv_ifs_1_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1737:1: (lv_ifs_1_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1738:3: lv_ifs_1_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4389);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1754:2: (this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_BOR) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1754:3: this_BOR_2= RULE_BOR ( (lv_ifs_3_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4401); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_2, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_0_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1758:1: ( (lv_ifs_3_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1759:1: (lv_ifs_3_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1759:1: (lv_ifs_3_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1760:3: lv_ifs_3_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4421);
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
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:6: ( ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:7: ( (lv_type_4_0= RULE_QUESTI ) ) ( (lv_cond_5_0= ruleIfSqlCond ) ) this_BOR_6= RULE_BOR ( (lv_ifs_7_0= ruleIfSql ) ) (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1777:7: ( (lv_type_4_0= RULE_QUESTI ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1778:1: (lv_type_4_0= RULE_QUESTI )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1778:1: (lv_type_4_0= RULE_QUESTI )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1779:3: lv_type_4_0= RULE_QUESTI
                    {
                    lv_type_4_0=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleIfMetaSql4448); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1795:2: ( (lv_cond_5_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1796:1: (lv_cond_5_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1796:1: (lv_cond_5_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1797:3: lv_cond_5_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getCondIfSqlCondParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql4474);
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

                    this_BOR_6=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_6, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_2()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1817:1: ( (lv_ifs_7_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1818:1: (lv_ifs_7_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1818:1: (lv_ifs_7_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1819:3: lv_ifs_7_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4505);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:2: (this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_BOR) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1835:3: this_BOR_8= RULE_BOR ( (lv_ifs_9_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_8=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4517); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_8, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_1_4_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1839:1: ( (lv_ifs_9_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:1: (lv_ifs_9_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1840:1: (lv_ifs_9_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1841:3: lv_ifs_9_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_1_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4537);
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
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:6: ( ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:7: ( (lv_type_10_0= RULE_BAND ) ) ( (lv_ifs_11_0= ruleIfSql ) ) (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1858:7: ( (lv_type_10_0= RULE_BAND ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1859:1: (lv_type_10_0= RULE_BAND )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1859:1: (lv_type_10_0= RULE_BAND )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1860:3: lv_type_10_0= RULE_BAND
                    {
                    lv_type_10_0=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleIfMetaSql4564); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1876:2: ( (lv_ifs_11_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1877:1: (lv_ifs_11_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1877:1: (lv_ifs_11_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1878:3: lv_ifs_11_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4590);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1894:2: (this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_BOR) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1894:3: this_BOR_12= RULE_BOR ( (lv_ifs_13_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_12=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4602); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_12, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_2_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1898:1: ( (lv_ifs_13_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1899:1: (lv_ifs_13_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1899:1: (lv_ifs_13_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1900:3: lv_ifs_13_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4622);
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
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1917:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1917:6: ( ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )* )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1917:7: ( (lv_type_14_0= RULE_BOR ) ) ( (lv_ifs_15_0= ruleIfSql ) ) (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1917:7: ( (lv_type_14_0= RULE_BOR ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1918:1: (lv_type_14_0= RULE_BOR )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1918:1: (lv_type_14_0= RULE_BOR )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1919:3: lv_type_14_0= RULE_BOR
                    {
                    lv_type_14_0=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4649); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1935:2: ( (lv_ifs_15_0= ruleIfSql ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1936:1: (lv_ifs_15_0= ruleIfSql )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1936:1: (lv_ifs_15_0= ruleIfSql )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1937:3: lv_ifs_15_0= ruleIfSql
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4675);
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1953:2: (this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_BOR) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1953:3: this_BOR_16= RULE_BOR ( (lv_ifs_17_0= ruleIfSql ) )
                    	    {
                    	    this_BOR_16=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleIfMetaSql4687); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_BOR_16, grammarAccess.getIfMetaSqlAccess().getBORTerminalRuleCall_3_2_0()); 
                    	          
                    	    }
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1957:1: ( (lv_ifs_17_0= ruleIfSql ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1958:1: (lv_ifs_17_0= ruleIfSql )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1958:1: (lv_ifs_17_0= ruleIfSql )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1959:3: lv_ifs_17_0= ruleIfSql
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfMetaSqlAccess().getIfsIfSqlParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleIfSql_in_ruleIfMetaSql4707);
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
                    	    break loop26;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1983:1: entryRuleIfSqlCond returns [EObject current=null] : iv_ruleIfSqlCond= ruleIfSqlCond EOF ;
    public final EObject entryRuleIfSqlCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlCond = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1984:2: (iv_ruleIfSqlCond= ruleIfSqlCond EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1985:2: iv_ruleIfSqlCond= ruleIfSqlCond EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlCondRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond4746);
            iv_ruleIfSqlCond=ruleIfSqlCond();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlCond; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlCond4756); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1992:1: ruleIfSqlCond returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1995:28: ( ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1996:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1996:1: ( (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1996:2: (this_WS_0= RULE_WS )* ( (lv_bool1_1_0= ruleIfSqlBool ) ) (this_WS_2= RULE_WS )* ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1996:2: (this_WS_0= RULE_WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1996:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond4793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2000:3: ( (lv_bool1_1_0= ruleIfSqlBool ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2001:1: (lv_bool1_1_0= ruleIfSqlBool )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2001:1: (lv_bool1_1_0= ruleIfSqlBool )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2002:3: lv_bool1_1_0= ruleIfSqlBool
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool1IfSqlBoolParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond4815);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2018:2: (this_WS_2= RULE_WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2018:3: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond4827); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2022:3: ( ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )* )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_AND && LA33_0<=RULE_OR)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2022:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) ) (this_WS_4= RULE_WS )* ( (lv_bool2_5_0= ruleIfSqlBool ) ) (this_WS_6= RULE_WS )*
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2022:4: ( ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2023:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2023:1: ( (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2024:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2024:1: (lv_oper_3_1= RULE_AND | lv_oper_3_2= RULE_OR )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==RULE_AND) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==RULE_OR) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2025:3: lv_oper_3_1= RULE_AND
            	            {
            	            lv_oper_3_1=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleIfSqlCond4848); if (state.failed) return current;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2040:8: lv_oper_3_2= RULE_OR
            	            {
            	            lv_oper_3_2=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleIfSqlCond4868); if (state.failed) return current;
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2058:2: (this_WS_4= RULE_WS )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==RULE_WS) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2058:3: this_WS_4= RULE_WS
            	    	    {
            	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond4888); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_4, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2062:3: ( (lv_bool2_5_0= ruleIfSqlBool ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2063:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2063:1: (lv_bool2_5_0= ruleIfSqlBool )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2064:3: lv_bool2_5_0= ruleIfSqlBool
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfSqlCondAccess().getBool2IfSqlBoolParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond4910);
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

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2080:2: (this_WS_6= RULE_WS )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==RULE_WS) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2080:3: this_WS_6= RULE_WS
            	    	    {
            	    	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleIfSqlCond4922); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_6, grammarAccess.getIfSqlCondAccess().getWSTerminalRuleCall_3_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2092:1: entryRuleIfSqlBool returns [EObject current=null] : iv_ruleIfSqlBool= ruleIfSqlBool EOF ;
    public final EObject entryRuleIfSqlBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfSqlBool = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2093:2: (iv_ruleIfSqlBool= ruleIfSqlBool EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2094:2: iv_ruleIfSqlBool= ruleIfSqlBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfSqlBoolRule()); 
            }
            pushFollow(FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool4961);
            iv_ruleIfSqlBool=ruleIfSqlBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfSqlBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfSqlBool4971); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2101:1: ruleIfSqlBool returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2104:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) ) | ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_NOT:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt37=1;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt37=3;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt37=1;
                }
                break;
            case RULE_COLON:
                {
                alt37=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt37=3;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:2: ( ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:3: ( (lv_not_0_0= RULE_NOT ) )? this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2105:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_NOT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2106:1: (lv_not_0_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2106:1: (lv_not_0_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2107:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool5014); if (state.failed) return current;
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

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIfSqlBool5031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIfSqlBoolAccess().getSTRINGTerminalRuleCall_0_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2127:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2128:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2128:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2129:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCnstConstantParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleIfSqlBool5051);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2146:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2146:6: ( ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2146:7: ( (lv_not_3_0= RULE_NOT ) )? this_COLON_4= RULE_COLON ( (lv_ident_5_0= ruleIdentifier ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2146:7: ( (lv_not_3_0= RULE_NOT ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_NOT) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2147:1: (lv_not_3_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2147:1: (lv_not_3_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2148:3: lv_not_3_0= RULE_NOT
                            {
                            lv_not_3_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool5076); if (state.failed) return current;
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

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleIfSqlBool5093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getIfSqlBoolAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2168:1: ( (lv_ident_5_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2169:1: (lv_ident_5_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2169:1: (lv_ident_5_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2170:3: lv_ident_5_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getIdentIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleIfSqlBool5113);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2187:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2187:6: ( ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2187:7: ( (lv_not_6_0= RULE_NOT ) )? this_LPAREN_7= RULE_LPAREN ( (lv_cond_8_0= ruleIfSqlCond ) ) this_RPAREN_9= RULE_RPAREN
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2187:7: ( (lv_not_6_0= RULE_NOT ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_NOT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2188:1: (lv_not_6_0= RULE_NOT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2188:1: (lv_not_6_0= RULE_NOT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2189:3: lv_not_6_0= RULE_NOT
                            {
                            lv_not_6_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleIfSqlBool5138); if (state.failed) return current;
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

                    this_LPAREN_7=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleIfSqlBool5155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_7, grammarAccess.getIfSqlBoolAccess().getLPARENTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2209:1: ( (lv_cond_8_0= ruleIfSqlCond ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2210:1: (lv_cond_8_0= ruleIfSqlCond )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2210:1: (lv_cond_8_0= ruleIfSqlCond )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2211:3: lv_cond_8_0= ruleIfSqlCond
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfSqlBoolAccess().getCondIfSqlCondParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool5175);
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

                    this_RPAREN_9=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleIfSqlBool5186); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2239:1: entryRuleOrdSql returns [EObject current=null] : iv_ruleOrdSql= ruleOrdSql EOF ;
    public final EObject entryRuleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2240:2: (iv_ruleOrdSql= ruleOrdSql EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2241:2: iv_ruleOrdSql= ruleOrdSql EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql_in_entryRuleOrdSql5222);
            iv_ruleOrdSql=ruleOrdSql();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql5232); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2248:1: ruleOrdSql returns [EObject current=null] : ( (lv_sqls_0_0= ruleOrdSql2 ) )+ ;
    public final EObject ruleOrdSql() throws RecognitionException {
        EObject current = null;

        EObject lv_sqls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2251:28: ( ( (lv_sqls_0_0= ruleOrdSql2 ) )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2252:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2252:1: ( (lv_sqls_0_0= ruleOrdSql2 ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_WS && LA38_0<=RULE_LBRACE)||(LA38_0>=RULE_REST && LA38_0<=RULE_ESC_CHAR)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2253:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2253:1: (lv_sqls_0_0= ruleOrdSql2 )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2254:3: lv_sqls_0_0= ruleOrdSql2
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrdSqlAccess().getSqlsOrdSql2ParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrdSql2_in_ruleOrdSql5277);
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
    // $ANTLR end "ruleOrdSql"


    // $ANTLR start "entryRuleOrdSql2"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2278:1: entryRuleOrdSql2 returns [EObject current=null] : iv_ruleOrdSql2= ruleOrdSql2 EOF ;
    public final EObject entryRuleOrdSql2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdSql2 = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2279:2: (iv_ruleOrdSql2= ruleOrdSql2 EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2280:2: iv_ruleOrdSql2= ruleOrdSql2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSql2Rule()); 
            }
            pushFollow(FOLLOW_ruleOrdSql2_in_entryRuleOrdSql25313);
            iv_ruleOrdSql2=ruleOrdSql2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSql2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSql25323); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2287:1: ruleOrdSql2 returns [EObject current=null] : ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) ) ;
    public final EObject ruleOrdSql2() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        Token this_COLON_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_cnst_2_0 = null;

        EObject lv_ident_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2290:28: ( ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:1: ( ( (lv_value_0_0= ruleOrdSqlValue ) ) | (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) ) | (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_WS:
            case RULE_IDENT:
            case RULE_LPAREN:
            case RULE_COMMA:
            case RULE_RPAREN:
            case RULE_EQUALS:
            case RULE_SEMICOLON:
            case RULE_AT:
            case RULE_LBRACE:
            case RULE_REST:
            case RULE_IDENT_DOT:
            case RULE_NUMBER:
            case RULE_MINUS:
            case RULE_PLUS:
            case RULE_QUESTI:
            case RULE_NOT:
            case RULE_BAND:
            case RULE_BOR:
            case RULE_HASH:
            case RULE_CARET:
            case RULE_LESS_THAN:
            case RULE_MORE_THAN:
            case RULE_ESC_CHAR:
                {
                alt39=1;
                }
                break;
            case RULE_STRING:
                {
                alt39=2;
                }
                break;
            case RULE_COLON:
                {
                alt39=3;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2291:2: ( (lv_value_0_0= ruleOrdSqlValue ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2292:1: (lv_value_0_0= ruleOrdSqlValue )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2292:1: (lv_value_0_0= ruleOrdSqlValue )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2293:3: lv_value_0_0= ruleOrdSqlValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getValueOrdSqlValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrdSqlValue_in_ruleOrdSql25369);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2310:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2310:6: (this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2310:7: this_STRING_1= RULE_STRING ( (lv_cnst_2_0= ruleConstant ) )
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOrdSql25387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getOrdSql2Access().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2314:1: ( (lv_cnst_2_0= ruleConstant ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:1: (lv_cnst_2_0= ruleConstant )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2315:1: (lv_cnst_2_0= ruleConstant )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2316:3: lv_cnst_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getCnstConstantParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleOrdSql25407);
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2333:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2333:6: (this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2333:7: this_COLON_3= RULE_COLON ( (lv_ident_4_0= ruleIdentifier ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleOrdSql25426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getOrdSql2Access().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2337:1: ( (lv_ident_4_0= ruleIdentifier ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2338:1: (lv_ident_4_0= ruleIdentifier )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2338:1: (lv_ident_4_0= ruleIdentifier )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2339:3: lv_ident_4_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrdSql2Access().getIdentIdentifierParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleOrdSql25446);
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2363:1: entryRuleOrdSqlValue returns [String current=null] : iv_ruleOrdSqlValue= ruleOrdSqlValue EOF ;
    public final String entryRuleOrdSqlValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrdSqlValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2364:2: (iv_ruleOrdSqlValue= ruleOrdSqlValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2365:2: iv_ruleOrdSqlValue= ruleOrdSqlValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrdSqlValueRule()); 
            }
            pushFollow(FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue5484);
            iv_ruleOrdSqlValue=ruleOrdSqlValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrdSqlValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrdSqlValue5495); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2372:1: ruleOrdSqlValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2375:28: ( ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:1: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR ) ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:2: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_SEMICOLON_5= RULE_SEMICOLON | this_COMMA_6= RULE_COMMA | this_MINUS_7= RULE_MINUS | this_PLUS_8= RULE_PLUS | this_LPAREN_9= RULE_LPAREN | this_RPAREN_10= RULE_RPAREN | this_LBRACE_11= RULE_LBRACE | this_QUESTI_12= RULE_QUESTI | this_NOT_13= RULE_NOT | this_BAND_14= RULE_BAND | this_BOR_15= RULE_BOR | this_HASH_16= RULE_HASH | this_AT_17= RULE_AT | this_CARET_18= RULE_CARET | this_EQUALS_19= RULE_EQUALS | this_LESS_THAN_20= RULE_LESS_THAN | this_MORE_THAN_21= RULE_MORE_THAN | this_ESC_CHAR_22= RULE_ESC_CHAR )
            int alt40=23;
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
            case RULE_LBRACE:
                {
                alt40=12;
                }
                break;
            case RULE_QUESTI:
                {
                alt40=13;
                }
                break;
            case RULE_NOT:
                {
                alt40=14;
                }
                break;
            case RULE_BAND:
                {
                alt40=15;
                }
                break;
            case RULE_BOR:
                {
                alt40=16;
                }
                break;
            case RULE_HASH:
                {
                alt40=17;
                }
                break;
            case RULE_AT:
                {
                alt40=18;
                }
                break;
            case RULE_CARET:
                {
                alt40=19;
                }
                break;
            case RULE_EQUALS:
                {
                alt40=20;
                }
                break;
            case RULE_LESS_THAN:
                {
                alt40=21;
                }
                break;
            case RULE_MORE_THAN:
                {
                alt40=22;
                }
                break;
            case RULE_ESC_CHAR:
                {
                alt40=23;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2376:7: this_REST_0= RULE_REST
                    {
                    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue5536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_REST_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_REST_0, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2384:10: this_IDENT_DOT_1= RULE_IDENT_DOT
                    {
                    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue5562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_DOT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_DOT_1, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2392:10: this_IDENT_2= RULE_IDENT
                    {
                    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue5588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IDENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IDENT_2, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2400:10: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue5614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMBER_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMBER_3, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_0_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2408:10: this_WS_4= RULE_WS
                    {
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue5640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WS_4, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_0_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2416:10: this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue5666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SEMICOLON_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_0_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2424:10: this_COMMA_6= RULE_COMMA
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue5692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMMA_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_0_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2432:10: this_MINUS_7= RULE_MINUS
                    {
                    this_MINUS_7=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue5718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MINUS_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_7, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_0_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2440:10: this_PLUS_8= RULE_PLUS
                    {
                    this_PLUS_8=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue5744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_8, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_0_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2448:10: this_LPAREN_9= RULE_LPAREN
                    {
                    this_LPAREN_9=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue5770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LPAREN_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_9, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_0_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2456:10: this_RPAREN_10= RULE_RPAREN
                    {
                    this_RPAREN_10=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue5796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RPAREN_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_10, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_0_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2464:10: this_LBRACE_11= RULE_LBRACE
                    {
                    this_LBRACE_11=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue5822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACE_11, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_0_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2472:10: this_QUESTI_12= RULE_QUESTI
                    {
                    this_QUESTI_12=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue5848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUESTI_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTI_12, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_0_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2480:10: this_NOT_13= RULE_NOT
                    {
                    this_NOT_13=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue5874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NOT_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NOT_13, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_0_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2488:10: this_BAND_14= RULE_BAND
                    {
                    this_BAND_14=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue5900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BAND_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BAND_14, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_0_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2496:10: this_BOR_15= RULE_BOR
                    {
                    this_BOR_15=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue5926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOR_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOR_15, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_0_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2504:10: this_HASH_16= RULE_HASH
                    {
                    this_HASH_16=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue5952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HASH_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HASH_16, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_0_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2512:10: this_AT_17= RULE_AT
                    {
                    this_AT_17=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue5978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AT_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_17, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_0_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2520:10: this_CARET_18= RULE_CARET
                    {
                    this_CARET_18=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue6004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CARET_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_18, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_0_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2528:10: this_EQUALS_19= RULE_EQUALS
                    {
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue6030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_19, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_0_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2536:10: this_LESS_THAN_20= RULE_LESS_THAN
                    {
                    this_LESS_THAN_20=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue6056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LESS_THAN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LESS_THAN_20, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_0_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2544:10: this_MORE_THAN_21= RULE_MORE_THAN
                    {
                    this_MORE_THAN_21=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue6082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MORE_THAN_21);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MORE_THAN_21, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_0_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2552:10: this_ESC_CHAR_22= RULE_ESC_CHAR
                    {
                    this_ESC_CHAR_22=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue6108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESC_CHAR_22);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESC_CHAR_22, grammarAccess.getOrdSqlValueAccess().getESC_CHARTerminalRuleCall_0_22()); 
                          
                    }

                    }
                    break;

            }

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2581:23: (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR )
            	    int alt41=23;
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
            	    case RULE_LBRACE:
            	        {
            	        alt41=12;
            	        }
            	        break;
            	    case RULE_QUESTI:
            	        {
            	        alt41=13;
            	        }
            	        break;
            	    case RULE_NOT:
            	        {
            	        alt41=14;
            	        }
            	        break;
            	    case RULE_BAND:
            	        {
            	        alt41=15;
            	        }
            	        break;
            	    case RULE_BOR:
            	        {
            	        alt41=16;
            	        }
            	        break;
            	    case RULE_HASH:
            	        {
            	        alt41=17;
            	        }
            	        break;
            	    case RULE_AT:
            	        {
            	        alt41=18;
            	        }
            	        break;
            	    case RULE_CARET:
            	        {
            	        alt41=19;
            	        }
            	        break;
            	    case RULE_EQUALS:
            	        {
            	        alt41=20;
            	        }
            	        break;
            	    case RULE_LESS_THAN:
            	        {
            	        alt41=21;
            	        }
            	        break;
            	    case RULE_MORE_THAN:
            	        {
            	        alt41=22;
            	        }
            	        break;
            	    case RULE_ESC_CHAR:
            	        {
            	        alt41=23;
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2581:28: this_REST_23= RULE_REST
            	            {
            	            this_REST_23=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleOrdSqlValue6291); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_REST_23);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_REST_23, grammarAccess.getOrdSqlValueAccess().getRESTTerminalRuleCall_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2589:10: this_IDENT_DOT_24= RULE_IDENT_DOT
            	            {
            	            this_IDENT_DOT_24=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue6317); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_DOT_24);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_DOT_24, grammarAccess.getOrdSqlValueAccess().getIDENT_DOTTerminalRuleCall_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2597:10: this_IDENT_25= RULE_IDENT
            	            {
            	            this_IDENT_25=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOrdSqlValue6343); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_IDENT_25);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_IDENT_25, grammarAccess.getOrdSqlValueAccess().getIDENTTerminalRuleCall_1_0_2()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2605:10: this_NUMBER_26= RULE_NUMBER
            	            {
            	            this_NUMBER_26=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue6369); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NUMBER_26);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NUMBER_26, grammarAccess.getOrdSqlValueAccess().getNUMBERTerminalRuleCall_1_0_3()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2613:10: this_WS_27= RULE_WS
            	            {
            	            this_WS_27=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleOrdSqlValue6395); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_WS_27);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_WS_27, grammarAccess.getOrdSqlValueAccess().getWSTerminalRuleCall_1_0_4()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2621:10: this_SEMICOLON_28= RULE_SEMICOLON
            	            {
            	            this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue6421); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_SEMICOLON_28);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_SEMICOLON_28, grammarAccess.getOrdSqlValueAccess().getSEMICOLONTerminalRuleCall_1_0_5()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2629:10: this_COMMA_29= RULE_COMMA
            	            {
            	            this_COMMA_29=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOrdSqlValue6447); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_COMMA_29);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COMMA_29, grammarAccess.getOrdSqlValueAccess().getCOMMATerminalRuleCall_1_0_6()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2637:10: this_MINUS_30= RULE_MINUS
            	            {
            	            this_MINUS_30=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOrdSqlValue6473); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MINUS_30);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MINUS_30, grammarAccess.getOrdSqlValueAccess().getMINUSTerminalRuleCall_1_0_7()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2645:10: this_PLUS_31= RULE_PLUS
            	            {
            	            this_PLUS_31=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOrdSqlValue6499); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_PLUS_31);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_PLUS_31, grammarAccess.getOrdSqlValueAccess().getPLUSTerminalRuleCall_1_0_8()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2653:10: this_LPAREN_32= RULE_LPAREN
            	            {
            	            this_LPAREN_32=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue6525); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LPAREN_32);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LPAREN_32, grammarAccess.getOrdSqlValueAccess().getLPARENTerminalRuleCall_1_0_9()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2661:10: this_RPAREN_33= RULE_RPAREN
            	            {
            	            this_RPAREN_33=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue6551); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_RPAREN_33);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_RPAREN_33, grammarAccess.getOrdSqlValueAccess().getRPARENTerminalRuleCall_1_0_10()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2669:10: this_LBRACE_34= RULE_LBRACE
            	            {
            	            this_LBRACE_34=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue6577); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LBRACE_34);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LBRACE_34, grammarAccess.getOrdSqlValueAccess().getLBRACETerminalRuleCall_1_0_11()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 13 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2677:10: this_QUESTI_35= RULE_QUESTI
            	            {
            	            this_QUESTI_35=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue6603); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_QUESTI_35);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_QUESTI_35, grammarAccess.getOrdSqlValueAccess().getQUESTITerminalRuleCall_1_0_12()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 14 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2685:10: this_NOT_36= RULE_NOT
            	            {
            	            this_NOT_36=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleOrdSqlValue6629); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_NOT_36);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_NOT_36, grammarAccess.getOrdSqlValueAccess().getNOTTerminalRuleCall_1_0_13()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 15 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2693:10: this_BAND_37= RULE_BAND
            	            {
            	            this_BAND_37=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleOrdSqlValue6655); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BAND_37);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BAND_37, grammarAccess.getOrdSqlValueAccess().getBANDTerminalRuleCall_1_0_14()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 16 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2701:10: this_BOR_38= RULE_BOR
            	            {
            	            this_BOR_38=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleOrdSqlValue6681); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_BOR_38);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_BOR_38, grammarAccess.getOrdSqlValueAccess().getBORTerminalRuleCall_1_0_15()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 17 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2709:10: this_HASH_39= RULE_HASH
            	            {
            	            this_HASH_39=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleOrdSqlValue6707); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_HASH_39);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_HASH_39, grammarAccess.getOrdSqlValueAccess().getHASHTerminalRuleCall_1_0_16()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 18 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2717:10: this_AT_40= RULE_AT
            	            {
            	            this_AT_40=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleOrdSqlValue6733); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_AT_40);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_AT_40, grammarAccess.getOrdSqlValueAccess().getATTerminalRuleCall_1_0_17()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 19 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2725:10: this_CARET_41= RULE_CARET
            	            {
            	            this_CARET_41=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleOrdSqlValue6759); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_CARET_41);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_CARET_41, grammarAccess.getOrdSqlValueAccess().getCARETTerminalRuleCall_1_0_18()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 20 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2733:10: this_EQUALS_42= RULE_EQUALS
            	            {
            	            this_EQUALS_42=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue6785); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_EQUALS_42);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_42, grammarAccess.getOrdSqlValueAccess().getEQUALSTerminalRuleCall_1_0_19()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 21 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2741:10: this_LESS_THAN_43= RULE_LESS_THAN
            	            {
            	            this_LESS_THAN_43=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue6811); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LESS_THAN_43);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LESS_THAN_43, grammarAccess.getOrdSqlValueAccess().getLESS_THANTerminalRuleCall_1_0_20()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 22 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2749:10: this_MORE_THAN_44= RULE_MORE_THAN
            	            {
            	            this_MORE_THAN_44=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue6837); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_MORE_THAN_44);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_MORE_THAN_44, grammarAccess.getOrdSqlValueAccess().getMORE_THANTerminalRuleCall_1_0_21()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 23 :
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2757:10: this_ESC_CHAR_45= RULE_ESC_CHAR
            	            {
            	            this_ESC_CHAR_45=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue6863); if (state.failed) return current;
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
    // $ANTLR end "ruleOrdSqlValue"


    // $ANTLR start "entryRuleColumn"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2772:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2773:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2774:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn6911);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn6921); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2781:1: ruleColumn returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2784:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2785:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2785:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2785:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2785:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2786:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2787:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT | lv_name_0_3= RULE_NUMBER )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_IDENT:
                {
                alt43=1;
                }
                break;
            case RULE_IDENT_DOT:
                {
                alt43=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt43=3;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2788:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn6965); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2803:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleColumn6985); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2818:8: lv_name_0_3= RULE_NUMBER
                    {
                    lv_name_0_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn7005); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:2: ( ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_CARET) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_IDENT) ) {
                    int LA46_3 = input.LA(3);

                    if ( (synpred4_InternalProcessorDsl()) ) {
                        alt46=1;
                    }
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET ) ( (lv_type_2_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:3: ( ( RULE_CARET )=>this_CARET_1= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:4: ( RULE_CARET )=>this_CARET_1= RULE_CARET
                    {
                    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn7031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_1, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2840:2: ( (lv_type_2_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2841:1: (lv_type_2_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2841:1: (lv_type_2_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2842:3: lv_type_2_0= RULE_IDENT
                    {
                    lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn7048); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_CARET) ) {
                            int LA45_2 = input.LA(2);

                            if ( (LA45_2==RULE_IDENT) ) {
                                int LA45_3 = input.LA(3);

                                if ( (synpred5_InternalProcessorDsl()) ) {
                                    alt45=1;
                                }


                            }
                            else if ( (LA45_2==RULE_NUMBER) ) {
                                int LA45_4 = input.LA(3);

                                if ( (synpred5_InternalProcessorDsl()) ) {
                                    alt45=1;
                                }


                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    	    {
                    	    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleColumn7071); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_3, grammarAccess.getColumnAccess().getCARETTerminalRuleCall_1_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2862:2: ( ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2863:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2863:1: ( (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2864:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2864:1: (lv_vals_4_1= RULE_IDENT | lv_vals_4_2= RULE_NUMBER )
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==RULE_IDENT) ) {
                    	        alt44=1;
                    	    }
                    	    else if ( (LA44_0==RULE_NUMBER) ) {
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2865:3: lv_vals_4_1= RULE_IDENT
                    	            {
                    	            lv_vals_4_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleColumn7090); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2880:8: lv_vals_4_2= RULE_NUMBER
                    	            {
                    	            lv_vals_4_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleColumn7110); if (state.failed) return current;
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
                    	    break loop45;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2906:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2907:2: (iv_ruleConstant= ruleConstant EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2908:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant7158);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant7168); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2915:1: ruleConstant returns [EObject current=null] : ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2918:28: ( ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2919:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2919:1: ( ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2919:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )? ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) ) ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2919:2: ( ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_MINUS && LA48_0<=RULE_PLUS)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2920:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2920:1: ( (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2921:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2921:1: (lv_case_0_1= RULE_PLUS | lv_case_0_2= RULE_MINUS )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_PLUS) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_MINUS) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2922:3: lv_case_0_1= RULE_PLUS
                            {
                            lv_case_0_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleConstant7212); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2937:8: lv_case_0_2= RULE_MINUS
                            {
                            lv_case_0_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleConstant7232); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2955:3: ( ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2956:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2956:1: ( (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2957:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2957:1: (lv_name_1_1= RULE_IDENT | lv_name_1_2= RULE_IDENT_DOT )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_IDENT) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_IDENT_DOT) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2958:3: lv_name_1_1= RULE_IDENT
                    {
                    lv_name_1_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant7260); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2973:8: lv_name_1_2= RULE_IDENT_DOT
                    {
                    lv_name_1_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleConstant7280); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:2: ( ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_CARET) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_IDENT) ) {
                    int LA52_3 = input.LA(3);

                    if ( (synpred6_InternalProcessorDsl()) ) {
                        alt52=1;
                    }
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET ) ( (lv_type_3_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:3: ( ( RULE_CARET )=>this_CARET_2= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:4: ( RULE_CARET )=>this_CARET_2= RULE_CARET
                    {
                    this_CARET_2=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant7306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_2, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2995:2: ( (lv_type_3_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:1: (lv_type_3_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2996:1: (lv_type_3_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2997:3: lv_type_3_0= RULE_IDENT
                    {
                    lv_type_3_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant7323); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:2: ( ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==RULE_CARET) ) {
                            int LA51_2 = input.LA(2);

                            if ( (LA51_2==RULE_IDENT) ) {
                                int LA51_3 = input.LA(3);

                                if ( (synpred7_InternalProcessorDsl()) ) {
                                    alt51=1;
                                }


                            }
                            else if ( (LA51_2==RULE_NUMBER) ) {
                                int LA51_4 = input.LA(3);

                                if ( (synpred7_InternalProcessorDsl()) ) {
                                    alt51=1;
                                }


                            }


                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET ) ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:3: ( ( RULE_CARET )=>this_CARET_4= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:4: ( RULE_CARET )=>this_CARET_4= RULE_CARET
                    	    {
                    	    this_CARET_4=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleConstant7346); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_4, grammarAccess.getConstantAccess().getCARETTerminalRuleCall_2_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3017:2: ( ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3018:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3018:1: ( (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3019:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3019:1: (lv_vals_5_1= RULE_IDENT | lv_vals_5_2= RULE_NUMBER )
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( (LA50_0==RULE_IDENT) ) {
                    	        alt50=1;
                    	    }
                    	    else if ( (LA50_0==RULE_NUMBER) ) {
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3020:3: lv_vals_5_1= RULE_IDENT
                    	            {
                    	            lv_vals_5_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleConstant7365); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3035:8: lv_vals_5_2= RULE_NUMBER
                    	            {
                    	            lv_vals_5_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstant7385); if (state.failed) return current;
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
                    	    break loop51;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3061:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3062:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3063:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier7433);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier7443); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3070:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3073:28: ( ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3074:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3074:1: ( ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3074:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )? ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )? ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) ) ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3074:2: ( ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_EQUALS||(LA54_0>=RULE_LESS_THAN && LA54_0<=RULE_MORE_THAN)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3075:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3075:1: ( (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3076:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3076:1: (lv_mode_0_1= RULE_EQUALS | lv_mode_0_2= RULE_LESS_THAN | lv_mode_0_3= RULE_MORE_THAN )
                    int alt53=3;
                    switch ( input.LA(1) ) {
                    case RULE_EQUALS:
                        {
                        alt53=1;
                        }
                        break;
                    case RULE_LESS_THAN:
                        {
                        alt53=2;
                        }
                        break;
                    case RULE_MORE_THAN:
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3077:3: lv_mode_0_1= RULE_EQUALS
                            {
                            lv_mode_0_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleIdentifier7487); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3092:8: lv_mode_0_2= RULE_LESS_THAN
                            {
                            lv_mode_0_2=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleIdentifier7507); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3107:8: lv_mode_0_3= RULE_MORE_THAN
                            {
                            lv_mode_0_3=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleIdentifier7527); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3125:3: ( ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_MINUS && LA56_0<=RULE_PLUS)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3126:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3126:1: ( (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3127:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3127:1: (lv_case_1_1= RULE_PLUS | lv_case_1_2= RULE_MINUS )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_PLUS) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_MINUS) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3128:3: lv_case_1_1= RULE_PLUS
                            {
                            lv_case_1_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleIdentifier7555); if (state.failed) return current;
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
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3143:8: lv_case_1_2= RULE_MINUS
                            {
                            lv_case_1_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleIdentifier7575); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3161:3: ( ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3162:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3162:1: ( (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3163:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3163:1: (lv_name_2_1= RULE_IDENT | lv_name_2_2= RULE_IDENT_DOT | lv_name_2_3= RULE_NUMBER )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3164:3: lv_name_2_1= RULE_IDENT
                    {
                    lv_name_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier7603); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3179:8: lv_name_2_2= RULE_IDENT_DOT
                    {
                    lv_name_2_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier7623); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3194:8: lv_name_2_3= RULE_NUMBER
                    {
                    lv_name_2_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier7643); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:2: ( ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_CARET) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_IDENT) ) {
                    int LA60_3 = input.LA(3);

                    if ( (synpred8_InternalProcessorDsl()) ) {
                        alt60=1;
                    }
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET ) ( (lv_type_4_0= RULE_IDENT ) ) ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:3: ( ( RULE_CARET )=>this_CARET_3= RULE_CARET )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:4: ( RULE_CARET )=>this_CARET_3= RULE_CARET
                    {
                    this_CARET_3=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier7669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CARET_3, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_0()); 
                          
                    }

                    }

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3216:2: ( (lv_type_4_0= RULE_IDENT ) )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3217:1: (lv_type_4_0= RULE_IDENT )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3217:1: (lv_type_4_0= RULE_IDENT )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3218:3: lv_type_4_0= RULE_IDENT
                    {
                    lv_type_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier7686); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:2: ( ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_CARET) ) {
                            int LA59_2 = input.LA(2);

                            if ( (LA59_2==RULE_IDENT) ) {
                                int LA59_3 = input.LA(3);

                                if ( (synpred9_InternalProcessorDsl()) ) {
                                    alt59=1;
                                }


                            }
                            else if ( (LA59_2==RULE_NUMBER) ) {
                                int LA59_4 = input.LA(3);

                                if ( (synpred9_InternalProcessorDsl()) ) {
                                    alt59=1;
                                }


                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET ) ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:3: ( ( RULE_CARET )=>this_CARET_5= RULE_CARET )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:4: ( RULE_CARET )=>this_CARET_5= RULE_CARET
                    	    {
                    	    this_CARET_5=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleIdentifier7709); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_CARET_5, grammarAccess.getIdentifierAccess().getCARETTerminalRuleCall_3_2_0()); 
                    	          
                    	    }

                    	    }

                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3238:2: ( ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3239:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3239:1: ( (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER ) )
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3240:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
                    	    {
                    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3240:1: (lv_vals_6_1= RULE_IDENT | lv_vals_6_2= RULE_NUMBER )
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3241:3: lv_vals_6_1= RULE_IDENT
                    	            {
                    	            lv_vals_6_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleIdentifier7728); if (state.failed) return current;
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
                    	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3256:8: lv_vals_6_2= RULE_NUMBER
                    	            {
                    	            lv_vals_6_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleIdentifier7748); if (state.failed) return current;
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleMappingRule"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3282:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3283:2: (iv_ruleMappingRule= ruleMappingRule EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3284:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRuleRule()); 
            }
            pushFollow(FOLLOW_ruleMappingRule_in_entryRuleMappingRule7796);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingRule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingRule7806); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3291:1: ruleMappingRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3294:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleMAPPING_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_mapping_7_0= ruleMapping ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3295:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3296:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3296:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3297:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule7848); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleMappingRule7864); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getMappingRuleAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3317:1: ( (lv_type_2_0= ruleMAPPING_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3318:1: (lv_type_2_0= ruleMAPPING_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3318:1: (lv_type_2_0= ruleMAPPING_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3319:3: lv_type_2_0= ruleMAPPING_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getTypeMAPPING_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule7884);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3335:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3335:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMappingRule7896); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getMappingRuleAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3339:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3340:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3340:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3341:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingRule7912); if (state.failed) return current;
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
            	    break loop61;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleMappingRule7930); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getMappingRuleAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMappingRule7940); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getMappingRuleAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3365:1: ( (lv_mapping_7_0= ruleMapping ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3366:1: (lv_mapping_7_0= ruleMapping )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3366:1: (lv_mapping_7_0= ruleMapping )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3367:3: lv_mapping_7_0= ruleMapping
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingRuleAccess().getMappingMappingParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMapping_in_ruleMappingRule7960);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleMappingRule7971); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3395:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3396:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3397:2: iv_ruleMapping= ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingRule()); 
            }
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping8006);
            iv_ruleMapping=ruleMapping();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapping; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping8016); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3404:1: ruleMapping returns [EObject current=null] : ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        Token this_WS_2=null;
        Token this_WS_4=null;
        EObject lv_mappingItems_1_0 = null;

        EObject lv_mappingItems_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3407:28: ( ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3408:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3408:1: ( (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3408:2: (this_WS_0= RULE_WS )* ( (lv_mappingItems_1_0= ruleMappingItem ) ) ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )* (this_WS_4= RULE_WS )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3408:2: (this_WS_0= RULE_WS )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_WS) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3408:3: this_WS_0= RULE_WS
            	    {
            	    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping8053); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_0, grammarAccess.getMappingAccess().getWSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3412:3: ( (lv_mappingItems_1_0= ruleMappingItem ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3413:1: (lv_mappingItems_1_0= ruleMappingItem )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3413:1: (lv_mappingItems_1_0= ruleMappingItem )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3414:3: lv_mappingItems_1_0= ruleMappingItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping8075);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*
            loop64:
            do {
                int alt64=2;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:3: (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:3: (this_WS_2= RULE_WS )+
            	    int cnt63=0;
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==RULE_WS) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3430:4: this_WS_2= RULE_WS
            	    	    {
            	    	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping8088); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WS_2, grammarAccess.getMappingAccess().getWSTerminalRuleCall_2_0()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt63 >= 1 ) break loop63;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(63, input);
            	                throw eee;
            	        }
            	        cnt63++;
            	    } while (true);

            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3434:3: ( (lv_mappingItems_3_0= ruleMappingItem ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3435:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3435:1: (lv_mappingItems_3_0= ruleMappingItem )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3436:3: lv_mappingItems_3_0= ruleMappingItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMappingAccess().getMappingItemsMappingItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMappingItem_in_ruleMapping8110);
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
            	    break loop64;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3452:4: (this_WS_4= RULE_WS )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_WS) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3452:5: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleMapping8124); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getMappingAccess().getWSTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3464:1: entryRuleMappingItem returns [EObject current=null] : iv_ruleMappingItem= ruleMappingItem EOF ;
    public final EObject entryRuleMappingItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingItem = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3465:2: (iv_ruleMappingItem= ruleMappingItem EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3466:2: iv_ruleMappingItem= ruleMappingItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingItemRule()); 
            }
            pushFollow(FOLLOW_ruleMappingItem_in_entryRuleMappingItem8161);
            iv_ruleMappingItem=ruleMappingItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingItem8171); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3473:1: ruleMappingItem returns [EObject current=null] : ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )? ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3476:28: ( ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )? ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )? )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:1: ( ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) ) (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )?
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3477:2: ( ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3478:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3478:1: ( (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3479:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3479:1: (lv_col_0_1= RULE_IDENT | lv_col_0_2= RULE_NUMBER )
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3480:3: lv_col_0_1= RULE_IDENT
                    {
                    lv_col_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem8215); if (state.failed) return current;
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3495:8: lv_col_0_2= RULE_NUMBER
                    {
                    lv_col_0_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingItem8235); if (state.failed) return current;
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3513:2: (this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3513:3: this_STRING_1= RULE_STRING ( (lv_type_2_0= RULE_IDENT ) )? (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )?
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem8255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_0()); 
                          
                    }
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3517:1: ( (lv_type_2_0= RULE_IDENT ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_IDENT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3518:1: (lv_type_2_0= RULE_IDENT )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3518:1: (lv_type_2_0= RULE_IDENT )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3519:3: lv_type_2_0= RULE_IDENT
                            {
                            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingItem8271); if (state.failed) return current;
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

                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3535:3: (this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_STRING) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3535:4: this_STRING_3= RULE_STRING ( (lv_attr_4_0= ruleMappingIdentifier ) )
                            {
                            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMappingItem8289); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_STRING_3, grammarAccess.getMappingItemAccess().getSTRINGTerminalRuleCall_1_2_0()); 
                                  
                            }
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3539:1: ( (lv_attr_4_0= ruleMappingIdentifier ) )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3540:1: (lv_attr_4_0= ruleMappingIdentifier )
                            {
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3540:1: (lv_attr_4_0= ruleMappingIdentifier )
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3541:3: lv_attr_4_0= ruleMappingIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMappingItemAccess().getAttrMappingIdentifierParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMappingIdentifier_in_ruleMappingItem8309);
                            lv_attr_4_0=ruleMappingIdentifier();

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
                                      		"MappingIdentifier");
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


    // $ANTLR start "entryRuleMappingIdentifier"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3565:1: entryRuleMappingIdentifier returns [EObject current=null] : iv_ruleMappingIdentifier= ruleMappingIdentifier EOF ;
    public final EObject entryRuleMappingIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingIdentifier = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3566:2: (iv_ruleMappingIdentifier= ruleMappingIdentifier EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3567:2: iv_ruleMappingIdentifier= ruleMappingIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMappingIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleMappingIdentifier_in_entryRuleMappingIdentifier8349);
            iv_ruleMappingIdentifier=ruleMappingIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMappingIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingIdentifier8359); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMappingIdentifier"


    // $ANTLR start "ruleMappingIdentifier"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3574:1: ruleMappingIdentifier returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) ;
    public final EObject ruleMappingIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token this_CARET_1=null;
        Token lv_vals_2_1=null;
        Token lv_vals_2_2=null;

         enterRule(); 
            
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3577:28: ( ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3578:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3578:1: ( ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3578:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) ) (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3578:2: ( ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3579:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3579:1: ( (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3580:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3580:1: (lv_name_0_1= RULE_IDENT | lv_name_0_2= RULE_IDENT_DOT )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_IDENT) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_IDENT_DOT) ) {
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3581:3: lv_name_0_1= RULE_IDENT
                    {
                    lv_name_0_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingIdentifier8403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_1, grammarAccess.getMappingIdentifierAccess().getNameIDENTTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingIdentifierRule());
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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3596:8: lv_name_0_2= RULE_IDENT_DOT
                    {
                    lv_name_0_2=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleMappingIdentifier8423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_2, grammarAccess.getMappingIdentifierAccess().getNameIDENT_DOTTerminalRuleCall_0_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMappingIdentifierRule());
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3614:2: (this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_CARET) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3614:3: this_CARET_1= RULE_CARET ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    {
            	    this_CARET_1=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleMappingIdentifier8443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_1, grammarAccess.getMappingIdentifierAccess().getCARETTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3618:1: ( ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3619:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3619:1: ( (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3620:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3620:1: (lv_vals_2_1= RULE_IDENT | lv_vals_2_2= RULE_NUMBER )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==RULE_IDENT) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==RULE_NUMBER) ) {
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3621:3: lv_vals_2_1= RULE_IDENT
            	            {
            	            lv_vals_2_1=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleMappingIdentifier8461); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_vals_2_1, grammarAccess.getMappingIdentifierAccess().getValsIDENTTerminalRuleCall_1_1_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMappingIdentifierRule());
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
            	            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3636:8: lv_vals_2_2= RULE_NUMBER
            	            {
            	            lv_vals_2_2=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMappingIdentifier8481); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_vals_2_2, grammarAccess.getMappingIdentifierAccess().getValsNUMBERTerminalRuleCall_1_1_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMappingIdentifierRule());
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
            	    break loop72;
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
    // $ANTLR end "ruleMappingIdentifier"


    // $ANTLR start "entryRuleOptionalFeature"
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3662:1: entryRuleOptionalFeature returns [EObject current=null] : iv_ruleOptionalFeature= ruleOptionalFeature EOF ;
    public final EObject entryRuleOptionalFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalFeature = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3663:2: (iv_ruleOptionalFeature= ruleOptionalFeature EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3664:2: iv_ruleOptionalFeature= ruleOptionalFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature8527);
            iv_ruleOptionalFeature=ruleOptionalFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalFeature8537); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3671:1: ruleOptionalFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3674:28: ( ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3675:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3675:1: ( ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3675:2: ( (lv_name_0_0= RULE_IDENT ) ) this_LPAREN_1= RULE_LPAREN ( (lv_type_2_0= ruleOPTION_TYPE ) ) (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )* this_RPAREN_5= RULE_RPAREN this_EQUALS_6= RULE_EQUALS ( (lv_option_7_0= ruleFeatureValue ) ) this_SEMICOLON_8= RULE_SEMICOLON
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3675:2: ( (lv_name_0_0= RULE_IDENT ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3676:1: (lv_name_0_0= RULE_IDENT )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3676:1: (lv_name_0_0= RULE_IDENT )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3677:3: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature8579); if (state.failed) return current;
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

            this_LPAREN_1=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleOptionalFeature8595); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LPAREN_1, grammarAccess.getOptionalFeatureAccess().getLPARENTerminalRuleCall_1()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3697:1: ( (lv_type_2_0= ruleOPTION_TYPE ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3698:1: (lv_type_2_0= ruleOPTION_TYPE )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3698:1: (lv_type_2_0= ruleOPTION_TYPE )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3699:3: lv_type_2_0= ruleOPTION_TYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getTypeOPTION_TYPEEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature8615);
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

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3715:2: (this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3715:3: this_COMMA_3= RULE_COMMA ( (lv_filters_4_0= RULE_IDENT ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleOptionalFeature8627); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getOptionalFeatureAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3719:1: ( (lv_filters_4_0= RULE_IDENT ) )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3720:1: (lv_filters_4_0= RULE_IDENT )
            	    {
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3720:1: (lv_filters_4_0= RULE_IDENT )
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3721:3: lv_filters_4_0= RULE_IDENT
            	    {
            	    lv_filters_4_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleOptionalFeature8643); if (state.failed) return current;
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
            	    break loop73;
                }
            } while (true);

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleOptionalFeature8661); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RPAREN_5, grammarAccess.getOptionalFeatureAccess().getRPARENTerminalRuleCall_4()); 
                  
            }
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionalFeature8671); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_6, grammarAccess.getOptionalFeatureAccess().getEQUALSTerminalRuleCall_5()); 
                  
            }
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3745:1: ( (lv_option_7_0= ruleFeatureValue ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3746:1: (lv_option_7_0= ruleFeatureValue )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3746:1: (lv_option_7_0= ruleFeatureValue )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3747:3: lv_option_7_0= ruleFeatureValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalFeatureAccess().getOptionFeatureValueParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_ruleOptionalFeature8691);
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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature8702); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3775:1: entryRuleFeatureValue returns [String current=null] : iv_ruleFeatureValue= ruleFeatureValue EOF ;
    public final String entryRuleFeatureValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureValue = null;


        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3776:2: (iv_ruleFeatureValue= ruleFeatureValue EOF )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3777:2: iv_ruleFeatureValue= ruleFeatureValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureValueRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue8738);
            iv_ruleFeatureValue=ruleFeatureValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureValue8749); if (state.failed) return current;

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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3784:1: ruleFeatureValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+ ;
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
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3787:28: ( (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3788:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3788:1: (this_REST_0= RULE_REST | this_IDENT_DOT_1= RULE_IDENT_DOT | this_IDENT_2= RULE_IDENT | this_NUMBER_3= RULE_NUMBER | this_WS_4= RULE_WS | this_COLON_5= RULE_COLON | this_STRING_6= RULE_STRING | this_COMMA_7= RULE_COMMA | this_MINUS_8= RULE_MINUS | this_PLUS_9= RULE_PLUS | this_LPAREN_10= RULE_LPAREN | this_RPAREN_11= RULE_RPAREN | this_LBRACE_12= RULE_LBRACE | this_RBRACE_13= RULE_RBRACE | this_QUESTI_14= RULE_QUESTI | this_NOT_15= RULE_NOT | this_BAND_16= RULE_BAND | this_BOR_17= RULE_BOR | this_HASH_18= RULE_HASH | this_AT_19= RULE_AT | this_CARET_20= RULE_CARET | this_EQUALS_21= RULE_EQUALS | this_LESS_THAN_22= RULE_LESS_THAN | this_MORE_THAN_23= RULE_MORE_THAN | this_ESC_CHAR_24= RULE_ESC_CHAR )+
            int cnt74=0;
            loop74:
            do {
                int alt74=26;
                switch ( input.LA(1) ) {
                case RULE_REST:
                    {
                    alt74=1;
                    }
                    break;
                case RULE_IDENT_DOT:
                    {
                    alt74=2;
                    }
                    break;
                case RULE_IDENT:
                    {
                    alt74=3;
                    }
                    break;
                case RULE_NUMBER:
                    {
                    alt74=4;
                    }
                    break;
                case RULE_WS:
                    {
                    alt74=5;
                    }
                    break;
                case RULE_COLON:
                    {
                    alt74=6;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt74=7;
                    }
                    break;
                case RULE_COMMA:
                    {
                    alt74=8;
                    }
                    break;
                case RULE_MINUS:
                    {
                    alt74=9;
                    }
                    break;
                case RULE_PLUS:
                    {
                    alt74=10;
                    }
                    break;
                case RULE_LPAREN:
                    {
                    alt74=11;
                    }
                    break;
                case RULE_RPAREN:
                    {
                    alt74=12;
                    }
                    break;
                case RULE_LBRACE:
                    {
                    alt74=13;
                    }
                    break;
                case RULE_RBRACE:
                    {
                    alt74=14;
                    }
                    break;
                case RULE_QUESTI:
                    {
                    alt74=15;
                    }
                    break;
                case RULE_NOT:
                    {
                    alt74=16;
                    }
                    break;
                case RULE_BAND:
                    {
                    alt74=17;
                    }
                    break;
                case RULE_BOR:
                    {
                    alt74=18;
                    }
                    break;
                case RULE_HASH:
                    {
                    alt74=19;
                    }
                    break;
                case RULE_AT:
                    {
                    alt74=20;
                    }
                    break;
                case RULE_CARET:
                    {
                    alt74=21;
                    }
                    break;
                case RULE_EQUALS:
                    {
                    alt74=22;
                    }
                    break;
                case RULE_LESS_THAN:
                    {
                    alt74=23;
                    }
                    break;
                case RULE_MORE_THAN:
                    {
                    alt74=24;
                    }
                    break;
                case RULE_ESC_CHAR:
                    {
                    alt74=25;
                    }
                    break;

                }

                switch (alt74) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3788:6: this_REST_0= RULE_REST
            	    {
            	    this_REST_0=(Token)match(input,RULE_REST,FOLLOW_RULE_REST_in_ruleFeatureValue8789); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_REST_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_REST_0, grammarAccess.getFeatureValueAccess().getRESTTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3796:10: this_IDENT_DOT_1= RULE_IDENT_DOT
            	    {
            	    this_IDENT_DOT_1=(Token)match(input,RULE_IDENT_DOT,FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue8815); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_DOT_1, grammarAccess.getFeatureValueAccess().getIDENT_DOTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3804:10: this_IDENT_2= RULE_IDENT
            	    {
            	    this_IDENT_2=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleFeatureValue8841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_IDENT_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_IDENT_2, grammarAccess.getFeatureValueAccess().getIDENTTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3812:10: this_NUMBER_3= RULE_NUMBER
            	    {
            	    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleFeatureValue8867); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NUMBER_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NUMBER_3, grammarAccess.getFeatureValueAccess().getNUMBERTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3820:10: this_WS_4= RULE_WS
            	    {
            	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleFeatureValue8893); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_4, grammarAccess.getFeatureValueAccess().getWSTerminalRuleCall_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3828:10: this_COLON_5= RULE_COLON
            	    {
            	    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleFeatureValue8919); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COLON_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_5, grammarAccess.getFeatureValueAccess().getCOLONTerminalRuleCall_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3836:10: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureValue8945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_STRING_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_STRING_6, grammarAccess.getFeatureValueAccess().getSTRINGTerminalRuleCall_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3844:10: this_COMMA_7= RULE_COMMA
            	    {
            	    this_COMMA_7=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFeatureValue8971); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_COMMA_7);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_7, grammarAccess.getFeatureValueAccess().getCOMMATerminalRuleCall_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3852:10: this_MINUS_8= RULE_MINUS
            	    {
            	    this_MINUS_8=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleFeatureValue8997); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MINUS_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MINUS_8, grammarAccess.getFeatureValueAccess().getMINUSTerminalRuleCall_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3860:10: this_PLUS_9= RULE_PLUS
            	    {
            	    this_PLUS_9=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleFeatureValue9023); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_PLUS_9);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_PLUS_9, grammarAccess.getFeatureValueAccess().getPLUSTerminalRuleCall_9()); 
            	          
            	    }

            	    }
            	    break;
            	case 11 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3868:10: this_LPAREN_10= RULE_LPAREN
            	    {
            	    this_LPAREN_10=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleFeatureValue9049); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LPAREN_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LPAREN_10, grammarAccess.getFeatureValueAccess().getLPARENTerminalRuleCall_10()); 
            	          
            	    }

            	    }
            	    break;
            	case 12 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3876:10: this_RPAREN_11= RULE_RPAREN
            	    {
            	    this_RPAREN_11=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleFeatureValue9075); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RPAREN_11);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RPAREN_11, grammarAccess.getFeatureValueAccess().getRPARENTerminalRuleCall_11()); 
            	          
            	    }

            	    }
            	    break;
            	case 13 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3884:10: this_LBRACE_12= RULE_LBRACE
            	    {
            	    this_LBRACE_12=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleFeatureValue9101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LBRACE_12);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LBRACE_12, grammarAccess.getFeatureValueAccess().getLBRACETerminalRuleCall_12()); 
            	          
            	    }

            	    }
            	    break;
            	case 14 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3892:10: this_RBRACE_13= RULE_RBRACE
            	    {
            	    this_RBRACE_13=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleFeatureValue9127); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_RBRACE_13);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_RBRACE_13, grammarAccess.getFeatureValueAccess().getRBRACETerminalRuleCall_13()); 
            	          
            	    }

            	    }
            	    break;
            	case 15 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3900:10: this_QUESTI_14= RULE_QUESTI
            	    {
            	    this_QUESTI_14=(Token)match(input,RULE_QUESTI,FOLLOW_RULE_QUESTI_in_ruleFeatureValue9153); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_QUESTI_14);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_QUESTI_14, grammarAccess.getFeatureValueAccess().getQUESTITerminalRuleCall_14()); 
            	          
            	    }

            	    }
            	    break;
            	case 16 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3908:10: this_NOT_15= RULE_NOT
            	    {
            	    this_NOT_15=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleFeatureValue9179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_NOT_15);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_NOT_15, grammarAccess.getFeatureValueAccess().getNOTTerminalRuleCall_15()); 
            	          
            	    }

            	    }
            	    break;
            	case 17 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3916:10: this_BAND_16= RULE_BAND
            	    {
            	    this_BAND_16=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleFeatureValue9205); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BAND_16);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BAND_16, grammarAccess.getFeatureValueAccess().getBANDTerminalRuleCall_16()); 
            	          
            	    }

            	    }
            	    break;
            	case 18 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3924:10: this_BOR_17= RULE_BOR
            	    {
            	    this_BOR_17=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleFeatureValue9231); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BOR_17);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_BOR_17, grammarAccess.getFeatureValueAccess().getBORTerminalRuleCall_17()); 
            	          
            	    }

            	    }
            	    break;
            	case 19 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3932:10: this_HASH_18= RULE_HASH
            	    {
            	    this_HASH_18=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleFeatureValue9257); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HASH_18);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_HASH_18, grammarAccess.getFeatureValueAccess().getHASHTerminalRuleCall_18()); 
            	          
            	    }

            	    }
            	    break;
            	case 20 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3940:10: this_AT_19= RULE_AT
            	    {
            	    this_AT_19=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleFeatureValue9283); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_AT_19);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_AT_19, grammarAccess.getFeatureValueAccess().getATTerminalRuleCall_19()); 
            	          
            	    }

            	    }
            	    break;
            	case 21 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3948:10: this_CARET_20= RULE_CARET
            	    {
            	    this_CARET_20=(Token)match(input,RULE_CARET,FOLLOW_RULE_CARET_in_ruleFeatureValue9309); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CARET_20);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CARET_20, grammarAccess.getFeatureValueAccess().getCARETTerminalRuleCall_20()); 
            	          
            	    }

            	    }
            	    break;
            	case 22 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3956:10: this_EQUALS_21= RULE_EQUALS
            	    {
            	    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleFeatureValue9335); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EQUALS_21);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_21, grammarAccess.getFeatureValueAccess().getEQUALSTerminalRuleCall_21()); 
            	          
            	    }

            	    }
            	    break;
            	case 23 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3964:10: this_LESS_THAN_22= RULE_LESS_THAN
            	    {
            	    this_LESS_THAN_22=(Token)match(input,RULE_LESS_THAN,FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue9361); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LESS_THAN_22);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LESS_THAN_22, grammarAccess.getFeatureValueAccess().getLESS_THANTerminalRuleCall_22()); 
            	          
            	    }

            	    }
            	    break;
            	case 24 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3972:10: this_MORE_THAN_23= RULE_MORE_THAN
            	    {
            	    this_MORE_THAN_23=(Token)match(input,RULE_MORE_THAN,FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue9387); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MORE_THAN_23);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_MORE_THAN_23, grammarAccess.getFeatureValueAccess().getMORE_THANTerminalRuleCall_23()); 
            	          
            	    }

            	    }
            	    break;
            	case 25 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3980:10: this_ESC_CHAR_24= RULE_ESC_CHAR
            	    {
            	    this_ESC_CHAR_24=(Token)match(input,RULE_ESC_CHAR,FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue9413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ESC_CHAR_24);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ESC_CHAR_24, grammarAccess.getFeatureValueAccess().getESC_CHARTerminalRuleCall_24()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3995:1: ruleSTATEMEN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) ;
    public final Enumerator ruleSTATEMEN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3997:28: ( ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:1: ( (enumLiteral_0= 'QRY' ) | (enumLiteral_1= 'CRUD' ) | (enumLiteral_2= 'CALL' ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt75=1;
                }
                break;
            case 35:
                {
                alt75=2;
                }
                break;
            case 36:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:2: (enumLiteral_0= 'QRY' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:2: (enumLiteral_0= 'QRY' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3998:4: enumLiteral_0= 'QRY'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleSTATEMEN_TYPE9473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSTATEMEN_TYPEAccess().getQRYEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4004:6: (enumLiteral_1= 'CRUD' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4004:6: (enumLiteral_1= 'CRUD' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4004:8: enumLiteral_1= 'CRUD'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleSTATEMEN_TYPE9490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSTATEMEN_TYPEAccess().getCRUDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:6: (enumLiteral_2= 'CALL' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:6: (enumLiteral_2= 'CALL' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4010:8: enumLiteral_2= 'CALL'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleSTATEMEN_TYPE9507); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4020:1: ruleMAPPING_TYPE returns [Enumerator current=null] : (enumLiteral_0= 'OUT' ) ;
    public final Enumerator ruleMAPPING_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4022:28: ( (enumLiteral_0= 'OUT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4023:1: (enumLiteral_0= 'OUT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4023:1: (enumLiteral_0= 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4023:3: enumLiteral_0= 'OUT'
            {
            enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleMAPPING_TYPE9551); if (state.failed) return current;
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
    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4033:1: ruleOPTION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) ;
    public final Enumerator ruleOPTION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4035:28: ( ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4036:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4036:1: ( (enumLiteral_0= 'OPT' ) | (enumLiteral_1= 'LOPT' ) | (enumLiteral_2= 'IOPT' ) | (enumLiteral_3= 'SOPT' ) | (enumLiteral_4= 'BOPT' ) )
            int alt76=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt76=1;
                }
                break;
            case 39:
                {
                alt76=2;
                }
                break;
            case 40:
                {
                alt76=3;
                }
                break;
            case 41:
                {
                alt76=4;
                }
                break;
            case 42:
                {
                alt76=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4036:2: (enumLiteral_0= 'OPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4036:2: (enumLiteral_0= 'OPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4036:4: enumLiteral_0= 'OPT'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleOPTION_TYPE9595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOPTION_TYPEAccess().getOPTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4042:6: (enumLiteral_1= 'LOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4042:6: (enumLiteral_1= 'LOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4042:8: enumLiteral_1= 'LOPT'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleOPTION_TYPE9612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOPTION_TYPEAccess().getLOPTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:6: (enumLiteral_2= 'IOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:6: (enumLiteral_2= 'IOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4048:8: enumLiteral_2= 'IOPT'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_40_in_ruleOPTION_TYPE9629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOPTION_TYPEAccess().getIOPTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4054:6: (enumLiteral_3= 'SOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4054:6: (enumLiteral_3= 'SOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4054:8: enumLiteral_3= 'SOPT'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_41_in_ruleOPTION_TYPE9646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOPTION_TYPEAccess().getSOPTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4060:6: (enumLiteral_4= 'BOPT' )
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4060:6: (enumLiteral_4= 'BOPT' )
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:4060:8: enumLiteral_4= 'BOPT'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_42_in_ruleOPTION_TYPE9663); if (state.failed) return current;
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:628:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:628:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_EQUALS)||(input.LA(1)>=RULE_RBRACE && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1533:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_SEMICOLON)||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_BAND)||(input.LA(1)>=RULE_HASH && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:3: ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2559:4: ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR )
        {
        if ( (input.LA(1)>=RULE_WS && input.LA(1)<=RULE_AT)||input.LA(1)==RULE_LBRACE||(input.LA(1)>=RULE_REST && input.LA(1)<=RULE_ESC_CHAR) ) {
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
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2836:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred4_InternalProcessorDsl7026); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalProcessorDsl

    // $ANTLR start synpred5_InternalProcessorDsl
    public final void synpred5_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2858:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl7066); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalProcessorDsl

    // $ANTLR start synpred6_InternalProcessorDsl
    public final void synpred6_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:2991:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl7301); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalProcessorDsl

    // $ANTLR start synpred7_InternalProcessorDsl
    public final void synpred7_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3013:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl7341); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalProcessorDsl

    // $ANTLR start synpred8_InternalProcessorDsl
    public final void synpred8_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3212:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl7664); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalProcessorDsl

    // $ANTLR start synpred9_InternalProcessorDsl
    public final void synpred9_InternalProcessorDsl_fragment() throws RecognitionException {   
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:4: ( RULE_CARET )
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:3234:6: RULE_CARET
        {
        match(input,RULE_CARET,FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl7704); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalProcessorDsl

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


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA11_eotS =
        "\30\uffff";
    static final String DFA11_eofS =
        "\1\1\27\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\25\0\1\uffff";
    static final String DFA11_maxS =
        "\1\35\1\uffff\25\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\25\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\22\1\21\1\15\1\23\1\4\1\2\1\24\1\17\1\3\1\5\1\6\1\1"+
        "\1\20\1\0\1\10\1\7\1\12\1\16\1\14\1\13\1\11\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\6\1\4\1\12\1\7\1\13\1\23\5\1\1\14\1\2\1\3\1\5\1\10\1\11"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 628:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_21= RULE_REST | this_IDENT_DOT_22= RULE_IDENT_DOT | this_IDENT_23= RULE_IDENT | this_NUMBER_24= RULE_NUMBER | this_WS_25= RULE_WS | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_RBRACE_31= RULE_RBRACE | this_QUESTI_32= RULE_QUESTI | this_NOT_33= RULE_NOT | this_BAND_34= RULE_BAND | this_BOR_35= RULE_BOR | this_HASH_36= RULE_HASH | this_CARET_37= RULE_CARET | this_EQUALS_38= RULE_EQUALS | this_LESS_THAN_39= RULE_LESS_THAN | this_MORE_THAN_40= RULE_MORE_THAN | this_ESC_CHAR_41= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalProcessorDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\27\uffff";
    static final String DFA22_eofS =
        "\1\1\26\uffff";
    static final String DFA22_minS =
        "\1\4\1\uffff\24\0\1\uffff";
    static final String DFA22_maxS =
        "\1\35\1\uffff\24\0\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\24\uffff\1\1";
    static final String DFA22_specialS =
        "\2\uffff\1\12\1\15\1\13\1\1\1\4\1\22\1\20\1\17\1\23\1\3\1\21\1"+
        "\14\1\16\1\5\1\2\1\10\1\11\1\7\1\6\1\0\1\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\6\1\4\1\13\1\10\1\14\1\22\1\7\5\1\1\2\1\3\1\5\1\11\1\12"+
            "\1\15\1\16\1\17\1\1\1\20\1\21\1\23\1\24\1\25",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 1533:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_HASH | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_20= RULE_REST | this_IDENT_DOT_21= RULE_IDENT_DOT | this_IDENT_22= RULE_IDENT | this_NUMBER_23= RULE_NUMBER | this_WS_24= RULE_WS | this_SEMICOLON_25= RULE_SEMICOLON | this_COMMA_26= RULE_COMMA | this_MINUS_27= RULE_MINUS | this_PLUS_28= RULE_PLUS | this_LPAREN_29= RULE_LPAREN | this_RPAREN_30= RULE_RPAREN | this_QUESTI_31= RULE_QUESTI | this_NOT_32= RULE_NOT | this_BAND_33= RULE_BAND | this_HASH_34= RULE_HASH | this_CARET_35= RULE_CARET | this_EQUALS_36= RULE_EQUALS | this_LESS_THAN_37= RULE_LESS_THAN | this_MORE_THAN_38= RULE_MORE_THAN | this_ESC_CHAR_39= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_21 = input.LA(1);

                         
                        int index22_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_16 = input.LA(1);

                         
                        int index22_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_16);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_20 = input.LA(1);

                         
                        int index22_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_19 = input.LA(1);

                         
                        int index22_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_17 = input.LA(1);

                         
                        int index22_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_18 = input.LA(1);

                         
                        int index22_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_18);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_13 = input.LA(1);

                         
                        int index22_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_14 = input.LA(1);

                         
                        int index22_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA22_12 = input.LA(1);

                         
                        int index22_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_12);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalProcessorDsl()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\32\uffff";
    static final String DFA42_eofS =
        "\1\1\31\uffff";
    static final String DFA42_minS =
        "\1\4\1\uffff\27\0\1\uffff";
    static final String DFA42_maxS =
        "\1\35\1\uffff\27\0\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA42_specialS =
        "\2\uffff\1\4\1\22\1\17\1\3\1\16\1\5\1\23\1\7\1\1\1\13\1\25\1\6"+
        "\1\26\1\12\1\14\1\11\1\24\1\10\1\0\1\15\1\2\1\20\1\21\1\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\6\1\4\1\13\1\10\1\14\1\25\1\7\1\23\2\1\1\15\1\1\1\2\1\3"+
            "\1\5\1\11\1\12\1\16\1\17\1\20\1\21\1\22\1\24\1\26\1\27\1\30",
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
            return "()* loopback of 2559:2: ( ( ( RULE_REST | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_WS | RULE_SEMICOLON | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_ESC_CHAR ) )=> (this_REST_23= RULE_REST | this_IDENT_DOT_24= RULE_IDENT_DOT | this_IDENT_25= RULE_IDENT | this_NUMBER_26= RULE_NUMBER | this_WS_27= RULE_WS | this_SEMICOLON_28= RULE_SEMICOLON | this_COMMA_29= RULE_COMMA | this_MINUS_30= RULE_MINUS | this_PLUS_31= RULE_PLUS | this_LPAREN_32= RULE_LPAREN | this_RPAREN_33= RULE_RPAREN | this_LBRACE_34= RULE_LBRACE | this_QUESTI_35= RULE_QUESTI | this_NOT_36= RULE_NOT | this_BAND_37= RULE_BAND | this_BOR_38= RULE_BOR | this_HASH_39= RULE_HASH | this_AT_40= RULE_AT | this_CARET_41= RULE_CARET | this_EQUALS_42= RULE_EQUALS | this_LESS_THAN_43= RULE_LESS_THAN | this_MORE_THAN_44= RULE_MORE_THAN | this_ESC_CHAR_45= RULE_ESC_CHAR ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_20 = input.LA(1);

                         
                        int index42_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_22 = input.LA(1);

                         
                        int index42_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_19 = input.LA(1);

                         
                        int index42_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_17 = input.LA(1);

                         
                        int index42_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_15 = input.LA(1);

                         
                        int index42_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_16 = input.LA(1);

                         
                        int index42_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA42_21 = input.LA(1);

                         
                        int index42_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA42_23 = input.LA(1);

                         
                        int index42_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_23);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA42_24 = input.LA(1);

                         
                        int index42_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_24);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA42_18 = input.LA(1);

                         
                        int index42_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_18);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA42_14 = input.LA(1);

                         
                        int index42_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalProcessorDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index42_14);
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
    static final String DFA64_eotS =
        "\4\uffff";
    static final String DFA64_eofS =
        "\2\2\2\uffff";
    static final String DFA64_minS =
        "\2\4\2\uffff";
    static final String DFA64_maxS =
        "\1\12\1\22\2\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA64_specialS =
        "\4\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\5\uffff\1\2",
            "\1\1\1\3\4\uffff\1\2\7\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "()* loopback of 3430:2: ( (this_WS_2= RULE_WS )+ ( (lv_mappingItems_3_0= ruleMappingItem ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleArtifacts_in_entryRuleArtifacts75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifacts85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts122 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_ruleArtifacts146 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts158 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_ruleArtifacts188 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts200 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleMappingRule_in_ruleArtifacts230 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleArtifacts242 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleMetaStatement_in_entryRuleMetaStatement282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaStatement292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement334 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMetaStatement350 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleSTATEMEN_TYPE_in_ruleMetaStatement370 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMetaStatement382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaStatement398 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMetaStatement416 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaStatement426 = new BitSet(new long[]{0x000000003FFFFBF0L});
    public static final BitSet FOLLOW_ruleSql_in_ruleMetaStatement446 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMetaStatement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSql_in_entryRuleSql492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSql502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_ruleSql547 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_ruleSqlFragment_in_entryRuleSqlFragment583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlFragment593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_ruleSqlFragment639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleSqlFragment657 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleSqlFragment677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSqlFragment696 = new BitSet(new long[]{0x00000000001A0020L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleSqlFragment716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSqlFragment735 = new BitSet(new long[]{0x00000000181E0220L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSqlFragment755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleSqlFragment774 = new BitSet(new long[]{0x0000000003A00210L});
    public static final BitSet FOLLOW_ruleMetaSql_in_ruleSqlFragment794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlFragment805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlValue_in_entryRuleSqlValue842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlValue853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue894 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue920 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue946 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue972 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue998 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue1024 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue1050 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue1076 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue1102 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue1128 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue1154 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue1180 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue1206 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue1232 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue1258 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue1284 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue1310 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue1336 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue1362 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue1388 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue1414 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleSqlValue1583 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleSqlValue1609 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleSqlValue1635 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSqlValue1661 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleSqlValue1687 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSqlValue1713 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleSqlValue1739 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleSqlValue1765 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleSqlValue1791 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleSqlValue1817 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleSqlValue1843 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleSqlValue1869 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleSqlValue1895 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleSqlValue1921 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleSqlValue1947 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleSqlValue1973 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleSqlValue1999 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleSqlValue2025 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleSqlValue2051 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleSqlValue2077 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleSqlValue2103 = new BitSet(new long[]{0x000000003FFF83F2L});
    public static final BitSet FOLLOW_ruleMetaSql_in_entryRuleMetaSql2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaSql2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql2198 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2218 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2230 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2250 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleMetaSql2277 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleMetaSql2303 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2314 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2334 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2346 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2366 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleMetaSql2393 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2419 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2431 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2451 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2478 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2504 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleMetaSql2516 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2536 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMetaSql2563 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMetaSql2580 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMetaSql2598 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleMetaSql2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleMetaSql2649 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMetaSql2665 = new BitSet(new long[]{0x000000003FFF7FF0L});
    public static final BitSet FOLLOW_ruleOrdSql_in_ruleMetaSql2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSql_in_entryRuleIfSql2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSql2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_ruleIfSql2777 = new BitSet(new long[]{0x000000003EFF7FF2L});
    public static final BitSet FOLLOW_ruleIfSqlFragment_in_entryRuleIfSqlFragment2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlFragment2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_ruleIfSqlFragment2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleIfSqlFragment2887 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleIfSqlFragment2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlFragment2926 = new BitSet(new long[]{0x00000000001A0020L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlFragment2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlFragment2965 = new BitSet(new long[]{0x00000000181E0220L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlFragment2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleIfSqlFragment3004 = new BitSet(new long[]{0x0000000001A00010L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_ruleIfSqlFragment3024 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleIfSqlFragment3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfSqlValue_in_entryRuleIfSqlValue3072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlValue3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue3124 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue3150 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue3176 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue3202 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue3228 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue3254 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue3280 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue3306 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue3332 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue3358 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue3384 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue3410 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue3436 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue3462 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue3488 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue3514 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue3540 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue3566 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue3592 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue3618 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleIfSqlValue3780 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIfSqlValue3806 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIfSqlValue3832 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIfSqlValue3858 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlValue3884 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleIfSqlValue3910 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleIfSqlValue3936 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIfSqlValue3962 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIfSqlValue3988 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlValue4014 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlValue4040 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfSqlValue4066 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlValue4092 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfSqlValue4118 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleIfSqlValue4144 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIfSqlValue4170 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIfSqlValue4196 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIfSqlValue4222 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIfSqlValue4248 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleIfSqlValue4274 = new BitSet(new long[]{0x000000003EFF07F2L});
    public static final BitSet FOLLOW_ruleIfMetaSql_in_entryRuleIfMetaSql4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfMetaSql4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfMetaSql4369 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4389 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4401 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4421 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleIfMetaSql4448 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfMetaSql4474 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4485 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4505 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4517 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4537 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleIfMetaSql4564 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4590 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4602 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4622 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4649 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4675 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleIfMetaSql4687 = new BitSet(new long[]{0x000000003EFF7FF0L});
    public static final BitSet FOLLOW_ruleIfSql_in_ruleIfMetaSql4707 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_entryRuleIfSqlCond4746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlCond4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond4793 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond4815 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond4827 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleIfSqlCond4848 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleIfSqlCond4868 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond4888 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_ruleIfSqlCond4910 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleIfSqlCond4922 = new BitSet(new long[]{0x00000000C0000012L});
    public static final BitSet FOLLOW_ruleIfSqlBool_in_entryRuleIfSqlBool4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfSqlBool4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool5014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIfSqlBool5031 = new BitSet(new long[]{0x00000000001A0020L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleIfSqlBool5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool5076 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleIfSqlBool5093 = new BitSet(new long[]{0x00000000181E0220L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleIfSqlBool5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleIfSqlBool5138 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleIfSqlBool5155 = new BitSet(new long[]{0x0000000000403050L});
    public static final BitSet FOLLOW_ruleIfSqlCond_in_ruleIfSqlBool5175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleIfSqlBool5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql_in_entryRuleOrdSql5222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_ruleOrdSql5277 = new BitSet(new long[]{0x000000003FFF7FF2L});
    public static final BitSet FOLLOW_ruleOrdSql2_in_entryRuleOrdSql25313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSql25323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_ruleOrdSql25369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOrdSql25387 = new BitSet(new long[]{0x00000000001A0020L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOrdSql25407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleOrdSql25426 = new BitSet(new long[]{0x00000000181E0220L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleOrdSql25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrdSqlValue_in_entryRuleOrdSqlValue5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrdSqlValue5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue5536 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue5562 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue5588 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue5614 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue5640 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue5666 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue5692 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue5718 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue5744 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue5770 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue5796 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue5822 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue5848 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue5874 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue5900 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue5926 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue5952 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue5978 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue6004 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue6030 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue6056 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue6082 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue6108 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleOrdSqlValue6291 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleOrdSqlValue6317 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOrdSqlValue6343 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleOrdSqlValue6369 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleOrdSqlValue6395 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOrdSqlValue6421 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOrdSqlValue6447 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOrdSqlValue6473 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOrdSqlValue6499 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOrdSqlValue6525 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOrdSqlValue6551 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleOrdSqlValue6577 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleOrdSqlValue6603 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleOrdSqlValue6629 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleOrdSqlValue6655 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleOrdSqlValue6681 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleOrdSqlValue6707 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleOrdSqlValue6733 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleOrdSqlValue6759 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOrdSqlValue6785 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleOrdSqlValue6811 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleOrdSqlValue6837 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleOrdSqlValue6863 = new BitSet(new long[]{0x000000003FFF4FF2L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn6911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn6965 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleColumn6985 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn7005 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn7031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn7048 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleColumn7071 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleColumn7090 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleColumn7110 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant7158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleConstant7212 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleConstant7232 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant7260 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleConstant7280 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant7306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant7323 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleConstant7346 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleConstant7365 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstant7385 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier7433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleIdentifier7487 = new BitSet(new long[]{0x00000000001E0020L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleIdentifier7507 = new BitSet(new long[]{0x00000000001E0020L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleIdentifier7527 = new BitSet(new long[]{0x00000000001E0020L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleIdentifier7555 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleIdentifier7575 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier7603 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleIdentifier7623 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier7643 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier7669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier7686 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleIdentifier7709 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleIdentifier7728 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleIdentifier7748 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMappingRule_in_entryRuleMappingRule7796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingRule7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule7848 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleMappingRule7864 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleMAPPING_TYPE_in_ruleMappingRule7884 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMappingRule7896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingRule7912 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleMappingRule7930 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMappingRule7940 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingRule7960 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleMappingRule7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping8006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping8016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping8053 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping8075 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping8088 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_ruleMappingItem_in_ruleMapping8110 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleMapping8124 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMappingItem_in_entryRuleMappingItem8161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingItem8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem8215 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingItem8235 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem8255 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingItem8271 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMappingItem8289 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleMappingIdentifier_in_ruleMappingItem8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingIdentifier_in_entryRuleMappingIdentifier8349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingIdentifier8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingIdentifier8403 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleMappingIdentifier8423 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleMappingIdentifier8443 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleMappingIdentifier8461 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMappingIdentifier8481 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOptionalFeature_in_entryRuleOptionalFeature8527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalFeature8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature8579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleOptionalFeature8595 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_ruleOPTION_TYPE_in_ruleOptionalFeature8615 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleOptionalFeature8627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleOptionalFeature8643 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleOptionalFeature8661 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionalFeature8671 = new BitSet(new long[]{0x000000003FFFFBF0L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_ruleOptionalFeature8691 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleOptionalFeature8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureValue_in_entryRuleFeatureValue8738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureValue8749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REST_in_ruleFeatureValue8789 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_IDENT_DOT_in_ruleFeatureValue8815 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleFeatureValue8841 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleFeatureValue8867 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleFeatureValue8893 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleFeatureValue8919 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureValue8945 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFeatureValue8971 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleFeatureValue8997 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleFeatureValue9023 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleFeatureValue9049 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleFeatureValue9075 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleFeatureValue9101 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleFeatureValue9127 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_QUESTI_in_ruleFeatureValue9153 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleFeatureValue9179 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleFeatureValue9205 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleFeatureValue9231 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleFeatureValue9257 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleFeatureValue9283 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_CARET_in_ruleFeatureValue9309 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleFeatureValue9335 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_LESS_THAN_in_ruleFeatureValue9361 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_MORE_THAN_in_ruleFeatureValue9387 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_RULE_ESC_CHAR_in_ruleFeatureValue9413 = new BitSet(new long[]{0x000000003FFFFBF2L});
    public static final BitSet FOLLOW_34_in_ruleSTATEMEN_TYPE9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSTATEMEN_TYPE9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSTATEMEN_TYPE9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMAPPING_TYPE9551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOPTION_TYPE9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOPTION_TYPE9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOPTION_TYPE9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOPTION_TYPE9646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOPTION_TYPE9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1_InternalProcessorDsl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred2_InternalProcessorDsl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalProcessorDsl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred4_InternalProcessorDsl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred5_InternalProcessorDsl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred6_InternalProcessorDsl7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred7_InternalProcessorDsl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred8_InternalProcessorDsl7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CARET_in_synpred9_InternalProcessorDsl7704 = new BitSet(new long[]{0x0000000000000002L});

}