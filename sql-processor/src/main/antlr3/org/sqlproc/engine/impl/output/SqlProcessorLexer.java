// $ANTLR 3.4 /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g 2013-01-21 15:12:58
 
package org.sqlproc.engine.impl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlProcessorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AT=5;
    public static final int BAND=6;
    public static final int BOR=7;
    public static final int CARET=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int DIGIT=11;
    public static final int DOT=12;
    public static final int EQUALS=13;
    public static final int ESC_AT=14;
    public static final int ESC_BOR=15;
    public static final int ESC_CHAR=16;
    public static final int ESC_COLON=17;
    public static final int ESC_DOT=18;
    public static final int ESC_HASH=19;
    public static final int ESC_LBRACE=20;
    public static final int ESC_PERCENT=21;
    public static final int ESC_RBRACE=22;
    public static final int ESC_SEMICOLON=23;
    public static final int ESC_SLASH=24;
    public static final int ESC_STRING=25;
    public static final int HASH=26;
    public static final int IDENT=27;
    public static final int IDENT_DOT=28;
    public static final int LBRACE=29;
    public static final int LESS_THAN=30;
    public static final int LPAREN=31;
    public static final int MAPPING=32;
    public static final int MINUS=33;
    public static final int ML_COMMENT=34;
    public static final int MORE_THAN=35;
    public static final int NOT=36;
    public static final int NUMBER=37;
    public static final int OPTION=38;
    public static final int OR=39;
    public static final int PERCENT=40;
    public static final int PLUS=41;
    public static final int QUESTI=42;
    public static final int RBRACE=43;
    public static final int REST=44;
    public static final int RPAREN=45;
    public static final int SEMICOLON=46;
    public static final int SL_COMMENT=47;
    public static final int STATEMENT=48;
    public static final int STRING=49;
    public static final int WS=50;

      private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
      
      public List<ErrorMsg> getErrors() {
        return errors;
      }

      public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        String msg = super.getErrorMessage(e,tokenNames);
        errors.add(ParserUtils.create(null,msg,e,tokenNames));
        return msg;
      }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SqlProcessorLexer() {} 
    public SqlProcessorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlProcessorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g"; }

    // $ANTLR start "STATEMENT"
    public final void mSTATEMENT() throws RecognitionException {
        try {
            int _type = STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:423:10: ( 'QRY' | 'CRUD' | 'CALL' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='Q') ) {
                alt1=1;
            }
            else if ( (LA1_0=='C') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='R') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='A') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:423:12: 'QRY'
                    {
                    match("QRY"); 



                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:423:18: 'CRUD'
                    {
                    match("CRUD"); 



                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:423:25: 'CALL'
                    {
                    match("CALL"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATEMENT"

    // $ANTLR start "MAPPING"
    public final void mMAPPING() throws RecognitionException {
        try {
            int _type = MAPPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:424:8: ( 'OUT' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:424:10: 'OUT'
            {
            match("OUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAPPING"

    // $ANTLR start "OPTION"
    public final void mOPTION() throws RecognitionException {
        try {
            int _type = OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:7: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt2=1;
                }
                break;
            case 'L':
                {
                alt2=2;
                }
                break;
            case 'I':
                {
                alt2=3;
                }
                break;
            case 'S':
                {
                alt2=4;
                }
                break;
            case 'B':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:9: 'OPT'
                    {
                    match("OPT"); 



                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:17: 'LOPT'
                    {
                    match("LOPT"); 



                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:26: 'IOPT'
                    {
                    match("IOPT"); 



                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:35: 'SOPT'
                    {
                    match("SOPT"); 



                    }
                    break;
                case 5 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:425:44: 'BOPT'
                    {
                    match("BOPT"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPTION"

    // $ANTLR start "IDENT_DOT"
    public final void mIDENT_DOT() throws RecognitionException {
        try {
            int _type = IDENT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:427:10: ( IDENT ( DOT IDENT )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:427:12: IDENT ( DOT IDENT )+
            {
            mIDENT(); 


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:427:18: ( DOT IDENT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:427:19: DOT IDENT
            	    {
            	    mDOT(); 


            	    mIDENT(); 


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT_DOT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:428:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:428:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:428:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||LA4_0=='='||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='='||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:429:7: ( ( DIGIT )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:429:9: ( DIGIT )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:429:9: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:432:6: ( ( '0' .. '9' ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:432:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:432:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:432:19: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:432:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:12: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:14: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 



            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:19: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:35: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:36: ( '\\r' )? '\\n'
                    {
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:36: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:433:36: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:434:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:434:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:434:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:435:4: ( '&' '&' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:435:8: '&' '&'
            {
            match('&'); 

            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:436:3: ( '|' '|' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:436:8: '|' '|'
            {
            match('|'); 

            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ESC_COLON"
    public final void mESC_COLON() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:440:10: ( '\\\\' ':' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:440:15: '\\\\' ':'
            {
            match('\\'); 

            match(':'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_COLON"

    // $ANTLR start "ESC_SEMICOLON"
    public final void mESC_SEMICOLON() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:442:14: ( '\\\\' ';' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:442:15: '\\\\' ';'
            {
            match('\\'); 

            match(';'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEMICOLON"

    // $ANTLR start "ESC_STRING"
    public final void mESC_STRING() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:444:11: ( '\\\\' '$' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:444:15: '\\\\' '$'
            {
            match('\\'); 

            match('$'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_STRING"

    // $ANTLR start "ESC_LBRACE"
    public final void mESC_LBRACE() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:446:11: ( '\\\\' '{' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:446:15: '\\\\' '{'
            {
            match('\\'); 

            match('{'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_LBRACE"

    // $ANTLR start "ESC_RBRACE"
    public final void mESC_RBRACE() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:448:11: ( '\\\\' '}' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:448:15: '\\\\' '}'
            {
            match('\\'); 

            match('}'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_RBRACE"

    // $ANTLR start "ESC_BOR"
    public final void mESC_BOR() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:450:8: ( '\\\\' '|' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:450:15: '\\\\' '|'
            {
            match('\\'); 

            match('|'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_BOR"

    // $ANTLR start "ESC_HASH"
    public final void mESC_HASH() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:452:9: ( '\\\\' '#' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:452:15: '\\\\' '#'
            {
            match('\\'); 

            match('#'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_HASH"

    // $ANTLR start "ESC_AT"
    public final void mESC_AT() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:454:7: ( '\\\\' '@' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:454:15: '\\\\' '@'
            {
            match('\\'); 

            match('@'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_AT"

    // $ANTLR start "ESC_PERCENT"
    public final void mESC_PERCENT() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:456:12: ( '\\\\' '%' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:456:15: '\\\\' '%'
            {
            match('\\'); 

            match('%'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_PERCENT"

    // $ANTLR start "ESC_DOT"
    public final void mESC_DOT() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:458:8: ( '\\\\' '.' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:458:11: '\\\\' '.'
            {
            match('\\'); 

            match('.'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_DOT"

    // $ANTLR start "ESC_SLASH"
    public final void mESC_SLASH() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:10: ( '\\\\' '/' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:13: '\\\\' '/'
            {
            match('\\'); 

            match('/'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SLASH"

    // $ANTLR start "ESC_CHAR"
    public final void mESC_CHAR() throws RecognitionException {
        try {
            int _type = ESC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:9: ( ( ESC_COLON | ESC_SEMICOLON | ESC_STRING | ESC_LBRACE | ESC_RBRACE | ESC_BOR | ESC_HASH | ESC_AT | ESC_PERCENT | ESC_DOT | ESC_SLASH ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:12: ( ESC_COLON | ESC_SEMICOLON | ESC_STRING | ESC_LBRACE | ESC_RBRACE | ESC_BOR | ESC_HASH | ESC_AT | ESC_PERCENT | ESC_DOT | ESC_SLASH )
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:12: ( ESC_COLON | ESC_SEMICOLON | ESC_STRING | ESC_LBRACE | ESC_RBRACE | ESC_BOR | ESC_HASH | ESC_AT | ESC_PERCENT | ESC_DOT | ESC_SLASH )
            int alt11=11;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case ':':
                    {
                    alt11=1;
                    }
                    break;
                case ';':
                    {
                    alt11=2;
                    }
                    break;
                case '$':
                    {
                    alt11=3;
                    }
                    break;
                case '{':
                    {
                    alt11=4;
                    }
                    break;
                case '}':
                    {
                    alt11=5;
                    }
                    break;
                case '|':
                    {
                    alt11=6;
                    }
                    break;
                case '#':
                    {
                    alt11=7;
                    }
                    break;
                case '@':
                    {
                    alt11=8;
                    }
                    break;
                case '%':
                    {
                    alt11=9;
                    }
                    break;
                case '.':
                    {
                    alt11=10;
                    }
                    break;
                case '/':
                    {
                    alt11=11;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:13: ESC_COLON
                    {
                    mESC_COLON(); 


                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:25: ESC_SEMICOLON
                    {
                    mESC_SEMICOLON(); 


                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:41: ESC_STRING
                    {
                    mESC_STRING(); 


                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:54: ESC_LBRACE
                    {
                    mESC_LBRACE(); 


                    }
                    break;
                case 5 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:67: ESC_RBRACE
                    {
                    mESC_RBRACE(); 


                    }
                    break;
                case 6 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:80: ESC_BOR
                    {
                    mESC_BOR(); 


                    }
                    break;
                case 7 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:90: ESC_HASH
                    {
                    mESC_HASH(); 


                    }
                    break;
                case 8 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:101: ESC_AT
                    {
                    mESC_AT(); 


                    }
                    break;
                case 9 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:110: ESC_PERCENT
                    {
                    mESC_PERCENT(); 


                    }
                    break;
                case 10 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:122: ESC_DOT
                    {
                    mESC_DOT(); 


                    }
                    break;
                case 11 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:460:130: ESC_SLASH
                    {
                    mESC_SLASH(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_CHAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:462:6: ( ':' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:462:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:463:10: ( ';' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:463:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:464:7: ( '$' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:464:11: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:467:4: ( '.' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:467:11: '.'
            {
            match('.'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:467:6: ( ',' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:467:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:468:6: ( '-' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:468:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:469:5: ( '+' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:469:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:470:7: ( '(' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:470:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:471:7: ( ')' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:471:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:472:7: ( '{' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:472:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:473:7: ( '}' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:473:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "QUESTI"
    public final void mQUESTI() throws RecognitionException {
        try {
            int _type = QUESTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:474:7: ( '?' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:474:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTI"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:475:4: ( '!' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:475:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:476:5: ( '&' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:476:11: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:477:4: ( '|' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:477:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:478:5: ( '#' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:478:11: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:479:3: ( '@' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:479:7: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:480:6: ( '^' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:480:11: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:481:7: ( '=' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:481:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "LESS_THAN"
    public final void mLESS_THAN() throws RecognitionException {
        try {
            int _type = LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:482:10: ( '<' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:482:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN"

    // $ANTLR start "MORE_THAN"
    public final void mMORE_THAN() throws RecognitionException {
        try {
            int _type = MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:483:10: ( '>' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:483:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MORE_THAN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:484:8: ( '%' )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:484:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
        try {
            int _type = REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:485:5: (~ ( COLON | SEMICOLON | STRING | COMMA | MINUS | PLUS | LPAREN | RPAREN | LBRACE | RBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS | LESS_THAN | MORE_THAN | PERCENT ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ' ')||input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='*'||(input.LA(1) >= '.' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= ']')||(input.LA(1) >= '_' && input.LA(1) <= 'z')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REST"

    public void mTokens() throws RecognitionException {
        // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:8: ( STATEMENT | MAPPING | OPTION | IDENT_DOT | IDENT | NUMBER | ML_COMMENT | SL_COMMENT | WS | AND | OR | ESC_CHAR | COLON | SEMICOLON | STRING | COMMA | MINUS | PLUS | LPAREN | RPAREN | LBRACE | RBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS | LESS_THAN | MORE_THAN | PERCENT | REST )
        int alt12=34;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:10: STATEMENT
                {
                mSTATEMENT(); 


                }
                break;
            case 2 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:20: MAPPING
                {
                mMAPPING(); 


                }
                break;
            case 3 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:28: OPTION
                {
                mOPTION(); 


                }
                break;
            case 4 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:35: IDENT_DOT
                {
                mIDENT_DOT(); 


                }
                break;
            case 5 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:45: IDENT
                {
                mIDENT(); 


                }
                break;
            case 6 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:51: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 7 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:58: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 8 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:69: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 9 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:80: WS
                {
                mWS(); 


                }
                break;
            case 10 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:83: AND
                {
                mAND(); 


                }
                break;
            case 11 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:87: OR
                {
                mOR(); 


                }
                break;
            case 12 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:90: ESC_CHAR
                {
                mESC_CHAR(); 


                }
                break;
            case 13 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:99: COLON
                {
                mCOLON(); 


                }
                break;
            case 14 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:105: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 15 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:115: STRING
                {
                mSTRING(); 


                }
                break;
            case 16 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:122: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 17 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:128: MINUS
                {
                mMINUS(); 


                }
                break;
            case 18 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:134: PLUS
                {
                mPLUS(); 


                }
                break;
            case 19 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:139: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 20 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:146: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 21 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:153: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 22 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:160: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 23 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:167: QUESTI
                {
                mQUESTI(); 


                }
                break;
            case 24 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:174: NOT
                {
                mNOT(); 


                }
                break;
            case 25 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:178: BAND
                {
                mBAND(); 


                }
                break;
            case 26 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:183: BOR
                {
                mBOR(); 


                }
                break;
            case 27 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:187: HASH
                {
                mHASH(); 


                }
                break;
            case 28 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:192: AT
                {
                mAT(); 


                }
                break;
            case 29 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:195: CARET
                {
                mCARET(); 


                }
                break;
            case 30 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:201: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 31 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:208: LESS_THAN
                {
                mLESS_THAN(); 


                }
                break;
            case 32 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:218: MORE_THAN
                {
                mMORE_THAN(); 


                }
                break;
            case 33 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:228: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 34 :
                // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:1:236: REST
                {
                mREST(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\45\1\uffff\1\42\1\uffff\1\64\1\66\1\42\24\uffff\2\45"+
        "\2\uffff\10\45\11\uffff\1\101\2\45\1\104\1\105\4\45\1\uffff\2\101"+
        "\2\uffff\4\105";
    static final String DFA12_eofS =
        "\112\uffff";
    static final String DFA12_minS =
        "\1\0\10\56\1\uffff\1\52\1\uffff\1\46\1\174\1\43\24\uffff\2\56\2"+
        "\uffff\10\56\11\uffff\11\56\1\uffff\2\56\2\uffff\4\56";
    static final String DFA12_maxS =
        "\1\uffff\10\172\1\uffff\1\57\1\uffff\1\46\1\174\1\175\24\uffff\2"+
        "\172\2\uffff\10\172\11\uffff\11\172\1\uffff\2\172\2\uffff\4\172";
    static final String DFA12_acceptS =
        "\11\uffff\1\6\1\uffff\1\11\3\uffff\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\24\1\25\1\26\1\27\1\30\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
        "\1\42\2\uffff\1\5\1\4\10\uffff\1\6\1\7\1\10\1\11\1\12\1\31\1\13"+
        "\1\32\1\14\11\uffff\1\1\2\uffff\1\2\1\3\4\uffff";
    static final String DFA12_specialS =
        "\1\0\111\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\13\2\42\1\13\22\42\1\13\1\32\1\42\1\33\1\21\1\41\1"+
            "\14\1\42\1\25\1\26\1\42\1\24\1\22\1\23\1\42\1\12\12\11\1\17"+
            "\1\20\1\37\1\36\1\40\1\31\1\34\1\10\1\7\1\2\5\10\1\5\2\10\1"+
            "\4\2\10\1\3\1\10\1\1\1\10\1\6\7\10\1\42\1\16\1\42\1\35\2\42"+
            "\32\10\1\27\1\15\1\30\uff82\42",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\21\44\1\43\10\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\1\50\20\44\1\47\10"+
            "\44\4\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\17\44\1\52\4\44\1"+
            "\51\5\44\4\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\16\44\1\53\13\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\16\44\1\54\13\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\16\44\1\55\13\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\16\44\1\56\13\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "\1\63",
            "\1\65",
            "\3\67\10\uffff\2\67\12\uffff\2\67\4\uffff\1\67\72\uffff\3\67",
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
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\30\44\1\70\1\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "",
            "",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\24\44\1\71\5\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\13\44\1\72\16\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\73\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\74\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\17\44\1\75\12\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\17\44\1\76\12\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\17\44\1\77\12\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\17\44\1\100\12\44"+
            "\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\3\44\1\102\26\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\13\44\1\103\16\44"+
            "\4\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\106\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\107\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\110\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\23\44\1\111\6\44\4"+
            "\uffff\1\44\1\uffff\32\44",
            "",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "",
            "",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44",
            "\1\46\1\uffff\12\44\3\uffff\1\44\3\uffff\32\44\4\uffff\1\44"+
            "\1\uffff\32\44"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( STATEMENT | MAPPING | OPTION | IDENT_DOT | IDENT | NUMBER | ML_COMMENT | SL_COMMENT | WS | AND | OR | ESC_CHAR | COLON | SEMICOLON | STRING | COMMA | MINUS | PLUS | LPAREN | RPAREN | LBRACE | RBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS | LESS_THAN | MORE_THAN | PERCENT | REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='Q') ) {s = 1;}

                        else if ( (LA12_0=='C') ) {s = 2;}

                        else if ( (LA12_0=='O') ) {s = 3;}

                        else if ( (LA12_0=='L') ) {s = 4;}

                        else if ( (LA12_0=='I') ) {s = 5;}

                        else if ( (LA12_0=='S') ) {s = 6;}

                        else if ( (LA12_0=='B') ) {s = 7;}

                        else if ( (LA12_0=='A'||(LA12_0 >= 'D' && LA12_0 <= 'H')||(LA12_0 >= 'J' && LA12_0 <= 'K')||(LA12_0 >= 'M' && LA12_0 <= 'N')||LA12_0=='P'||LA12_0=='R'||(LA12_0 >= 'T' && LA12_0 <= 'Z')||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {s = 8;}

                        else if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {s = 9;}

                        else if ( (LA12_0=='/') ) {s = 10;}

                        else if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 11;}

                        else if ( (LA12_0=='&') ) {s = 12;}

                        else if ( (LA12_0=='|') ) {s = 13;}

                        else if ( (LA12_0=='\\') ) {s = 14;}

                        else if ( (LA12_0==':') ) {s = 15;}

                        else if ( (LA12_0==';') ) {s = 16;}

                        else if ( (LA12_0=='$') ) {s = 17;}

                        else if ( (LA12_0==',') ) {s = 18;}

                        else if ( (LA12_0=='-') ) {s = 19;}

                        else if ( (LA12_0=='+') ) {s = 20;}

                        else if ( (LA12_0=='(') ) {s = 21;}

                        else if ( (LA12_0==')') ) {s = 22;}

                        else if ( (LA12_0=='{') ) {s = 23;}

                        else if ( (LA12_0=='}') ) {s = 24;}

                        else if ( (LA12_0=='?') ) {s = 25;}

                        else if ( (LA12_0=='!') ) {s = 26;}

                        else if ( (LA12_0=='#') ) {s = 27;}

                        else if ( (LA12_0=='@') ) {s = 28;}

                        else if ( (LA12_0=='^') ) {s = 29;}

                        else if ( (LA12_0=='=') ) {s = 30;}

                        else if ( (LA12_0=='<') ) {s = 31;}

                        else if ( (LA12_0=='>') ) {s = 32;}

                        else if ( (LA12_0=='%') ) {s = 33;}

                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\b')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\u001F')||LA12_0=='\"'||LA12_0=='\''||LA12_0=='*'||LA12_0=='.'||LA12_0=='['||LA12_0==']'||(LA12_0 >= '_' && LA12_0 <= '`')||(LA12_0 >= '~' && LA12_0 <= '\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}