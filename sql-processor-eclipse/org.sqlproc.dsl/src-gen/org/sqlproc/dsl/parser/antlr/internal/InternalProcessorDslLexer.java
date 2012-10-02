package org.sqlproc.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessorDslLexer extends Lexer {
    public static final int RULE_PERCENT=30;
    public static final int RULE_OR=32;
    public static final int RULE_AND=31;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_REST=11;
    public static final int T__90=90;
    public static final int RULE_LPAREN=6;
    public static final int RULE_IDENT_DOT=12;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_BAND=22;
    public static final int T__80=80;
    public static final int RULE_RBRACE=19;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HASH=24;
    public static final int RULE_COMMA=15;
    public static final int T__85=85;
    public static final int RULE_QUESTI=20;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=37;
    public static final int RULE_ON_OFF=9;
    public static final int RULE_MINUS=16;
    public static final int RULE_STRING=14;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=5;
    public static final int RULE_RPAREN=8;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_AT=25;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=10;
    public static final int RULE_OPTION_TYPE=36;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_NOT=21;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=7;
    public static final int T__59=59;
    public static final int RULE_LBRACE=18;
    public static final int RULE_BOR=23;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_MORE_THAN=29;
    public static final int RULE_STATEMEN_TYPE=34;
    public static final int RULE_PLUS=17;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=38;
    public static final int RULE_COLON=13;
    public static final int RULE_ESC_CHAR=33;
    public static final int T__39=39;
    public static final int RULE_EQUALS=27;
    public static final int RULE_LESS_THAN=28;
    public static final int RULE_WS=4;
    public static final int RULE_MAPPING_TYPE=35;

    // delegates
    // delegators

    public InternalProcessorDslLexer() {;} 
    public InternalProcessorDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProcessorDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:11:7: ( '->' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:11:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:12:7: ( 'resolve references' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:12:9: 'resolve references'
            {
            match("resolve references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:13:7: ( 'database' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:13:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:14:7: ( 'pojogen' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:14:9: 'pojogen'
            {
            match("pojogen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:15:7: ( 'online' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:15:9: 'online'
            {
            match("online"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:16:7: ( 'url' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:16:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:17:7: ( 'username' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:17:9: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:18:7: ( 'password' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:18:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:19:7: ( 'schema' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:19:9: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:20:7: ( 'driver' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:20:9: 'driver'
            {
            match("driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:21:7: ( 'types-sqltypes' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:21:9: 'types-sqltypes'
            {
            match("types-sqltypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:22:7: ( 'types-in-table' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:22:9: 'types-in-table'
            {
            match("types-in-table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:23:7: ( 'types-for-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:23:9: 'types-for-columns'
            {
            match("types-for-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:24:7: ( 'ignore-tables' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:24:9: 'ignore-tables'
            {
            match("ignore-tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:25:7: ( 'only-tables' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:25:9: 'only-tables'
            {
            match("only-tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:26:7: ( 'ignore-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:26:9: 'ignore-columns'
            {
            match("ignore-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:27:7: ( 'required-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:27:9: 'required-columns'
            {
            match("required-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:28:7: ( 'not-required-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:28:9: 'not-required-columns'
            {
            match("not-required-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:29:7: ( 'create-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:29:9: 'create-columns'
            {
            match("create-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:30:7: ( 'rename-tables' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:30:9: 'rename-tables'
            {
            match("rename-tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:31:7: ( 'rename-columns' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:31:9: 'rename-columns'
            {
            match("rename-columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:32:7: ( 'ignore-one-to-many' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:32:9: 'ignore-one-to-many'
            {
            match("ignore-one-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:33:7: ( 'ignore-many-to-one' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:33:9: 'ignore-many-to-one'
            {
            match("ignore-many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:34:7: ( 'inherit-many-to-one' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:34:9: 'inherit-many-to-one'
            {
            match("inherit-many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:35:7: ( 'create-one-to-many' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:35:9: 'create-one-to-many'
            {
            match("create-one-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:36:7: ( 'create-many-to-one' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:36:9: 'create-many-to-one'
            {
            match("create-many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:37:7: ( 'table-many-to-many' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:37:9: 'table-many-to-many'
            {
            match("table-many-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:38:7: ( 'inherit-discriminator' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:38:9: 'inherit-discriminator'
            {
            match("inherit-discriminator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:39:7: ( 'generate-methods' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:39:9: 'generate-methods'
            {
            match("generate-methods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:40:7: ( 'implements' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:40:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:41:7: ( 'extends' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:41:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:42:7: ( 'pojo' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:42:9: 'pojo'
            {
            match("pojo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:43:7: ( 'col' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:43:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:44:7: ( 'ident' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:44:9: 'ident'
            {
            match("ident"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:45:7: ( 'const' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:45:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:46:7: ( 'out' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:46:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:47:7: ( 'colx' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:47:9: 'colx'
            {
            match("colx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:48:7: ( 'identx' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:48:9: 'identx'
            {
            match("identx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:49:7: ( 'constx' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:49:9: 'constx'
            {
            match("constx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:50:7: ( 'outx' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:50:9: 'outx'
            {
            match("outx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:51:7: ( 'table' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:51:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:52:7: ( 'dbcol' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:52:9: 'dbcol'
            {
            match("dbcol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:53:7: ( 'prefix' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:53:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:54:7: ( '_char' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:54:9: '_char'
            {
            match("_char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:55:7: ( '_byte' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:55:9: '_byte'
            {
            match("_byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:56:7: ( '_short' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:56:9: '_short'
            {
            match("_short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:57:7: ( '_int' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:57:9: '_int'
            {
            match("_int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:58:7: ( '_long' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:58:9: '_long'
            {
            match("_long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:59:7: ( '_float' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:59:9: '_float'
            {
            match("_float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:60:7: ( '_double' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:60:9: '_double'
            {
            match("_double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:61:7: ( '_boolean' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:61:9: '_boolean'
            {
            match("_boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:62:7: ( '[]' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:62:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:63:7: ( 'package' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:63:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:64:7: ( 'suffix' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:64:9: 'suffix'
            {
            match("suffix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:65:7: ( 'import' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:65:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:66:7: ( 'final' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:66:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:67:7: ( 'abstract' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:67:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:68:7: ( 'discriminator' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:68:9: 'discriminator'
            {
            match("discriminator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:69:7: ( 'serializable' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:69:9: 'serializable'
            {
            match("serializable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:70:7: ( 'required' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:70:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:71:7: ( 'primaryKey' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:71:9: 'primaryKey'
            {
            match("primaryKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:72:8: ( '.*' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:72:10: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_ON_OFF"
    public final void mRULE_ON_OFF() throws RecognitionException {
        try {
            int _type = RULE_ON_OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9535:13: ( ( 'ON' | 'OFF' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9535:15: ( 'ON' | 'OFF' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9535:15: ( 'ON' | 'OFF' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='N') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='F') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

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
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9535:16: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9535:21: 'OFF'
                    {
                    match("OFF"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ON_OFF"

    // $ANTLR start "RULE_STATEMEN_TYPE"
    public final void mRULE_STATEMEN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_STATEMEN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:20: ( ( 'QRY' | 'CRUD' | 'CALL' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:22: ( 'QRY' | 'CRUD' | 'CALL' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:22: ( 'QRY' | 'CRUD' | 'CALL' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='Q') ) {
                alt2=1;
            }
            else if ( (LA2_0=='C') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='R') ) {
                    alt2=2;
                }
                else if ( (LA2_2=='A') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:23: 'QRY'
                    {
                    match("QRY"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:29: 'CRUD'
                    {
                    match("CRUD"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9537:36: 'CALL'
                    {
                    match("CALL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMEN_TYPE"

    // $ANTLR start "RULE_MAPPING_TYPE"
    public final void mRULE_MAPPING_TYPE() throws RecognitionException {
        try {
            int _type = RULE_MAPPING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9539:19: ( 'OUT' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9539:21: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAPPING_TYPE"

    // $ANTLR start "RULE_OPTION_TYPE"
    public final void mRULE_OPTION_TYPE() throws RecognitionException {
        try {
            int _type = RULE_OPTION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:18: ( ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt3=1;
                }
                break;
            case 'L':
                {
                alt3=2;
                }
                break;
            case 'I':
                {
                alt3=3;
                }
                break;
            case 'S':
                {
                alt3=4;
                }
                break;
            case 'B':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:21: 'OPT'
                    {
                    match("OPT"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:27: 'LOPT'
                    {
                    match("LOPT"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:34: 'IOPT'
                    {
                    match("IOPT"); 


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:41: 'SOPT'
                    {
                    match("SOPT"); 


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9541:48: 'BOPT'
                    {
                    match("BOPT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTION_TYPE"

    // $ANTLR start "RULE_IDENT_DOT"
    public final void mRULE_IDENT_DOT() throws RecognitionException {
        try {
            int _type = RULE_IDENT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9543:16: ( RULE_IDENT ( '.' RULE_IDENT )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9543:18: RULE_IDENT ( '.' RULE_IDENT )+
            {
            mRULE_IDENT(); 
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9543:29: ( '.' RULE_IDENT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9543:30: '.' RULE_IDENT
            	    {
            	    match('.'); 
            	    mRULE_IDENT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT_DOT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9545:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9545:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9545:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='='||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9547:13: ( ( '0' .. '9' )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9547:15: ( '0' .. '9' )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9547:15: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9547:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ESC_CHAR"
    public final void mRULE_ESC_CHAR() throws RecognitionException {
        try {
            int _type = RULE_ESC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9549:15: ( '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9549:17: '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' )
            {
            match('\\'); 
            if ( (input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='@'||(input.LA(1)>='{' && input.LA(1)<='}') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC_CHAR"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9551:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9551:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9551:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9551:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9553:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9555:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9555:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9555:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9557:10: ( '&' '&' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9557:12: '&' '&'
            {
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9559:9: ( '|' '|' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9559:11: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9561:12: ( ':' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9561:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9563:16: ( ';' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9563:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9565:13: ( '$' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9565:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9567:12: ( ',' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9567:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9569:12: ( '-' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9569:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9571:11: ( '+' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9571:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9573:13: ( '(' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9573:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9575:13: ( ')' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9575:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9577:13: ( '{' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9577:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9579:13: ( '}' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9579:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_QUESTI"
    public final void mRULE_QUESTI() throws RecognitionException {
        try {
            int _type = RULE_QUESTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9581:13: ( '?' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9581:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTI"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9583:10: ( '!' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9583:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_BAND"
    public final void mRULE_BAND() throws RecognitionException {
        try {
            int _type = RULE_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9585:11: ( '&' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9585:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAND"

    // $ANTLR start "RULE_BOR"
    public final void mRULE_BOR() throws RecognitionException {
        try {
            int _type = RULE_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9587:10: ( '|' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9587:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9589:11: ( '#' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9589:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9591:9: ( '@' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9591:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9593:12: ( '^' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9593:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9595:13: ( '=' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9595:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_LESS_THAN"
    public final void mRULE_LESS_THAN() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9597:16: ( '<' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9597:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN"

    // $ANTLR start "RULE_MORE_THAN"
    public final void mRULE_MORE_THAN() throws RecognitionException {
        try {
            int _type = RULE_MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9599:16: ( '>' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9599:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORE_THAN"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9601:14: ( '%' )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9601:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_REST"
    public final void mRULE_REST() throws RecognitionException {
        try {
            int _type = RULE_REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9603:11: (~ ( RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:9603:13: ~ ( RULE_SEMICOLON )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REST"

    public void mTokens() throws RecognitionException {
        // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST )
        int alt12=97;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:268: T__82
                {
                mT__82(); 

                }
                break;
            case 45 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:274: T__83
                {
                mT__83(); 

                }
                break;
            case 46 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:280: T__84
                {
                mT__84(); 

                }
                break;
            case 47 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:286: T__85
                {
                mT__85(); 

                }
                break;
            case 48 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:292: T__86
                {
                mT__86(); 

                }
                break;
            case 49 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:298: T__87
                {
                mT__87(); 

                }
                break;
            case 50 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:304: T__88
                {
                mT__88(); 

                }
                break;
            case 51 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:310: T__89
                {
                mT__89(); 

                }
                break;
            case 52 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:316: T__90
                {
                mT__90(); 

                }
                break;
            case 53 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:322: T__91
                {
                mT__91(); 

                }
                break;
            case 54 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:328: T__92
                {
                mT__92(); 

                }
                break;
            case 55 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:334: T__93
                {
                mT__93(); 

                }
                break;
            case 56 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:340: T__94
                {
                mT__94(); 

                }
                break;
            case 57 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:346: T__95
                {
                mT__95(); 

                }
                break;
            case 58 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:352: T__96
                {
                mT__96(); 

                }
                break;
            case 59 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:358: T__97
                {
                mT__97(); 

                }
                break;
            case 60 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:364: T__98
                {
                mT__98(); 

                }
                break;
            case 61 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:370: T__99
                {
                mT__99(); 

                }
                break;
            case 62 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:376: T__100
                {
                mT__100(); 

                }
                break;
            case 63 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:383: RULE_ON_OFF
                {
                mRULE_ON_OFF(); 

                }
                break;
            case 64 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:395: RULE_STATEMEN_TYPE
                {
                mRULE_STATEMEN_TYPE(); 

                }
                break;
            case 65 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:414: RULE_MAPPING_TYPE
                {
                mRULE_MAPPING_TYPE(); 

                }
                break;
            case 66 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:432: RULE_OPTION_TYPE
                {
                mRULE_OPTION_TYPE(); 

                }
                break;
            case 67 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:449: RULE_IDENT_DOT
                {
                mRULE_IDENT_DOT(); 

                }
                break;
            case 68 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:464: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 69 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:475: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 70 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:487: RULE_ESC_CHAR
                {
                mRULE_ESC_CHAR(); 

                }
                break;
            case 71 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:501: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:517: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:533: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:541: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 75 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:550: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 76 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:558: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 77 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:569: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 78 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:584: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 79 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:596: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 80 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:607: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 81 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:618: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 82 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:628: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 83 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:640: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 84 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:652: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 85 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:664: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 86 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:676: RULE_QUESTI
                {
                mRULE_QUESTI(); 

                }
                break;
            case 87 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:688: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 88 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:697: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 89 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:707: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 90 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:716: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 91 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:726: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 92 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:734: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 93 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:745: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 94 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:757: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 95 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:772: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 96 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:787: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 97 :
                // ../org.sqlproc.dsl/src-gen/org/sqlproc/dsl/parser/antlr/internal/InternalProcessorDsl.g:1:800: RULE_REST
                {
                mRULE_REST(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\65\14\70\2\63\2\70\1\63\10\70\1\uffff\2\63\1\uffff\1"+
        "\157\1\161\25\uffff\2\70\2\uffff\31\70\10\uffff\2\70\1\uffff\1\u00a6"+
        "\12\70\32\uffff\15\70\1\u00c0\1\u00c1\14\70\1\u00d0\3\70\2\uffff"+
        "\2\70\1\uffff\1\u00a6\1\u00d6\1\u00d7\1\u00d8\15\70\1\u00e7\6\70"+
        "\1\u00ee\2\uffff\13\70\1\uffff\1\70\1\u00fb\1\uffff\5\70\3\uffff"+
        "\2\u00d8\4\u00d7\5\70\1\u0106\2\70\1\uffff\5\70\2\uffff\5\70\1\u0114"+
        "\4\70\1\u011a\1\70\1\uffff\1\u011d\2\70\1\u0120\5\70\1\u0126\1\uffff"+
        "\4\70\1\u012b\1\70\1\u012d\1\70\1\u012f\1\u0130\1\70\3\uffff\3\70"+
        "\1\u0138\1\u0139\1\uffff\1\70\1\u013b\1\uffff\2\70\1\uffff\3\70"+
        "\1\uffff\1\70\1\uffff\1\70\1\u0145\1\70\1\u0147\1\uffff\1\70\1\uffff"+
        "\1\70\2\uffff\1\70\4\uffff\2\70\4\uffff\1\70\1\u0155\1\70\1\uffff"+
        "\1\u0158\2\uffff\1\u0159\1\70\1\uffff\1\u015b\1\uffff\1\70\1\u015d"+
        "\1\70\5\uffff\1\70\3\uffff\1\70\1\uffff\1\u0163\3\uffff\1\70\1\uffff"+
        "\1\70\1\uffff\1\70\2\uffff\1\70\2\uffff\1\70\1\u0169\1\70\1\u016b"+
        "\1\70\1\uffff\1\70\1\uffff\1\70\1\u016f\1\u0170\2\uffff";
    static final String DFA12_eofS =
        "\u0171\uffff";
    static final String DFA12_minS =
        "\1\0\1\76\14\56\1\142\1\135\2\56\1\52\10\56\1\uffff\1\43\1\52\1"+
        "\uffff\1\46\1\174\25\uffff\2\56\2\uffff\31\56\1\uffff\1\157\6\uffff"+
        "\2\56\1\uffff\13\56\32\uffff\31\56\1\55\5\56\2\uffff\2\56\1\uffff"+
        "\27\56\1\55\1\56\2\uffff\13\56\1\uffff\2\56\1\uffff\5\56\3\uffff"+
        "\16\56\1\uffff\5\56\2\uffff\4\56\2\55\6\56\1\uffff\7\56\1\55\2\56"+
        "\1\uffff\13\56\1\146\2\uffff\1\55\4\56\1\uffff\1\55\1\56\1\uffff"+
        "\2\56\1\uffff\1\56\1\40\1\56\1\143\1\56\1\uffff\4\56\1\uffff\1\56"+
        "\1\uffff\1\56\2\uffff\1\56\3\uffff\1\143\1\55\1\56\2\uffff\1\143"+
        "\1\uffff\3\56\1\uffff\1\55\2\uffff\2\56\1\uffff\1\56\1\uffff\3\56"+
        "\4\uffff\1\144\1\56\3\uffff\1\55\1\uffff\1\56\3\uffff\1\56\1\uffff"+
        "\1\56\1\uffff\1\56\2\uffff\1\56\2\uffff\5\56\1\uffff\1\56\1\uffff"+
        "\3\56\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\76\14\172\1\163\1\135\2\172\1\52\10\172\1\uffff\1\175"+
        "\1\57\1\uffff\1\46\1\174\25\uffff\2\172\2\uffff\31\172\1\uffff\1"+
        "\171\6\uffff\2\172\1\uffff\13\172\32\uffff\37\172\2\uffff\2\172"+
        "\1\uffff\31\172\2\uffff\13\172\1\uffff\2\172\1\uffff\5\172\3\uffff"+
        "\16\172\1\uffff\5\172\2\uffff\14\172\1\uffff\12\172\1\uffff\13\172"+
        "\1\163\2\uffff\5\172\1\uffff\2\172\1\uffff\2\172\1\uffff\3\172\1"+
        "\164\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172"+
        "\3\uffff\1\164\2\172\2\uffff\1\157\1\uffff\3\172\1\uffff\1\172\2"+
        "\uffff\2\172\1\uffff\1\172\1\uffff\3\172\4\uffff\1\155\1\172\3\uffff"+
        "\1\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2"+
        "\uffff\1\172\2\uffff\5\172\1\uffff\1\172\1\uffff\3\172\2\uffff";
    static final String DFA12_acceptS =
        "\33\uffff\1\105\2\uffff\1\111\2\uffff\1\114\1\115\1\116\1\117\1"+
        "\121\1\122\1\123\1\124\1\125\1\126\1\127\1\132\1\133\1\134\1\135"+
        "\1\136\1\137\1\140\1\141\1\1\1\120\2\uffff\1\104\1\103\31\uffff"+
        "\1\54\1\uffff\1\56\1\57\1\60\1\61\1\62\1\64\2\uffff\1\76\13\uffff"+
        "\1\105\1\106\1\107\1\110\1\111\1\112\1\130\1\113\1\131\1\114\1\116"+
        "\1\117\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\132\1\133\1\134"+
        "\1\135\1\136\1\137\1\140\37\uffff\1\55\1\63\2\uffff\1\77\31\uffff"+
        "\1\44\1\6\13\uffff\1\22\2\uffff\1\41\5\uffff\1\101\1\102\1\100\16"+
        "\uffff\1\40\5\uffff\1\17\1\50\14\uffff\1\45\12\uffff\1\52\14\uffff"+
        "\1\33\1\51\5\uffff\1\42\2\uffff\1\43\2\uffff\1\70\5\uffff\1\12\4"+
        "\uffff\1\53\1\uffff\1\5\1\uffff\1\11\1\66\1\uffff\1\13\1\14\1\15"+
        "\3\uffff\1\67\1\46\1\uffff\1\47\3\uffff\1\2\1\uffff\1\24\1\25\2"+
        "\uffff\1\4\1\uffff\1\65\3\uffff\1\16\1\20\1\26\1\27\2\uffff\1\23"+
        "\1\31\1\32\1\uffff\1\37\1\uffff\1\21\1\74\1\3\1\uffff\1\10\1\uffff"+
        "\1\7\1\uffff\1\30\1\34\1\uffff\1\35\1\71\5\uffff\1\75\1\uffff\1"+
        "\36\3\uffff\1\73\1\72";
    static final String DFA12_specialS =
        "\1\0\u0170\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\63\2\36\2\63\1\36\22\63\1\36\1\53\1\63\1\54\1\43\1\62\1"+
            "\37\1\63\1\46\1\47\1\63\1\45\1\44\1\1\1\22\1\35\12\33\1\41\1"+
            "\42\1\60\1\57\1\61\1\52\1\55\1\32\1\31\1\25\5\32\1\27\2\32\1"+
            "\26\2\32\1\23\1\32\1\24\1\32\1\30\7\32\1\17\1\34\1\63\1\56\1"+
            "\16\1\63\1\21\1\32\1\13\1\3\1\15\1\20\1\14\1\32\1\11\4\32\1"+
            "\12\1\5\1\4\1\32\1\2\1\7\1\10\1\6\5\32\1\50\1\40\1\51\uff82"+
            "\63",
            "\1\64",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\66\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\72\1\74\6\67\1\75\10\67\1\73\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\77\15\67\1\76\2\67\1\100\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\101\6\67\1\102\5\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\103\1\104\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\105\1\67\1\107\17\67\1\106\5\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\111\27\67\1\110\1\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\3\67\1\115\2\67\1\112\5\67\1\114\1\113\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\116\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\120\2\67\1\117\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\121\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\122\2\67",
            "\1\124\1\123\1\131\1\uffff\1\130\2\uffff\1\126\2\uffff\1\127"+
            "\6\uffff\1\125",
            "\1\132",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\133\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\67\1\134\30\67",
            "\1\135",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\5\67\1\137\7\67\1"+
            "\136\1\67\1\141\4\67\1\140\5\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\21\67\1\142\10\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\1\144\20\67\1\143"+
            "\10\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\16\67\1\145\13\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\16\67\1\146\13\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\16\67\1\147\13\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\16\67\1\150\13\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\3\152\10\uffff\2\152\12\uffff\2\152\4\uffff\1\152\72\uffff"+
            "\3\152",
            "\1\153\4\uffff\1\154",
            "",
            "\1\156",
            "\1\160",
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
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u0085\2\67\1\u0084\1\67\1\u0083\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0086\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u0087\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\u0088\27\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u0089\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\11\67\1\u008a\20\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\u008c\17\67\1\u008b\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u008d\3\67\1\u008e\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u008f\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0090\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u0091\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0092\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\7\67\1\u0093\22\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\5\67\1\u0094\24\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u0095\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\17\67\1\u0096\12\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\67\1\u0097\30\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u0098\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\7\67\1\u0099\22\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\17\67\1\u009a\12\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u009b\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u009c\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u009d\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u009e\1\67\1\u009f\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00a0\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u00a1\6\67",
            "",
            "\1\u00a3\11\uffff\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00a4\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u00a5\7\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\5\67\1\u00a7\24\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00a8\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00a9\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\30\67\1\u00aa\1\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\24\67\1\u00ab\5\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\13\67\1\u00ac\16\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\17\67\1\u00ad\12\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\17\67\1\u00ae\12\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\17\67\1\u00af\12\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\17\67\1\u00b0\12\67"+
            "\4\uffff\1\67\1\uffff\32\67",
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
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u00b1\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\24\67\1\u00b2\5\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00b3\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00b4\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\25\67\1\u00b5\4\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u00b6\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\u00b7\27\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u00b8\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u00b9\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\12\67\1\u00ba\17\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\5\67\1\u00bb\24\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u00bc\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u00bd\17\67\1\u00be\1\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u00bf\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00c2\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00c3\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\5\67\1\u00c4\24\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u00c5\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00c6\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u00c7\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u00c8\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00c9\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u00ca\2\67\1\u00cb\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00cc\14\67",
            "\1\u00cd\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00ce\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u00cf\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u00d1\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00d2\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00d3\25\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00d4\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u00d5\6\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\3\67\1\u00d9\26\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\13\67\1\u00da\16\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00db\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00dc\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00dd\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\23\67\1\u00de\6\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u00df\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u00e0\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u00e1\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\67\1\u00e2\30\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00e3\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u00e4\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00e5\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\6\67\1\u00e6\23\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\26\67\1\u00e8\3\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00e9\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u00ea\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00eb\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00ec\14\67",
            "\1\u00ed\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00ef\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u00f0\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u00f1\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u00f2\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u00f3\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00f4\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00f5\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00f6\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u00f7\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00f8\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u00f9\6\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u00fa\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u00fc\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u00fd\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u00fe\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u00ff\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u0100\10\67",
            "",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\25\67\1\u0101\4\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u0102\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0103\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u0104\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u0105\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u0107\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0108\25\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u0109\13\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\6\67\1\u010a\23\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u010b\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u010c\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u010d\25\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u010e\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u010f\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u0110\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u0111\16\67",
            "\1\u0112\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\u0113\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0115\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u0116\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u0117\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0118\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u0119\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u011b\25\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\27\67\1\u011c\2\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u011e\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\3\67\1\u011f\26\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u0121\31\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0122\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0123\25\67",
            "\1\u0124\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u0125\7\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u0127\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u0128\14\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u0129\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u012a\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\30\67\1\u012c\1\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\14\67\1\u012e\15\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u0131\21\67",
            "\1\u0134\2\uffff\1\u0133\11\uffff\1\u0132",
            "",
            "",
            "\1\u0135\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0136\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0137\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\u013a\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u013c\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u013d\7\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\2\67\1\u013e\27\67",
            "\1\u013f\15\uffff\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32"+
            "\67\4\uffff\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\3\67\1\u0140\26\67",
            "\1\u0142\20\uffff\1\u0141",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0143\25\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\10\67\1\u0144\21\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\3\67\1\u0146\26\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\12\67\1\u0148\17\67"+
            "\4\uffff\1\67\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0149\25\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\31\67\1\u014a",
            "",
            "",
            "",
            "\1\u014c\11\uffff\1\u014e\1\uffff\1\u014d\4\uffff\1\u014b",
            "\1\u014f\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u0150\14\67",
            "",
            "",
            "\1\u0151\11\uffff\1\u0153\1\uffff\1\u0152",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u0154\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0156\6\67",
            "",
            "\1\u0157\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\15\67\1\u015a\14\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u015c\25\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u015e\31\67",
            "",
            "",
            "",
            "",
            "\1\u0160\10\uffff\1\u015f",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0161\6\67",
            "",
            "",
            "",
            "\1\u0162\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff"+
            "\1\67\1\uffff\32\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\u0164\31\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\30\67\1\u0165\1\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\1\67\1\u0166\30\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\22\67\1\u0167\7\67",
            "",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\23\67\1\u0168\6\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\13\67\1\u016a\16\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\16\67\1\u016c\13\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\4\67\1\u016d\25\67",
            "",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\21\67\1\u016e\10\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "\1\71\1\uffff\12\67\3\uffff\1\67\3\uffff\32\67\4\uffff\1\67"+
            "\1\uffff\32\67",
            "",
            ""
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
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='r') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='p') ) {s = 4;}

                        else if ( (LA12_0=='o') ) {s = 5;}

                        else if ( (LA12_0=='u') ) {s = 6;}

                        else if ( (LA12_0=='s') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0=='i') ) {s = 9;}

                        else if ( (LA12_0=='n') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='g') ) {s = 12;}

                        else if ( (LA12_0=='e') ) {s = 13;}

                        else if ( (LA12_0=='_') ) {s = 14;}

                        else if ( (LA12_0=='[') ) {s = 15;}

                        else if ( (LA12_0=='f') ) {s = 16;}

                        else if ( (LA12_0=='a') ) {s = 17;}

                        else if ( (LA12_0=='.') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='Q') ) {s = 20;}

                        else if ( (LA12_0=='C') ) {s = 21;}

                        else if ( (LA12_0=='L') ) {s = 22;}

                        else if ( (LA12_0=='I') ) {s = 23;}

                        else if ( (LA12_0=='S') ) {s = 24;}

                        else if ( (LA12_0=='B') ) {s = 25;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||LA12_0=='P'||LA12_0=='R'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='b'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='\\') ) {s = 28;}

                        else if ( (LA12_0=='/') ) {s = 29;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 30;}

                        else if ( (LA12_0=='&') ) {s = 31;}

                        else if ( (LA12_0=='|') ) {s = 32;}

                        else if ( (LA12_0==':') ) {s = 33;}

                        else if ( (LA12_0==';') ) {s = 34;}

                        else if ( (LA12_0=='$') ) {s = 35;}

                        else if ( (LA12_0==',') ) {s = 36;}

                        else if ( (LA12_0=='+') ) {s = 37;}

                        else if ( (LA12_0=='(') ) {s = 38;}

                        else if ( (LA12_0==')') ) {s = 39;}

                        else if ( (LA12_0=='{') ) {s = 40;}

                        else if ( (LA12_0=='}') ) {s = 41;}

                        else if ( (LA12_0=='?') ) {s = 42;}

                        else if ( (LA12_0=='!') ) {s = 43;}

                        else if ( (LA12_0=='#') ) {s = 44;}

                        else if ( (LA12_0=='@') ) {s = 45;}

                        else if ( (LA12_0=='^') ) {s = 46;}

                        else if ( (LA12_0=='=') ) {s = 47;}

                        else if ( (LA12_0=='<') ) {s = 48;}

                        else if ( (LA12_0=='>') ) {s = 49;}

                        else if ( (LA12_0=='%') ) {s = 50;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='\"'||LA12_0=='\''||LA12_0=='*'||LA12_0==']'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 51;}

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