package org.sqlproc.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessorDslLexer extends Lexer {
    public static final int RULE_PERCENT=27;
    public static final int RULE_OR=29;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_REST=4;
    public static final int T__90=90;
    public static final int RULE_LPAREN=13;
    public static final int RULE_IDENT_DOT=5;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_BAND=19;
    public static final int T__80=80;
    public static final int RULE_RBRACE=16;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HASH=21;
    public static final int RULE_COMMA=10;
    public static final int T__85=85;
    public static final int RULE_QUESTI=17;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=37;
    public static final int RULE_ON_OFF=31;
    public static final int RULE_MINUS=11;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=6;
    public static final int RULE_RPAREN=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_AT=22;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=36;
    public static final int RULE_OPTION_TYPE=34;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_NOT=18;
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
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int RULE_LBRACE=15;
    public static final int RULE_BOR=20;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=23;
    public static final int T__48=48;
    public static final int RULE_MORE_THAN=26;
    public static final int T__49=49;
    public static final int RULE_PLUS=12;
    public static final int RULE_STATEMEN_TYPE=32;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=38;
    public static final int RULE_COLON=8;
    public static final int RULE_ESC_CHAR=30;
    public static final int T__39=39;
    public static final int RULE_EQUALS=24;
    public static final int RULE_LESS_THAN=25;
    public static final int RULE_WS=35;
    public static final int RULE_MAPPING_TYPE=33;

    // delegates
    // delegators

    public InternalProcessorDslLexer() {;} 
    public InternalProcessorDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProcessorDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:7: ( '_char' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:9: '_char'
            {
            match("_char"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:7: ( '_byte' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:9: '_byte'
            {
            match("_byte"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:7: ( '_short' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:9: '_short'
            {
            match("_short"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:7: ( '_int' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:9: '_int'
            {
            match("_int"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:7: ( '_long' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:9: '_long'
            {
            match("_long"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:7: ( '_float' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:9: '_float'
            {
            match("_float"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:7: ( '_double' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:9: '_double'
            {
            match("_double"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:7: ( '_boolean' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:9: '_boolean'
            {
            match("_boolean"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:7: ( '->' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:9: '->'
            {
            match("->"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:7: ( 'pojo' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:9: 'pojo'
            {
            match("pojo"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:7: ( 'col' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:9: 'col'
            {
            match("col"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:7: ( 'ident' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:9: 'ident'
            {
            match("ident"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:7: ( 'const' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:9: 'const'
            {
            match("const"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:7: ( 'out' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:9: 'out'
            {
            match("out"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:7: ( 'colx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:9: 'colx'
            {
            match("colx"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:7: ( 'identx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:9: 'identx'
            {
            match("identx"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:7: ( 'constx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:9: 'constx'
            {
            match("constx"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:7: ( 'outx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:9: 'outx'
            {
            match("outx"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:7: ( 'table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:9: 'table'
            {
            match("table"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:7: ( 'dbcol' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:9: 'dbcol'
            {
            match("dbcol"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:7: ( 'prefix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:9: 'prefix'
            {
            match("prefix"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:7: ( 'package' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:9: 'package'
            {
            match("package"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:7: ( 'suffix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:9: 'suffix'
            {
            match("suffix"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:7: ( 'import' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:9: 'import'
            {
            match("import"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:7: ( 'implements' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:9: 'implements'
            {
            match("implements"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:7: ( 'extends' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:9: 'extends'
            {
            match("extends"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:7: ( 'discriminator' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:9: 'discriminator'
            {
            match("discriminator"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:7: ( 'serializable' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:9: 'serializable'
            {
            match("serializable"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:7: ( '.*' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:9: '.*'
            {
            match(".*"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:7: ( 'resolve-pojo-on' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:9: 'resolve-pojo-on'
            {
            match("resolve-pojo-on"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:7: ( 'resolve-pojo-off' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:9: 'resolve-pojo-off'
            {
            match("resolve-pojo-off"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:7: ( 'database-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:9: 'database-'
            {
            match("database-"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:7: ( 'pojogen-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:9: 'pojogen-'
            {
            match("pojogen-"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:7: ( 'is-online' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:9: 'is-online'
            {
            match("is-online"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:7: ( 'is-offline' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:9: 'is-offline'
            {
            match("is-offline"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:46:7: ( 'has-url' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:46:9: 'has-url'
            {
            match("has-url"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:47:7: ( 'login-username' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:47:9: 'login-username'
            {
            match("login-username"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:48:7: ( 'login-password' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:48:9: 'login-password'
            {
            match("login-password"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:49:7: ( 'active-schema' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:49:9: 'active-schema'
            {
            match("active-schema"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:50:7: ( 'jdbc-driver' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:50:9: 'jdbc-driver'
            {
            match("jdbc-driver"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:51:7: ( 'types-sqltypes' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:51:9: 'types-sqltypes'
            {
            match("types-sqltypes"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:52:7: ( 'types-in-table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:52:9: 'types-in-table'
            {
            match("types-in-table"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:53:7: ( 'types-for-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:53:9: 'types-for-columns'
            {
            match("types-for-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:54:7: ( 'ignore-tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:54:9: 'ignore-tables'
            {
            match("ignore-tables"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:55:7: ( 'only-tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:55:9: 'only-tables'
            {
            match("only-tables"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:56:7: ( 'ignore-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:56:9: 'ignore-columns'
            {
            match("ignore-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:57:7: ( 'required-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:57:9: 'required-columns'
            {
            match("required-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:58:7: ( 'not-required-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:58:9: 'not-required-columns'
            {
            match("not-required-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:59:7: ( 'create-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:59:9: 'create-columns'
            {
            match("create-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:60:7: ( 'rename-tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:60:9: 'rename-tables'
            {
            match("rename-tables"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:61:7: ( 'rename-columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:61:9: 'rename-columns'
            {
            match("rename-columns"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:62:7: ( 'ignore-one-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:62:9: 'ignore-one-to-many'
            {
            match("ignore-one-to-many"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:63:7: ( 'ignore-many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:63:9: 'ignore-many-to-one'
            {
            match("ignore-many-to-one"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:64:7: ( 'inherit-many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:64:9: 'inherit-many-to-one'
            {
            match("inherit-many-to-one"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:65:7: ( 'create-one-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:65:9: 'create-one-to-many'
            {
            match("create-one-to-many"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:66:7: ( 'create-many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:66:9: 'create-many-to-one'
            {
            match("create-many-to-one"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:67:7: ( 'table-many-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:67:9: 'table-many-to-many'
            {
            match("table-many-to-many"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:68:7: ( 'inherit-discriminator' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:68:9: 'inherit-discriminator'
            {
            match("inherit-discriminator"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:69:7: ( 'generate-methods' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:69:9: 'generate-methods'
            {
            match("generate-methods"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:70:7: ( 'implements-interfaces' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:70:9: 'implements-interfaces'
            {
            match("implements-interfaces"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:71:7: ( 'extends-class' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:71:9: 'extends-class'
            {
            match("extends-class"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:72:8: ( '[]' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:72:10: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:73:8: ( 'final' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:73:10: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:74:8: ( 'abstract' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:74:10: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:75:8: ( 'required' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:75:10: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:76:8: ( 'primaryKey' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:76:10: 'primaryKey'
            {
            match("primaryKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "RULE_ON_OFF"
    public final void mRULE_ON_OFF() throws RecognitionException {
        try {
            int _type = RULE_ON_OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24866:13: ( ( 'ON' | 'OFF' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24866:15: ( 'ON' | 'OFF' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24866:15: ( 'ON' | 'OFF' )
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
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24866:16: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24866:21: 'OFF'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:20: ( ( 'QRY' | 'CRUD' | 'CALL' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:22: ( 'QRY' | 'CRUD' | 'CALL' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:22: ( 'QRY' | 'CRUD' | 'CALL' )
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
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:23: 'QRY'
                    {
                    match("QRY"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:29: 'CRUD'
                    {
                    match("CRUD"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24868:36: 'CALL'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24870:19: ( 'OUT' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24870:21: 'OUT'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:18: ( ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
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
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:21: 'OPT'
                    {
                    match("OPT"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:27: 'LOPT'
                    {
                    match("LOPT"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:34: 'IOPT'
                    {
                    match("IOPT"); 


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:41: 'SOPT'
                    {
                    match("SOPT"); 


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24872:48: 'BOPT'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24874:16: ( RULE_IDENT ( '.' RULE_IDENT )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24874:18: RULE_IDENT ( '.' RULE_IDENT )+
            {
            mRULE_IDENT(); 
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24874:29: ( '.' RULE_IDENT )+
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
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24874:30: '.' RULE_IDENT
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24876:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24876:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24876:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='='||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24878:13: ( ( '0' .. '9' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24878:15: ( '0' .. '9' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24878:15: ( '0' .. '9' )+
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
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24878:16: '0' .. '9'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24880:15: ( '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24880:17: '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' )
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24882:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24882:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24882:24: ( options {greedy=false; } : . )*
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
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24882:52: .
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24884:41: '\\r'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24886:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24886:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24886:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24888:10: ( '&' '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24888:12: '&' '&'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24890:9: ( '|' '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24890:11: '|' '|'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24892:12: ( ':' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24892:14: ':'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24894:16: ( ';' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24894:18: ';'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24896:13: ( '$' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24896:15: '$'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24898:12: ( ',' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24898:14: ','
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24900:12: ( '-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24900:14: '-'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24902:11: ( '+' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24902:13: '+'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24904:13: ( '(' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24904:15: '('
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24906:13: ( ')' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24906:15: ')'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24908:13: ( '{' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24908:15: '{'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24910:13: ( '}' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24910:15: '}'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24912:13: ( '?' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24912:15: '?'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24914:10: ( '!' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24914:12: '!'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24916:11: ( '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24916:13: '&'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24918:10: ( '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24918:12: '|'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24920:11: ( '#' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24920:13: '#'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24922:9: ( '@' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24922:11: '@'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24924:12: ( '^' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24924:14: '^'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24926:13: ( '=' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24926:15: '='
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24928:16: ( '<' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24928:18: '<'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24930:16: ( '>' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24930:18: '>'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24932:14: ( '%' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24932:16: '%'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24934:11: (~ ( RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24934:13: ~ ( RULE_SEMICOLON )
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
        // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST )
        int alt12=101;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:268: T__82
                {
                mT__82(); 

                }
                break;
            case 45 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:274: T__83
                {
                mT__83(); 

                }
                break;
            case 46 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:280: T__84
                {
                mT__84(); 

                }
                break;
            case 47 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:286: T__85
                {
                mT__85(); 

                }
                break;
            case 48 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:292: T__86
                {
                mT__86(); 

                }
                break;
            case 49 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:298: T__87
                {
                mT__87(); 

                }
                break;
            case 50 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:304: T__88
                {
                mT__88(); 

                }
                break;
            case 51 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:310: T__89
                {
                mT__89(); 

                }
                break;
            case 52 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:316: T__90
                {
                mT__90(); 

                }
                break;
            case 53 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:322: T__91
                {
                mT__91(); 

                }
                break;
            case 54 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:328: T__92
                {
                mT__92(); 

                }
                break;
            case 55 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:334: T__93
                {
                mT__93(); 

                }
                break;
            case 56 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:340: T__94
                {
                mT__94(); 

                }
                break;
            case 57 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:346: T__95
                {
                mT__95(); 

                }
                break;
            case 58 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:352: T__96
                {
                mT__96(); 

                }
                break;
            case 59 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:358: T__97
                {
                mT__97(); 

                }
                break;
            case 60 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:364: T__98
                {
                mT__98(); 

                }
                break;
            case 61 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:370: T__99
                {
                mT__99(); 

                }
                break;
            case 62 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:376: T__100
                {
                mT__100(); 

                }
                break;
            case 63 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:383: T__101
                {
                mT__101(); 

                }
                break;
            case 64 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:390: T__102
                {
                mT__102(); 

                }
                break;
            case 65 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:397: T__103
                {
                mT__103(); 

                }
                break;
            case 66 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:404: T__104
                {
                mT__104(); 

                }
                break;
            case 67 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:411: RULE_ON_OFF
                {
                mRULE_ON_OFF(); 

                }
                break;
            case 68 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:423: RULE_STATEMEN_TYPE
                {
                mRULE_STATEMEN_TYPE(); 

                }
                break;
            case 69 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:442: RULE_MAPPING_TYPE
                {
                mRULE_MAPPING_TYPE(); 

                }
                break;
            case 70 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:460: RULE_OPTION_TYPE
                {
                mRULE_OPTION_TYPE(); 

                }
                break;
            case 71 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:477: RULE_IDENT_DOT
                {
                mRULE_IDENT_DOT(); 

                }
                break;
            case 72 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:492: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 73 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:503: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 74 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:515: RULE_ESC_CHAR
                {
                mRULE_ESC_CHAR(); 

                }
                break;
            case 75 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:529: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:545: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 77 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:561: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 78 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:569: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 79 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:578: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 80 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:586: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 81 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:597: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 82 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:612: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 83 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:624: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 84 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:635: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 85 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:646: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 86 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:656: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 87 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:668: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 88 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:680: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 89 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:692: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 90 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:704: RULE_QUESTI
                {
                mRULE_QUESTI(); 

                }
                break;
            case 91 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:716: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 92 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:725: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 93 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:735: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 94 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:744: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 95 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:754: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 96 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:762: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 97 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:773: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 98 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:785: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 99 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:800: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 100 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:815: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 101 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:828: RULE_REST
                {
                mRULE_REST(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\65\1\76\10\103\1\65\7\103\1\65\11\103\1\uffff\2\65\1"+
        "\uffff\1\162\1\164\34\uffff\4\103\2\uffff\21\103\1\uffff\10\103"+
        "\1\uffff\1\103\1\u00a9\12\103\34\uffff\4\103\1\u00b9\4\103\1\uffff"+
        "\2\103\1\u00c3\24\103\1\uffff\1\u00a9\1\u00d8\1\u00d9\1\u00da\6"+
        "\103\1\u00e2\3\103\1\u00e6\1\uffff\5\103\1\uffff\2\103\1\u00f0\1"+
        "\uffff\14\103\1\uffff\4\103\1\uffff\2\103\3\uffff\2\u00da\4\u00d9"+
        "\1\103\1\uffff\3\103\1\uffff\1\u0108\1\103\1\u010b\2\103\2\uffff"+
        "\2\103\2\uffff\1\u0111\1\103\1\u0113\13\103\1\uffff\1\103\1\u0120"+
        "\1\103\1\u0122\2\103\1\u0125\1\uffff\1\103\1\u0127\1\uffff\1\u0128"+
        "\3\103\4\uffff\2\103\1\u0131\5\103\1\uffff\3\103\1\uffff\1\103\1"+
        "\uffff\1\103\1\u013e\4\uffff\1\103\1\uffff\1\103\3\uffff\2\103\1"+
        "\uffff\1\103\1\u014c\2\103\4\uffff\2\103\1\uffff\1\103\4\uffff\1"+
        "\103\5\uffff\3\103\3\uffff\1\u015c\2\uffff\1\u015d\3\103\2\uffff"+
        "\1\103\1\uffff\1\103\5\uffff\1\u0164\1\u0166\2\103\4\uffff\2\103"+
        "\1\uffff\1\103\1\u016e\1\uffff\1\u0170\6\uffff";
    static final String DFA12_eofS =
        "\u0174\uffff";
    static final String DFA12_minS =
        "\1\0\1\142\1\76\10\56\1\52\7\56\1\135\11\56\1\uffff\1\43\1\52\1"+
        "\uffff\1\46\1\174\24\uffff\1\157\7\uffff\4\56\2\uffff\4\56\1\55"+
        "\14\56\1\uffff\10\56\1\uffff\14\56\34\uffff\11\56\1\157\17\56\1"+
        "\55\4\56\1\55\2\56\1\uffff\17\56\1\uffff\5\56\1\146\3\56\1\uffff"+
        "\1\55\13\56\1\uffff\3\56\1\55\1\uffff\2\56\3\uffff\7\56\1\uffff"+
        "\3\56\1\uffff\5\56\2\uffff\2\56\2\uffff\2\55\11\56\1\55\2\56\1\uffff"+
        "\7\56\1\uffff\1\55\1\56\1\uffff\2\56\1\55\1\56\2\uffff\1\146\1\uffff"+
        "\7\56\1\55\1\160\1\55\2\56\1\uffff\1\55\1\uffff\2\56\1\uffff\1\143"+
        "\2\uffff\1\56\1\143\1\55\3\uffff\2\56\1\uffff\1\56\2\55\1\56\1\143"+
        "\3\uffff\2\56\1\uffff\1\56\4\uffff\1\56\4\uffff\1\144\1\56\1\55"+
        "\1\56\2\uffff\1\160\1\55\2\uffff\1\56\1\55\2\56\2\uffff\1\56\1\uffff"+
        "\1\56\1\157\4\uffff\1\56\1\55\2\56\1\152\3\uffff\2\56\1\157\2\56"+
        "\1\55\1\56\1\uffff\1\157\1\uffff\1\146\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\76\10\172\1\52\7\172\1\135\11\172\1\uffff\1\175"+
        "\1\57\1\uffff\1\46\1\174\24\uffff\1\171\7\uffff\4\172\2\uffff\21"+
        "\172\1\uffff\10\172\1\uffff\14\172\34\uffff\11\172\1\157\27\172"+
        "\1\uffff\17\172\1\uffff\5\172\1\156\3\172\1\uffff\14\172\1\uffff"+
        "\4\172\1\uffff\2\172\3\uffff\7\172\1\uffff\3\172\1\uffff\5\172\2"+
        "\uffff\2\172\2\uffff\16\172\1\uffff\7\172\1\uffff\2\172\1\uffff"+
        "\4\172\2\uffff\1\163\1\uffff\10\172\1\165\3\172\1\uffff\1\172\1"+
        "\uffff\2\172\1\uffff\1\157\2\uffff\1\172\1\164\1\172\3\uffff\2\172"+
        "\1\uffff\4\172\1\164\3\uffff\2\172\1\uffff\1\172\4\uffff\1\172\4"+
        "\uffff\1\155\3\172\2\uffff\1\160\1\172\2\uffff\4\172\2\uffff\1\172"+
        "\1\uffff\1\172\1\157\4\uffff\4\172\1\152\3\uffff\2\172\1\157\2\172"+
        "\1\55\1\172\1\uffff\1\157\1\uffff\1\156\2\uffff";
    static final String DFA12_acceptS =
        "\35\uffff\1\111\2\uffff\1\115\2\uffff\1\120\1\121\1\122\1\123\1"+
        "\125\1\126\1\127\1\130\1\131\1\132\1\133\1\136\1\137\1\140\1\141"+
        "\1\142\1\143\1\144\1\145\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\11\1"+
        "\124\4\uffff\1\110\1\107\21\uffff\1\35\10\uffff\1\76\14\uffff\1"+
        "\111\1\112\1\113\1\114\1\115\1\116\1\134\1\117\1\135\1\120\1\122"+
        "\1\123\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\136\1\137\1\140"+
        "\1\141\1\142\1\143\1\144\1\2\1\10\41\uffff\1\103\17\uffff\1\13\11"+
        "\uffff\1\16\14\uffff\1\44\4\uffff\1\60\2\uffff\1\105\1\106\1\104"+
        "\7\uffff\1\12\3\uffff\1\17\5\uffff\1\42\1\43\2\uffff\1\22\1\55\16"+
        "\uffff\1\50\7\uffff\1\15\2\uffff\1\14\4\uffff\1\71\1\23\1\uffff"+
        "\1\24\14\uffff\1\77\1\uffff\1\25\2\uffff\1\21\1\uffff\1\20\1\30"+
        "\3\uffff\1\51\1\52\1\53\2\uffff\1\27\5\uffff\1\45\1\46\1\47\2\uffff"+
        "\1\41\1\uffff\1\26\1\61\1\67\1\70\1\uffff\1\54\1\56\1\64\1\65\4"+
        "\uffff\1\75\1\32\2\uffff\1\62\1\63\4\uffff\1\66\1\72\1\uffff\1\40"+
        "\2\uffff\1\57\1\101\1\100\1\73\5\uffff\1\102\1\74\1\31\7\uffff\1"+
        "\34\1\uffff\1\33\1\uffff\1\36\1\37";
    static final String DFA12_specialS =
        "\1\0\u0173\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\65\2\40\2\65\1\40\22\65\1\40\1\55\1\65\1\56\1\45\1\64\1"+
            "\41\1\65\1\50\1\51\1\65\1\47\1\46\1\2\1\13\1\37\12\35\1\43\1"+
            "\44\1\62\1\61\1\63\1\54\1\57\1\34\1\33\1\27\5\34\1\31\2\34\1"+
            "\30\2\34\1\25\1\34\1\26\1\34\1\32\7\34\1\23\1\36\1\65\1\60\1"+
            "\1\1\65\1\17\1\34\1\4\1\10\1\12\1\24\1\22\1\15\1\5\1\20\1\34"+
            "\1\16\1\34\1\21\1\6\1\3\1\34\1\14\1\11\1\7\6\34\1\52\1\42\1"+
            "\53\uff82\65",
            "\1\67\1\66\1\74\1\uffff\1\73\2\uffff\1\71\2\uffff\1\72\6\uffff"+
            "\1\70",
            "\1\75",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\101\15\102\1\77\2\102\1\100\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\105\2\102\1\106\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\3\102\1\107\2\102\1\112\5\102\1\110\1\113\4\102"+
            "\1\111\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\115\6\102\1\114\5\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\116\27\102\1\117\1\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\122\1\120\6\102\1\121\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\124\17\102\1\123\5\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\125\2\102",
            "\1\126",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\127\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\130\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\131\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\102\1\133\1\132\27\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\3\102\1\134\26\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\135\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\136\25\102",
            "\1\137",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\140\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\5\102\1\142\7\102"+
            "\1\141\1\102\1\144\4\102\1\143\5\102\4\uffff\1\102\1\uffff\32"+
            "\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\21\102\1\145\10"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\1\147\20\102\1"+
            "\146\10\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\16\102\1\150\13"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\16\102\1\151\13"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\16\102\1\152\13"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\16\102\1\153\13"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\3\155\10\uffff\2\155\12\uffff\2\155\4\uffff\1\155\72\uffff"+
            "\3\155",
            "\1\156\4\uffff\1\157",
            "",
            "\1\161",
            "\1\163",
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
            "\1\u0087\11\uffff\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\11\102\1\u0088\20\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0089\3\102\1\u008a\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\2\102\1\u008b\27\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u008c\1\102\1\u008d\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u008e\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u008f\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\17\102\1\u0090\12\102",
            "\1\u0091\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u0092\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\7\102\1\u0093\22\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u0094\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u0095\16\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\102\1\u0096\30\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\17\102\1\u0097\12\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\2\102\1\u0098\27\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u0099\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u009a\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\5\102\1\u009b\24\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u009c\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u009d\6\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00a0\2\102\1\u009f\1\102\1\u009e\7"+
            "\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u00a1\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\6\102\1\u00a2\23\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00a3\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u00a4\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\102\1\u00a5\30\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00a6\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00a7\14\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00a8\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\5\102\1\u00aa\24"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00ab"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00ac"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\30\102\1\u00ad"+
            "\1\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\24\102\1\u00ae"+
            "\5\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\13\102\1\u00af"+
            "\16\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\17\102\1\u00b0"+
            "\12\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\17\102\1\u00b1"+
            "\12\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\17\102\1\u00b2"+
            "\12\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\17\102\1\u00b3"+
            "\12\102\4\uffff\1\102\1\uffff\32\102",
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
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\u00b4\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\5\102\1\u00b5\24\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\14\102\1\u00b6\15\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\12\102\1\u00b7\17\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u00b8\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u00ba\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00bb\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00bc\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u00be\2\102\1\u00bd\13\102",
            "\1\u00bf",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\u00c0\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00c1\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u00c2\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\30\102\1\u00c4\1\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u00c5\16\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00c6\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\u00c7\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\2\102\1\u00c8\27\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00c9\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\5\102\1\u00ca\24\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00cb\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00cc\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\u00cd\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\24\102\1\u00ce\5\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00cf\31\102",
            "\1\u00d0\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00d1\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00d2\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00d3\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\2\102\1\u00d4\27\102",
            "\1\u00d5\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00d6\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00d7\31\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\3\102\1\u00db\26"+
            "\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\13\102\1\u00dc"+
            "\16\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00dd"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00de"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00df"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\23\102\1\u00e0"+
            "\6\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\6\102\1\u00e1\23\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00e3\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00e4\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00e5\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00e7\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00e8\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u00e9\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u00ea\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00eb\25\102",
            "\1\u00ed\7\uffff\1\u00ec",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u00ee\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u00ef\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\u00f1\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u00f2\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u00f3\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u00f4\16\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u00f5\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\102\1\u00f6\30\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00f7\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u00f8\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00f9\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u00fa\16\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u00fb\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\14\102\1\u00fc\15\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u00fd\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\25\102\1\u00fe\4\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u00ff\10\102",
            "\1\u0100\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u0101\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u0102\16\102",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0103\25\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u0104\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u0105\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\6\102\1\u0106\23\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u0107\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0109\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u010a\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u010c\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\14\102\1\u010d\15\102",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u010e\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u010f\21\102",
            "",
            "",
            "\1\u0110\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\u0112\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u0114\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u0115\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\27\102\1\u0116\2\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u0117\16\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\3\102\1\u0118\26\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\25\102\1\u0119\4\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u011a\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u011b\25\102",
            "\1\u011c\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u011d\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u011e\31\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u011f\31\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u0121\14\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\30\102\1\u0123\1\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0124\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\u0126\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0129\25\102",
            "\1\u012a\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u012b\6\102",
            "",
            "",
            "\1\u012e\2\uffff\1\u012d\11\uffff\1\u012c",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\14\102\1\u012f\15\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u0130\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u0132\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u0133\7\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0134\25\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0135\25\102",
            "\1\u0136\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\u0138\4\uffff\1\u0137",
            "\1\u0139\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\2\102\1\u013a\27\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u013b\6\102",
            "",
            "\1\u013c\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\12\102\1\u013d"+
            "\17\102\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\u013f\11\uffff\1\u0141\1\uffff\1\u0140",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u0142\14\102",
            "\1\u0144\11\uffff\1\u0146\1\uffff\1\u0145\4\uffff\1\u0143",
            "\1\u0147\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\10\102\1\u0148\21\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0149\25\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\31\102\1\u014a",
            "\1\u014b\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\u014d\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\3\102\1\u014e\26\102",
            "\1\u0150\20\uffff\1\u014f",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u0151\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0152\25\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u0153\25\102",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u0154\6\102",
            "",
            "",
            "",
            "",
            "\1\u0156\10\uffff\1\u0155",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\15\102\1\u0157\14\102",
            "\1\u0158\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u0159\31\102",
            "",
            "",
            "\1\u015a",
            "\1\u015b\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\u015e\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\30\102\1\u015f\1\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\22\102\1\u0160\7\102",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\u0161\31\102",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\1\102\1\u0162\30\102",
            "\1\u0163",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\u0165\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102"+
            "\4\uffff\1\102\1\uffff\32\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\23\102\1\u0167\6\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\13\102\1\u0168\16\102",
            "\1\u0169",
            "",
            "",
            "",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\16\102\1\u016a\13\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\4\102\1\u016b\25\102",
            "\1\u016c",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\21\102\1\u016d\10\102",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\u016f",
            "\1\104\1\uffff\12\102\3\uffff\1\102\3\uffff\32\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\1\u0171",
            "",
            "\1\u0173\7\uffff\1\u0172",
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
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='_') ) {s = 1;}

                        else if ( (LA12_0=='-') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='s') ) {s = 9;}

                        else if ( (LA12_0=='e') ) {s = 10;}

                        else if ( (LA12_0=='.') ) {s = 11;}

                        else if ( (LA12_0=='r') ) {s = 12;}

                        else if ( (LA12_0=='h') ) {s = 13;}

                        else if ( (LA12_0=='l') ) {s = 14;}

                        else if ( (LA12_0=='a') ) {s = 15;}

                        else if ( (LA12_0=='j') ) {s = 16;}

                        else if ( (LA12_0=='n') ) {s = 17;}

                        else if ( (LA12_0=='g') ) {s = 18;}

                        else if ( (LA12_0=='[') ) {s = 19;}

                        else if ( (LA12_0=='f') ) {s = 20;}

                        else if ( (LA12_0=='O') ) {s = 21;}

                        else if ( (LA12_0=='Q') ) {s = 22;}

                        else if ( (LA12_0=='C') ) {s = 23;}

                        else if ( (LA12_0=='L') ) {s = 24;}

                        else if ( (LA12_0=='I') ) {s = 25;}

                        else if ( (LA12_0=='S') ) {s = 26;}

                        else if ( (LA12_0=='B') ) {s = 27;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||LA12_0=='P'||LA12_0=='R'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='b'||LA12_0=='k'||LA12_0=='m'||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\\') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( (LA12_0=='&') ) {s = 33;}

                        else if ( (LA12_0=='|') ) {s = 34;}

                        else if ( (LA12_0==':') ) {s = 35;}

                        else if ( (LA12_0==';') ) {s = 36;}

                        else if ( (LA12_0=='$') ) {s = 37;}

                        else if ( (LA12_0==',') ) {s = 38;}

                        else if ( (LA12_0=='+') ) {s = 39;}

                        else if ( (LA12_0=='(') ) {s = 40;}

                        else if ( (LA12_0==')') ) {s = 41;}

                        else if ( (LA12_0=='{') ) {s = 42;}

                        else if ( (LA12_0=='}') ) {s = 43;}

                        else if ( (LA12_0=='?') ) {s = 44;}

                        else if ( (LA12_0=='!') ) {s = 45;}

                        else if ( (LA12_0=='#') ) {s = 46;}

                        else if ( (LA12_0=='@') ) {s = 47;}

                        else if ( (LA12_0=='^') ) {s = 48;}

                        else if ( (LA12_0=='=') ) {s = 49;}

                        else if ( (LA12_0=='<') ) {s = 50;}

                        else if ( (LA12_0=='>') ) {s = 51;}

                        else if ( (LA12_0=='%') ) {s = 52;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='\"'||LA12_0=='\''||LA12_0=='*'||LA12_0==']'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 53;}

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