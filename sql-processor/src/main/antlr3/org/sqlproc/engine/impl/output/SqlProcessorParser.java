// $ANTLR 3.4 /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g 2013-01-21 15:12:58
 
package org.sqlproc.engine.impl;

import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.type.SqlMetaType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SqlProcessorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AT", "BAND", "BOR", "CARET", "COLON", "COMMA", "DIGIT", "DOT", "EQUALS", "ESC_AT", "ESC_BOR", "ESC_CHAR", "ESC_COLON", "ESC_DOT", "ESC_HASH", "ESC_LBRACE", "ESC_PERCENT", "ESC_RBRACE", "ESC_SEMICOLON", "ESC_SLASH", "ESC_STRING", "HASH", "IDENT", "IDENT_DOT", "LBRACE", "LESS_THAN", "LPAREN", "MAPPING", "MINUS", "ML_COMMENT", "MORE_THAN", "NOT", "NUMBER", "OPTION", "OR", "PERCENT", "PLUS", "QUESTI", "RBRACE", "REST", "RPAREN", "SEMICOLON", "SL_COMMENT", "STATEMENT", "STRING", "WS"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SqlProcessorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SqlProcessorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SqlProcessorParser.tokenNames; }
    public String getGrammarFileName() { return "/home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g"; }


      private Token getLastToken() {
        return input.LT(-1);
      }

      private Stack artifactName = new Stack();
      private Stack partialErrors = new Stack();
      private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
      
      public List<ErrorMsg> getErrors() {
        return errors;
      }

      @Override
      public void reportError(RecognitionException e) {
        String msg = super.getErrorMessage(e,tokenNames);
        if ( artifactName.size()>0 ) {
          String name = (String)artifactName.peek();
          partialErrors.push(ParserUtils.create(name,msg,e,tokenNames));
        }
        else {
          errors.add(ParserUtils.create(null,msg,e,tokenNames));
        }
      }
      
      String getText(Token token) {
        if (token == null)
          return null;
        return token.getText();
      }
      
      void add(StringBuilder text) {
        int type = getLastToken().getType();
        if (type == ESC_CHAR) {
          text.append(getLastToken().getText().substring(1));
        } 
        else if (type == WS) {
          String s = getLastToken().getText();
          for (int i = 0, l = s.length(); i < l; i++) {
            char c = s.charAt(i);
            if (c == '\n' || c == '\r')
              continue;
            text.append(c);
          }
        } 
        else {
          text.append(getLastToken().getText());
        }
      }
      
      void addText(Object target, StringBuilder text) {
        ParserUtils.addText(target, text);
      }
      
      void addColumn(Object target, SqlMappingItem col, StringBuilder text) {
        ParserUtils.addColumn(target, col, text);
      }
      
      SqlMappingItem newColumn(Token col) {
        return ParserUtils.newColumn(col.getText());
      }
      
      void addColumnAttr(SqlMappingItem item, Token col) {
        ParserUtils.addColumnAttr(item, col.getText());
      }
      
      void addDatabaseColumn(Object target, SqlDatabaseColumn dbcol, StringBuilder text) {
        ParserUtils.addDatabaseColumn(target, dbcol, text);
      }
      
      SqlDatabaseColumn newDatabaseColumn(Token col) {
        return ParserUtils.newDatabaseColumn(col.getText());
      }
      
      void addDatabaseTable(Object target, SqlDatabaseTable dbtab, StringBuilder text) {
        ParserUtils.addDatabaseTable(target, dbtab, text);
      }
      
      SqlDatabaseTable newDatabaseTable(Token col) {
        return ParserUtils.newDatabaseTable(col.getText());
      }
      
      void addIdent(Object target, SqlMetaIdent ident, StringBuilder text) {
        ParserUtils.addIdent(target, ident, text);
      }
      
      SqlMetaIdent newIdent(SqlMetaIdent ident, Token name, Token modeIdent, Token caseIdent) {
        if (ident != null) {
          ParserUtils.addName(ident, name.getText());
          return ident;
        }
        return ParserUtils.newIdent(name.getText(), getText(modeIdent), getText(caseIdent));
      }
      
      void addName(SqlMetaIdent ident, Token name) {
        ParserUtils.addName(ident, (name!=null) ? name.getText() : null);
      }
      
      void addConstant(Object target, SqlMetaConst cnst, StringBuilder text) {
        ParserUtils.addConstant(target, cnst, text);
      }
      
      SqlMetaConst newConstant(Token cnst, Token caseConversion) {
        return ParserUtils.newConstant(cnst.getText(), getText(caseConversion));
      }
      
      void addOperator(SqlMetaLogExpr expr, boolean isAnd) {
        if (isAnd)
          expr.addElement(new SqlMetaLogOperator(SqlMetaLogOperator.Type.AND));
        else
          expr.addElement(new SqlMetaLogOperator(SqlMetaLogOperator.Type.OR));
      }

      void addModifier(SqlTypeFactory typeFactory, SqlMappingItem item, String modifier) {
        ParserUtils.addModifier(item, typeFactory, modifier);
      }

      void addModifier(SqlTypeFactory typeFactory, SqlMetaIdent item, String modifier) {
        ParserUtils.addModifier(item, typeFactory, modifier);
      }

      void addModifier(SqlTypeFactory typeFactory, SqlMetaConst item, String modifier) {
        ParserUtils.addModifier(item, typeFactory, modifier);
      }
      
      boolean doSkip(Set<String> onlyStatements, String name) {
        if (onlyStatements == null || onlyStatements.isEmpty())
          return false;
        return !onlyStatements.contains(name);
      }
      
      List<ErrorMsg> getPartialErrors() {
        if (partialErrors.size()==0)
          return null;
        List<ErrorMsg> errorsList = new ArrayList<ErrorMsg>();
        while ( partialErrors.size()>0 ) {
          ErrorMsg errorMsg = (ErrorMsg) partialErrors.pop(); 
          errorsList.add(errorMsg);
        }
        return errorsList;
      }
      
      boolean add(SqlProcessor processor, String type, String name, SqlMetaStatement statement, List<String> activeFilters, String... filters) {
        List<ErrorMsg> errorsList = getPartialErrors();
        processor.addMetaStatement(type, name, statement, errorsList, activeFilters, filters);
        return errorsList == null;
      }
      
      boolean add(SqlProcessor processor, String type, String name, SqlMappingRule mapping, List<String> activeFilters, String... filters) {
        List<ErrorMsg> errorsList = getPartialErrors();
        processor.addMappingRule(type, name, mapping, errorsList, activeFilters, filters);
        return errorsList == null;
      }
      
      boolean add(SqlProcessor processor, String type, String name, String feature, List<String> activeFilters, String... filters) {
        List<ErrorMsg> errorsList = getPartialErrors();
        processor.addFeature(type, name, feature, errorsList, activeFilters, filters);
        return errorsList == null;
      }



    // $ANTLR start "parse"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:195:1: parse : parse2[org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), new String[] {}] ;
    public final void parse() throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:195:7: ( parse2[org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), new String[] {}] )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:196:9: parse2[org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), new String[] {}]
            {
            pushFollow(FOLLOW_parse2_in_parse52);
            parse2(org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), new String[] {});

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parse"



    // $ANTLR start "parse2"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:199:1: parse2[SqlTypeFactory _typeFactory, Map<String, Object> defaultFeatures, Set<String> onlyStatements, String[] filters] returns [SqlProcessor processor] : ( WS )* ( (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* ) )+ EOF ;
    public final SqlProcessor parse2(SqlTypeFactory _typeFactory, Map<String, Object> defaultFeatures, Set<String> onlyStatements, String[] filters) throws RecognitionException {
        SqlProcessor processor = null;


        Token name=null;
        Token type=null;
        Token filter=null;
        SqlMetaStatement metaStatement =null;

        SqlMappingRule mappingRule =null;

        StringBuilder text =null;


        processor = new SqlProcessor(defaultFeatures, onlyStatements); boolean skip; List<String> activeFilters;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:201:9: ( ( WS )* ( (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* ) )+ EOF )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:202:9: ( WS )* ( (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* ) )+ EOF
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:202:9: ( WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:202:9: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_parse293); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:202:13: ( (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* ) | (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==LPAREN) ) {
                        switch ( input.LA(3) ) {
                        case OPTION:
                            {
                            alt8=3;
                            }
                            break;
                        case STATEMENT:
                            {
                            alt8=1;
                            }
                            break;
                        case MAPPING:
                            {
                            alt8=2;
                            }
                            break;

                        }

                    }


                }


                switch (alt8) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:203:10: (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* )
            	    {
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:203:10: (name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )* )
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:203:11: name= IDENT LPAREN type= STATEMENT ( COMMA filter= IDENT )* RPAREN EQUALS metaStatement= meta[$name.text, _typeFactory, skip] SEMICOLON ( WS )*
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2110); 

            	    skip=doSkip(onlyStatements,(name!=null?name.getText():null));

            	    match(input,LPAREN,FOLLOW_LPAREN_in_parse2114); 

            	    type=(Token)match(input,STATEMENT,FOLLOW_STATEMENT_in_parse2118); 

            	    activeFilters = new ArrayList<String>();

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:203:129: ( COMMA filter= IDENT )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==COMMA) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:203:130: COMMA filter= IDENT
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_parse2123); 

            	    	    filter=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2127); 

            	    	    activeFilters.add((filter!=null?filter.getText():null));

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    match(input,RPAREN,FOLLOW_RPAREN_in_parse2133); 

            	    match(input,EQUALS,FOLLOW_EQUALS_in_parse2135); 

            	    pushFollow(FOLLOW_meta_in_parse2151);
            	    metaStatement=meta((name!=null?name.getText():null), _typeFactory, skip);

            	    state._fsp--;


            	    add(processor, (type!=null?type.getText():null), (name!=null?name.getText():null), metaStatement, activeFilters, filters);

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_parse2156); 

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:204:154: ( WS )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==WS) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:204:154: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_parse2158); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:205:12: (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* )
            	    {
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:205:12: (name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )* )
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:205:13: name= IDENT LPAREN type= MAPPING ( COMMA filter= IDENT )* RPAREN EQUALS mappingRule= mapping[$name.text, _typeFactory, skip] SEMICOLON ( WS )*
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2176); 

            	    skip=doSkip(onlyStatements,(name!=null?name.getText():null));

            	    match(input,LPAREN,FOLLOW_LPAREN_in_parse2180); 

            	    type=(Token)match(input,MAPPING,FOLLOW_MAPPING_in_parse2184); 

            	    activeFilters = new ArrayList<String>();

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:205:129: ( COMMA filter= IDENT )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==COMMA) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:205:130: COMMA filter= IDENT
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_parse2189); 

            	    	    filter=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2193); 

            	    	    activeFilters.add((filter!=null?filter.getText():null));

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    match(input,RPAREN,FOLLOW_RPAREN_in_parse2199); 

            	    match(input,EQUALS,FOLLOW_EQUALS_in_parse2201); 

            	    pushFollow(FOLLOW_mapping_in_parse2217);
            	    mappingRule=mapping((name!=null?name.getText():null), _typeFactory, skip);

            	    state._fsp--;


            	    add(processor, (type!=null?type.getText():null), (name!=null?name.getText():null), mappingRule, activeFilters, filters);

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_parse2222); 

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:206:153: ( WS )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==WS) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:206:153: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_parse2224); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:207:12: (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* )
            	    {
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:207:12: (name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )* )
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:207:13: name= IDENT LPAREN type= OPTION ( COMMA filter= IDENT )* RPAREN EQUALS text= option[$name.text] SEMICOLON ( WS )*
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2242); 

            	    match(input,LPAREN,FOLLOW_LPAREN_in_parse2244); 

            	    type=(Token)match(input,OPTION,FOLLOW_OPTION_in_parse2248); 

            	    activeFilters = new ArrayList<String>();

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:207:86: ( COMMA filter= IDENT )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==COMMA) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:207:87: COMMA filter= IDENT
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_parse2253); 

            	    	    filter=(Token)match(input,IDENT,FOLLOW_IDENT_in_parse2257); 

            	    	    activeFilters.add((filter!=null?filter.getText():null));

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    match(input,RPAREN,FOLLOW_RPAREN_in_parse2263); 

            	    match(input,EQUALS,FOLLOW_EQUALS_in_parse2265); 

            	    pushFollow(FOLLOW_option_in_parse2281);
            	    text=option((name!=null?name.getText():null));

            	    state._fsp--;


            	    add(processor, (type!=null?type.getText():null), (name!=null?name.getText():null), text.toString(), activeFilters, filters);

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_parse2286); 

            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:208:129: ( WS )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==WS) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:208:129: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_parse2288); 

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
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_parse2303); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return processor;
    }
    // $ANTLR end "parse2"


    protected static class meta_scope {
        StringBuilder text;
        boolean hasOutputMapping;
        SqlTypeFactory typeFactory;
        boolean skip;
    }
    protected Stack meta_stack = new Stack();



    // $ANTLR start "meta"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:212:1: meta[String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMetaStatement metaStatement] : sql[metaStatement] ( EOF )? ;
    public final SqlMetaStatement meta(String name, SqlTypeFactory _typeFactory, boolean _skip) throws RecognitionException {
        meta_stack.push(new meta_scope());
        SqlMetaStatement metaStatement = null;


        artifactName.push(name); metaStatement = new SqlMetaStatement(); ((meta_scope)meta_stack.peek()).text = new StringBuilder(); ((meta_scope)meta_stack.peek()).typeFactory =_typeFactory; ((meta_scope)meta_stack.peek()).skip =_skip;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:216:2: ( sql[metaStatement] ( EOF )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:216:4: sql[metaStatement] ( EOF )?
            {
            pushFollow(FOLLOW_sql_in_meta335);
            sql(metaStatement);

            state._fsp--;


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:216:23: ( EOF )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EOF) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:216:23: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_meta338); 

                    }
                    break;

            }


            }

            metaStatement.setHasOutputMapping(((meta_scope)meta_stack.peek()).hasOutputMapping); artifactName.pop();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            meta_stack.pop();
        }
        return metaStatement;
    }
    // $ANTLR end "meta"



    // $ANTLR start "sql"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:219:1: sql[SqlMetaStatement metaStatement] : ( sqlFragment[metaStatement] )+ ;
    public final void sql(SqlMetaStatement metaStatement) throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:220:23: ( ( sqlFragment[metaStatement] )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:221:2: ( sqlFragment[metaStatement] )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:221:2: ( sqlFragment[metaStatement] )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= AND && LA10_0 <= RPAREN)||(LA10_0 >= SL_COMMENT && LA10_0 <= WS)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:221:3: sqlFragment[metaStatement]
            	    {
            	    pushFollow(FOLLOW_sqlFragment_in_sql377);
            	    sqlFragment(metaStatement);

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sql"



    // $ANTLR start "sqlFragment"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:224:1: sqlFragment[SqlMetaStatement metaStatement] : (~ ( COLON | STRING | AT | PERCENT | LBRACE | SEMICOLON ) | COLON ident= identifier | STRING cnst= constant | AT col= column | PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn ) | LBRACE metaSql[metaStatement] RBRACE );
    public final void sqlFragment(SqlMetaStatement metaStatement) throws RecognitionException {
        SqlMetaIdent ident =null;

        SqlMetaConst cnst =null;

        SqlMappingItem col =null;

        SqlDatabaseTable dbtab =null;

        SqlDatabaseColumn dbcol =null;


        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:226:2: (~ ( COLON | STRING | AT | PERCENT | LBRACE | SEMICOLON ) | COLON ident= identifier | STRING cnst= constant | AT col= column | PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn ) | LBRACE metaSql[metaStatement] RBRACE )
            int alt12=6;
            switch ( input.LA(1) ) {
            case AND:
            case BAND:
            case BOR:
            case CARET:
            case COMMA:
            case DIGIT:
            case DOT:
            case EQUALS:
            case ESC_AT:
            case ESC_BOR:
            case ESC_CHAR:
            case ESC_COLON:
            case ESC_DOT:
            case ESC_HASH:
            case ESC_LBRACE:
            case ESC_PERCENT:
            case ESC_RBRACE:
            case ESC_SEMICOLON:
            case ESC_SLASH:
            case ESC_STRING:
            case HASH:
            case IDENT:
            case IDENT_DOT:
            case LESS_THAN:
            case LPAREN:
            case MAPPING:
            case MINUS:
            case ML_COMMENT:
            case MORE_THAN:
            case NOT:
            case NUMBER:
            case OPTION:
            case OR:
            case PLUS:
            case QUESTI:
            case RBRACE:
            case REST:
            case RPAREN:
            case SL_COMMENT:
            case STATEMENT:
            case WS:
                {
                alt12=1;
                }
                break;
            case COLON:
                {
                alt12=2;
                }
                break;
            case STRING:
                {
                alt12=3;
                }
                break;
            case AT:
                {
                alt12=4;
                }
                break;
            case PERCENT:
                {
                alt12=5;
                }
                break;
            case LBRACE:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:227:2: ~ ( COLON | STRING | AT | PERCENT | LBRACE | SEMICOLON )
                    {
                    if ( input.LA(1)==AND||(input.LA(1) >= BAND && input.LA(1) <= CARET)||(input.LA(1) >= COMMA && input.LA(1) <= IDENT_DOT)||(input.LA(1) >= LESS_THAN && input.LA(1) <= OR)||(input.LA(1) >= PLUS && input.LA(1) <= RPAREN)||(input.LA(1) >= SL_COMMENT && input.LA(1) <= STATEMENT)||input.LA(1)==WS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if(!((meta_scope)meta_stack.peek()).skip) add(((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:229:4: COLON ident= identifier
                    {
                    match(input,COLON,FOLLOW_COLON_in_sqlFragment438); 

                    pushFollow(FOLLOW_identifier_in_sqlFragment442);
                    ident=identifier();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addIdent(metaStatement, ident, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:231:9: STRING cnst= constant
                    {
                    match(input,STRING,FOLLOW_STRING_in_sqlFragment457); 

                    pushFollow(FOLLOW_constant_in_sqlFragment461);
                    cnst=constant();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addConstant(metaStatement, cnst, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:233:9: AT col= column
                    {
                    match(input,AT,FOLLOW_AT_in_sqlFragment481); 

                    pushFollow(FOLLOW_column_in_sqlFragment485);
                    col=column();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addColumn(metaStatement, col, ((meta_scope)meta_stack.peek()).text);((meta_scope)meta_stack.peek()).hasOutputMapping =true;

                    }
                    break;
                case 5 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:235:5: PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn )
                    {
                    match(input,PERCENT,FOLLOW_PERCENT_in_sqlFragment501); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:235:13: ( PERCENT dbtab= dbtable |dbcol= dbcolumn )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==PERCENT) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0 >= IDENT && LA11_0 <= IDENT_DOT)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:235:14: PERCENT dbtab= dbtable
                            {
                            match(input,PERCENT,FOLLOW_PERCENT_in_sqlFragment504); 

                            pushFollow(FOLLOW_dbtable_in_sqlFragment508);
                            dbtab=dbtable();

                            state._fsp--;


                            if(!((meta_scope)meta_stack.peek()).skip) addDatabaseTable(metaStatement, dbtab, ((meta_scope)meta_stack.peek()).text);

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:236:16: dbcol= dbcolumn
                            {
                            pushFollow(FOLLOW_dbcolumn_in_sqlFragment529);
                            dbcol=dbcolumn();

                            state._fsp--;


                            if(!((meta_scope)meta_stack.peek()).skip) addDatabaseColumn(metaStatement, dbcol, ((meta_scope)meta_stack.peek()).text);

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:237:9: LBRACE metaSql[metaStatement] RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_sqlFragment542); 

                    pushFollow(FOLLOW_metaSql_in_sqlFragment544);
                    metaSql(metaStatement);

                    state._fsp--;


                    match(input,RBRACE,FOLLOW_RBRACE_in_sqlFragment547); 

                    }
                    break;

            }
            if(!((meta_scope)meta_stack.peek()).skip) addText(metaStatement, ((meta_scope)meta_stack.peek()).text);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sqlFragment"



    // $ANTLR start "metaSql"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:240:1: metaSql[SqlMetaStatement metaStatement] : (~ ( QUESTI | BAND | BOR | EQUALS | HASH | RBRACE ) metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | QUESTI metaLogExpr= ifSqlCond BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | BAND metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | EQUALS ( WS )* fragmentType= IDENT metaIfItem= ifSql[null] | HASH orderId= NUMBER ordSql[metaOrd] );
    public final void metaSql(SqlMetaStatement metaStatement) throws RecognitionException {
        Token fragmentType=null;
        Token orderId=null;
        SqlMetaIfItem metaIfItem =null;

        SqlMetaLogExpr metaLogExpr =null;


        SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; SqlMetaOrd metaOrd; SqlMetaSqlFragment sqlFragment; if(!((meta_scope)meta_stack.peek()).skip) addText(metaStatement, ((meta_scope)meta_stack.peek()).text);
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:242:2: (~ ( QUESTI | BAND | BOR | EQUALS | HASH | RBRACE ) metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | QUESTI metaLogExpr= ifSqlCond BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | BAND metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )* | EQUALS ( WS )* fragmentType= IDENT metaIfItem= ifSql[null] | HASH orderId= NUMBER ordSql[metaOrd] )
            int alt18=6;
            switch ( input.LA(1) ) {
            case AND:
            case AT:
            case CARET:
            case COLON:
            case COMMA:
            case DIGIT:
            case DOT:
            case ESC_AT:
            case ESC_BOR:
            case ESC_CHAR:
            case ESC_COLON:
            case ESC_DOT:
            case ESC_HASH:
            case ESC_LBRACE:
            case ESC_PERCENT:
            case ESC_RBRACE:
            case ESC_SEMICOLON:
            case ESC_SLASH:
            case ESC_STRING:
            case IDENT:
            case IDENT_DOT:
            case LBRACE:
            case LESS_THAN:
            case LPAREN:
            case MAPPING:
            case MINUS:
            case ML_COMMENT:
            case MORE_THAN:
            case NOT:
            case NUMBER:
            case OPTION:
            case OR:
            case PERCENT:
            case PLUS:
            case REST:
            case RPAREN:
            case SEMICOLON:
            case SL_COMMENT:
            case STATEMENT:
            case STRING:
            case WS:
                {
                alt18=1;
                }
                break;
            case QUESTI:
                {
                alt18=2;
                }
                break;
            case BAND:
                {
                alt18=3;
                }
                break;
            case BOR:
                {
                alt18=4;
                }
                break;
            case EQUALS:
                {
                alt18=5;
                }
                break;
            case HASH:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:243:2: ~ ( QUESTI | BAND | BOR | EQUALS | HASH | RBRACE ) metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )*
                    {
                    if ( (input.LA(1) >= AND && input.LA(1) <= AT)||(input.LA(1) >= CARET && input.LA(1) <= DOT)||(input.LA(1) >= ESC_AT && input.LA(1) <= ESC_STRING)||(input.LA(1) >= IDENT && input.LA(1) <= PLUS)||(input.LA(1) >= REST && input.LA(1) <= WS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if(!((meta_scope)meta_stack.peek()).skip) add(((meta_scope)meta_stack.peek()).text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);

                    pushFollow(FOLLOW_ifSql_in_metaSql603);
                    metaIfItem=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:245:3: ( BOR metaIfItem= ifSql[null] )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==BOR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:245:4: BOR metaIfItem= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_metaSql612); 

                    	    pushFollow(FOLLOW_ifSql_in_metaSql616);
                    	    metaIfItem=ifSql(null);

                    	    state._fsp--;


                    	    metaAndOr.addElement(metaIfItem);

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    metaStatement.addElement(metaAndOr);

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:246:4: QUESTI metaLogExpr= ifSqlCond BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )*
                    {
                    match(input,QUESTI,FOLLOW_QUESTI_in_metaSql628); 

                    metaIf = new SqlMetaIf(); 

                    pushFollow(FOLLOW_ifSqlCond_in_metaSql634);
                    metaLogExpr=ifSqlCond();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaIf.setExpression(metaLogExpr);

                    match(input,BOR,FOLLOW_BOR_in_metaSql641); 

                    pushFollow(FOLLOW_ifSql_in_metaSql645);
                    metaIfItem=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaIf.addElement(metaIfItem);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:248:3: ( BOR metaIfItem= ifSql[null] )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==BOR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:248:4: BOR metaIfItem= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_metaSql654); 

                    	    pushFollow(FOLLOW_ifSql_in_metaSql658);
                    	    metaIfItem=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaIf.addElement(metaIfItem);

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    metaStatement.addElement(metaIf);

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:250:4: BAND metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )*
                    {
                    match(input,BAND,FOLLOW_BAND_in_metaSql673); 

                    metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);

                    pushFollow(FOLLOW_ifSql_in_metaSql679);
                    metaIfItem=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:251:3: ( BOR metaIfItem= ifSql[null] )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==BOR) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:251:4: BOR metaIfItem= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_metaSql688); 

                    	    pushFollow(FOLLOW_ifSql_in_metaSql692);
                    	    metaIfItem=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem);

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaStatement.addElement(metaAndOr);

                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:252:4: BOR metaIfItem= ifSql[null] ( BOR metaIfItem= ifSql[null] )*
                    {
                    match(input,BOR,FOLLOW_BOR_in_metaSql704); 

                    metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);

                    pushFollow(FOLLOW_ifSql_in_metaSql710);
                    metaIfItem=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:253:3: ( BOR metaIfItem= ifSql[null] )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==BOR) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:253:4: BOR metaIfItem= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_metaSql719); 

                    	    pushFollow(FOLLOW_ifSql_in_metaSql723);
                    	    metaIfItem=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem);

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaStatement.addElement(metaAndOr);

                    }
                    break;
                case 5 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:254:4: EQUALS ( WS )* fragmentType= IDENT metaIfItem= ifSql[null]
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_metaSql735); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:254:11: ( WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:254:11: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_metaSql737); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    fragmentType=(Token)match(input,IDENT,FOLLOW_IDENT_in_metaSql742); 

                    sqlFragment = new SqlMetaSqlFragment(fragmentType.getText());

                    pushFollow(FOLLOW_ifSql_in_metaSql748);
                    metaIfItem=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) sqlFragment.addElement(metaIfItem);

                    if(!((meta_scope)meta_stack.peek()).skip) metaStatement.addElement(sqlFragment);

                    }
                    break;
                case 6 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:256:4: HASH orderId= NUMBER ordSql[metaOrd]
                    {
                    match(input,HASH,FOLLOW_HASH_in_metaSql761); 

                    orderId=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metaSql765); 

                    metaOrd = new SqlMetaOrd(Integer.parseInt(orderId.getText()));

                    pushFollow(FOLLOW_ordSql_in_metaSql769);
                    ordSql(metaOrd);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaStatement.addElement(metaOrd);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "metaSql"



    // $ANTLR start "ifSql"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:259:1: ifSql[SqlMetaIfItem metaIfItemIn] returns [SqlMetaIfItem metaIfItem] : ( ifSqlFragment[metaIfItem] )+ ;
    public final SqlMetaIfItem ifSql(SqlMetaIfItem metaIfItemIn) throws RecognitionException {
        SqlMetaIfItem metaIfItem = null;


        metaIfItem = (metaIfItemIn !=null) ? metaIfItemIn : new SqlMetaIfItem();
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:261:2: ( ( ifSqlFragment[metaIfItem] )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:262:2: ( ifSqlFragment[metaIfItem] )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:262:2: ( ifSqlFragment[metaIfItem] )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= AND && LA19_0 <= BAND)||(LA19_0 >= CARET && LA19_0 <= QUESTI)||(LA19_0 >= REST && LA19_0 <= WS)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:262:3: ifSqlFragment[metaIfItem]
            	    {
            	    pushFollow(FOLLOW_ifSqlFragment_in_ifSql796);
            	    ifSqlFragment(metaIfItem);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return metaIfItem;
    }
    // $ANTLR end "ifSql"



    // $ANTLR start "ifSqlFragment"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:265:1: ifSqlFragment[SqlMetaIfItem metaIfItem] : (~ ( COLON | STRING | AT | PERCENT | LBRACE | BOR | RBRACE ) | COLON ident= identifier | STRING cnst= constant | AT col= column | PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn ) | LBRACE ifMetaSql[metaIfItem] RBRACE );
    public final void ifSqlFragment(SqlMetaIfItem metaIfItem) throws RecognitionException {
        SqlMetaIdent ident =null;

        SqlMetaConst cnst =null;

        SqlMappingItem col =null;

        SqlDatabaseTable dbtab =null;

        SqlDatabaseColumn dbcol =null;


        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:267:2: (~ ( COLON | STRING | AT | PERCENT | LBRACE | BOR | RBRACE ) | COLON ident= identifier | STRING cnst= constant | AT col= column | PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn ) | LBRACE ifMetaSql[metaIfItem] RBRACE )
            int alt21=6;
            switch ( input.LA(1) ) {
            case AND:
            case BAND:
            case CARET:
            case COMMA:
            case DIGIT:
            case DOT:
            case EQUALS:
            case ESC_AT:
            case ESC_BOR:
            case ESC_CHAR:
            case ESC_COLON:
            case ESC_DOT:
            case ESC_HASH:
            case ESC_LBRACE:
            case ESC_PERCENT:
            case ESC_RBRACE:
            case ESC_SEMICOLON:
            case ESC_SLASH:
            case ESC_STRING:
            case HASH:
            case IDENT:
            case IDENT_DOT:
            case LESS_THAN:
            case LPAREN:
            case MAPPING:
            case MINUS:
            case ML_COMMENT:
            case MORE_THAN:
            case NOT:
            case NUMBER:
            case OPTION:
            case OR:
            case PLUS:
            case QUESTI:
            case REST:
            case RPAREN:
            case SEMICOLON:
            case SL_COMMENT:
            case STATEMENT:
            case WS:
                {
                alt21=1;
                }
                break;
            case COLON:
                {
                alt21=2;
                }
                break;
            case STRING:
                {
                alt21=3;
                }
                break;
            case AT:
                {
                alt21=4;
                }
                break;
            case PERCENT:
                {
                alt21=5;
                }
                break;
            case LBRACE:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:268:2: ~ ( COLON | STRING | AT | PERCENT | LBRACE | BOR | RBRACE )
                    {
                    if ( input.LA(1)==AND||input.LA(1)==BAND||input.LA(1)==CARET||(input.LA(1) >= COMMA && input.LA(1) <= IDENT_DOT)||(input.LA(1) >= LESS_THAN && input.LA(1) <= OR)||(input.LA(1) >= PLUS && input.LA(1) <= QUESTI)||(input.LA(1) >= REST && input.LA(1) <= STATEMENT)||input.LA(1)==WS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if(!((meta_scope)meta_stack.peek()).skip) add(((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:270:4: COLON ident= identifier
                    {
                    match(input,COLON,FOLLOW_COLON_in_ifSqlFragment854); 

                    pushFollow(FOLLOW_identifier_in_ifSqlFragment858);
                    ident=identifier();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addIdent(metaIfItem, ident, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:272:4: STRING cnst= constant
                    {
                    match(input,STRING,FOLLOW_STRING_in_ifSqlFragment868); 

                    pushFollow(FOLLOW_constant_in_ifSqlFragment872);
                    cnst=constant();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addConstant(metaIfItem, cnst, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:274:9: AT col= column
                    {
                    match(input,AT,FOLLOW_AT_in_ifSqlFragment887); 

                    pushFollow(FOLLOW_column_in_ifSqlFragment891);
                    col=column();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addColumn(metaIfItem, col, ((meta_scope)meta_stack.peek()).text);((meta_scope)meta_stack.peek()).hasOutputMapping =true;

                    }
                    break;
                case 5 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:276:4: PERCENT ( PERCENT dbtab= dbtable |dbcol= dbcolumn )
                    {
                    match(input,PERCENT,FOLLOW_PERCENT_in_ifSqlFragment906); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:276:12: ( PERCENT dbtab= dbtable |dbcol= dbcolumn )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==PERCENT) ) {
                        alt20=1;
                    }
                    else if ( ((LA20_0 >= IDENT && LA20_0 <= IDENT_DOT)) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:276:13: PERCENT dbtab= dbtable
                            {
                            match(input,PERCENT,FOLLOW_PERCENT_in_ifSqlFragment909); 

                            pushFollow(FOLLOW_dbtable_in_ifSqlFragment913);
                            dbtab=dbtable();

                            state._fsp--;


                            if(!((meta_scope)meta_stack.peek()).skip) addDatabaseTable(metaIfItem, dbtab, ((meta_scope)meta_stack.peek()).text);

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:277:16: dbcol= dbcolumn
                            {
                            pushFollow(FOLLOW_dbcolumn_in_ifSqlFragment934);
                            dbcol=dbcolumn();

                            state._fsp--;


                            if(!((meta_scope)meta_stack.peek()).skip) addDatabaseColumn(metaIfItem, dbcol, ((meta_scope)meta_stack.peek()).text);

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:278:4: LBRACE ifMetaSql[metaIfItem] RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_ifSqlFragment942); 

                    pushFollow(FOLLOW_ifMetaSql_in_ifSqlFragment944);
                    ifMetaSql(metaIfItem);

                    state._fsp--;


                    match(input,RBRACE,FOLLOW_RBRACE_in_ifSqlFragment947); 

                    }
                    break;

            }
            if(!((meta_scope)meta_stack.peek()).skip) addText(metaIfItem, ((meta_scope)meta_stack.peek()).text);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifSqlFragment"



    // $ANTLR start "ifMetaSql"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:282:1: ifMetaSql[SqlMetaIfItem metaIfItem] : (~ ( QUESTI | BAND | BOR | LBRACE | RBRACE ) metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | QUESTI metaLogExpr= ifSqlCond BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | BAND metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* );
    public final void ifMetaSql(SqlMetaIfItem metaIfItem) throws RecognitionException {
        SqlMetaIfItem metaIfItem2 =null;

        SqlMetaLogExpr metaLogExpr =null;


        SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; if(!((meta_scope)meta_stack.peek()).skip) addText(metaIfItem, ((meta_scope)meta_stack.peek()).text);
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:284:2: (~ ( QUESTI | BAND | BOR | LBRACE | RBRACE ) metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | QUESTI metaLogExpr= ifSqlCond BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | BAND metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* | BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )* )
            int alt26=4;
            switch ( input.LA(1) ) {
            case AND:
            case AT:
            case CARET:
            case COLON:
            case COMMA:
            case DIGIT:
            case DOT:
            case EQUALS:
            case ESC_AT:
            case ESC_BOR:
            case ESC_CHAR:
            case ESC_COLON:
            case ESC_DOT:
            case ESC_HASH:
            case ESC_LBRACE:
            case ESC_PERCENT:
            case ESC_RBRACE:
            case ESC_SEMICOLON:
            case ESC_SLASH:
            case ESC_STRING:
            case HASH:
            case IDENT:
            case IDENT_DOT:
            case LESS_THAN:
            case LPAREN:
            case MAPPING:
            case MINUS:
            case ML_COMMENT:
            case MORE_THAN:
            case NOT:
            case NUMBER:
            case OPTION:
            case OR:
            case PERCENT:
            case PLUS:
            case REST:
            case RPAREN:
            case SEMICOLON:
            case SL_COMMENT:
            case STATEMENT:
            case STRING:
            case WS:
                {
                alt26=1;
                }
                break;
            case QUESTI:
                {
                alt26=2;
                }
                break;
            case BAND:
                {
                alt26=3;
                }
                break;
            case BOR:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:285:2: ~ ( QUESTI | BAND | BOR | LBRACE | RBRACE ) metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )*
                    {
                    if ( (input.LA(1) >= AND && input.LA(1) <= AT)||(input.LA(1) >= CARET && input.LA(1) <= IDENT_DOT)||(input.LA(1) >= LESS_THAN && input.LA(1) <= PLUS)||(input.LA(1) >= REST && input.LA(1) <= WS) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if(!((meta_scope)meta_stack.peek()).skip) add(((meta_scope)meta_stack.peek()).text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);

                    pushFollow(FOLLOW_ifSql_in_ifMetaSql1007);
                    metaIfItem2=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:287:3: ( BOR metaIfItem2= ifSql[null] )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==BOR) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:287:4: BOR metaIfItem2= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1016); 

                    	    pushFollow(FOLLOW_ifSql_in_ifMetaSql1020);
                    	    metaIfItem2=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaIfItem.addElement(metaAndOr);

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:288:4: QUESTI metaLogExpr= ifSqlCond BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )*
                    {
                    match(input,QUESTI,FOLLOW_QUESTI_in_ifMetaSql1032); 

                    metaIf = new SqlMetaIf(); 

                    pushFollow(FOLLOW_ifSqlCond_in_ifMetaSql1038);
                    metaLogExpr=ifSqlCond();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaIf.setExpression(metaLogExpr);

                    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1045); 

                    pushFollow(FOLLOW_ifSql_in_ifMetaSql1049);
                    metaIfItem2=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaIf.addElement(metaIfItem2);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:290:3: ( BOR metaIfItem2= ifSql[null] )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==BOR) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:290:4: BOR metaIfItem2= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1058); 

                    	    pushFollow(FOLLOW_ifSql_in_ifMetaSql1062);
                    	    metaIfItem2=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaIf.addElement(metaIfItem2);

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaIfItem.addElement(metaIf);

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:292:4: BAND metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )*
                    {
                    match(input,BAND,FOLLOW_BAND_in_ifMetaSql1077); 

                    metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);

                    pushFollow(FOLLOW_ifSql_in_ifMetaSql1083);
                    metaIfItem2=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:293:3: ( BOR metaIfItem2= ifSql[null] )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==BOR) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:293:4: BOR metaIfItem2= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1092); 

                    	    pushFollow(FOLLOW_ifSql_in_ifMetaSql1096);
                    	    metaIfItem2=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaIfItem.addElement(metaAndOr);

                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:294:4: BOR metaIfItem2= ifSql[null] ( BOR metaIfItem2= ifSql[null] )*
                    {
                    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1108); 

                    metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);

                    pushFollow(FOLLOW_ifSql_in_ifMetaSql1114);
                    metaIfItem2=ifSql(null);

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:295:3: ( BOR metaIfItem2= ifSql[null] )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==BOR) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:295:4: BOR metaIfItem2= ifSql[null]
                    	    {
                    	    match(input,BOR,FOLLOW_BOR_in_ifMetaSql1123); 

                    	    pushFollow(FOLLOW_ifSql_in_ifMetaSql1127);
                    	    metaIfItem2=ifSql(null);

                    	    state._fsp--;


                    	    if(!((meta_scope)meta_stack.peek()).skip) metaAndOr.addElement(metaIfItem2);

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    if(!((meta_scope)meta_stack.peek()).skip) metaIfItem.addElement(metaAndOr);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifMetaSql"



    // $ANTLR start "ifSqlCond"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:298:1: ifSqlCond returns [SqlMetaLogExpr metaLogExpr] : ( WS )* ifSqlBool[metaLogExpr] ( WS )* ( ( AND | OR ) ( WS )* ifSqlBool[metaLogExpr] ( WS )* )* ;
    public final SqlMetaLogExpr ifSqlCond() throws RecognitionException {
        SqlMetaLogExpr metaLogExpr = null;


        metaLogExpr = new SqlMetaLogExpr();
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:300:2: ( ( WS )* ifSqlBool[metaLogExpr] ( WS )* ( ( AND | OR ) ( WS )* ifSqlBool[metaLogExpr] ( WS )* )* )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:2: ( WS )* ifSqlBool[metaLogExpr] ( WS )* ( ( AND | OR ) ( WS )* ifSqlBool[metaLogExpr] ( WS )* )*
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:2: ( WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:2: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ifSqlCond1154); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_ifSqlBool_in_ifSqlCond1157);
            ifSqlBool(metaLogExpr);

            state._fsp--;


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:29: ( WS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==WS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:29: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_ifSqlCond1160); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:33: ( ( AND | OR ) ( WS )* ifSqlBool[metaLogExpr] ( WS )* )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==AND||LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:34: ( AND | OR ) ( WS )* ifSqlBool[metaLogExpr] ( WS )*
            	    {
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:34: ( AND | OR )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==AND) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==OR) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:35: AND
            	            {
            	            match(input,AND,FOLLOW_AND_in_ifSqlCond1165); 

            	            if(!((meta_scope)meta_stack.peek()).skip) addOperator(metaLogExpr,true);

            	            }
            	            break;
            	        case 2 :
            	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:91: OR
            	            {
            	            match(input,OR,FOLLOW_OR_in_ifSqlCond1171); 

            	            if(!((meta_scope)meta_stack.peek()).skip) addOperator(metaLogExpr,false);

            	            }
            	            break;

            	    }


            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:146: ( WS )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==WS) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:301:146: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_ifSqlCond1176); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_ifSqlBool_in_ifSqlCond1181);
            	    ifSqlBool(metaLogExpr);

            	    state._fsp--;


            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:302:26: ( WS )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==WS) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:302:26: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_ifSqlCond1184); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return metaLogExpr;
    }
    // $ANTLR end "ifSqlCond"



    // $ANTLR start "ifSqlBool"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:305:1: ifSqlBool[SqlMetaLogExpr metaLogExpr] : ( (not= NOT )? COLON ident= identifier | (not= NOT )? STRING cnst= constant | (not= NOT )? LPAREN newMetaLogExpr= ifSqlCond RPAREN );
    public final void ifSqlBool(SqlMetaLogExpr metaLogExpr) throws RecognitionException {
        Token not=null;
        SqlMetaIdent ident =null;

        SqlMetaConst cnst =null;

        SqlMetaLogExpr newMetaLogExpr =null;


        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:306:2: ( (not= NOT )? COLON ident= identifier | (not= NOT )? STRING cnst= constant | (not= NOT )? LPAREN newMetaLogExpr= ifSqlCond RPAREN )
            int alt36=3;
            switch ( input.LA(1) ) {
            case NOT:
                {
                switch ( input.LA(2) ) {
                case COLON:
                    {
                    alt36=1;
                    }
                    break;
                case STRING:
                    {
                    alt36=2;
                    }
                    break;
                case LPAREN:
                    {
                    alt36=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }

                }
                break;
            case COLON:
                {
                alt36=1;
                }
                break;
            case STRING:
                {
                alt36=2;
                }
                break;
            case LPAREN:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:307:2: (not= NOT )? COLON ident= identifier
                    {
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:307:5: (not= NOT )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NOT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:307:5: not= NOT
                            {
                            not=(Token)match(input,NOT,FOLLOW_NOT_in_ifSqlBool1204); 

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_ifSqlBool1207); 

                    pushFollow(FOLLOW_identifier_in_ifSqlBool1211);
                    ident=identifier();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) {ident.setNot(not!=null); addIdent(metaLogExpr, ident, ((meta_scope)meta_stack.peek()).text);}

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:308:4: (not= NOT )? STRING cnst= constant
                    {
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:308:7: (not= NOT )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NOT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:308:7: not= NOT
                            {
                            not=(Token)match(input,NOT,FOLLOW_NOT_in_ifSqlBool1220); 

                            }
                            break;

                    }


                    match(input,STRING,FOLLOW_STRING_in_ifSqlBool1223); 

                    pushFollow(FOLLOW_constant_in_ifSqlBool1227);
                    cnst=constant();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) {cnst.setNot(not!=null); addConstant(metaLogExpr, cnst, ((meta_scope)meta_stack.peek()).text);}

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:309:4: (not= NOT )? LPAREN newMetaLogExpr= ifSqlCond RPAREN
                    {
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:309:7: (not= NOT )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NOT) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:309:7: not= NOT
                            {
                            not=(Token)match(input,NOT,FOLLOW_NOT_in_ifSqlBool1236); 

                            }
                            break;

                    }


                    match(input,LPAREN,FOLLOW_LPAREN_in_ifSqlBool1239); 

                    pushFollow(FOLLOW_ifSqlCond_in_ifSqlBool1243);
                    newMetaLogExpr=ifSqlCond();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_ifSqlBool1245); 

                    if(!((meta_scope)meta_stack.peek()).skip) metaLogExpr.addElement(newMetaLogExpr);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ifSqlBool"



    // $ANTLR start "ordSql"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:312:1: ordSql[SqlMetaOrd ord] : ( ordSqlFragment[ord] )+ ;
    public final void ordSql(SqlMetaOrd ord) throws RecognitionException {
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:314:3: ( ( ordSqlFragment[ord] )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:315:3: ( ordSqlFragment[ord] )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:315:3: ( ordSqlFragment[ord] )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= AND && LA37_0 <= QUESTI)||(LA37_0 >= REST && LA37_0 <= WS)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:315:4: ordSqlFragment[ord]
            	    {
            	    pushFollow(FOLLOW_ordSqlFragment_in_ordSql1270);
            	    ordSqlFragment(ord);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }

            if(!((meta_scope)meta_stack.peek()).skip) addText(ord, ((meta_scope)meta_stack.peek()).text);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ordSql"



    // $ANTLR start "ordSqlFragment"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:318:1: ordSqlFragment[SqlMetaOrd ord] : (~ ( COLON | STRING | PERCENT | RBRACE ) | COLON ident= identifier | STRING cnst= constant | PERCENT dbcol= dbcolumn );
    public final void ordSqlFragment(SqlMetaOrd ord) throws RecognitionException {
        SqlMetaIdent ident =null;

        SqlMetaConst cnst =null;

        SqlDatabaseColumn dbcol =null;


        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:320:3: (~ ( COLON | STRING | PERCENT | RBRACE ) | COLON ident= identifier | STRING cnst= constant | PERCENT dbcol= dbcolumn )
            int alt38=4;
            switch ( input.LA(1) ) {
            case AND:
            case AT:
            case BAND:
            case BOR:
            case CARET:
            case COMMA:
            case DIGIT:
            case DOT:
            case EQUALS:
            case ESC_AT:
            case ESC_BOR:
            case ESC_CHAR:
            case ESC_COLON:
            case ESC_DOT:
            case ESC_HASH:
            case ESC_LBRACE:
            case ESC_PERCENT:
            case ESC_RBRACE:
            case ESC_SEMICOLON:
            case ESC_SLASH:
            case ESC_STRING:
            case HASH:
            case IDENT:
            case IDENT_DOT:
            case LBRACE:
            case LESS_THAN:
            case LPAREN:
            case MAPPING:
            case MINUS:
            case ML_COMMENT:
            case MORE_THAN:
            case NOT:
            case NUMBER:
            case OPTION:
            case OR:
            case PLUS:
            case QUESTI:
            case REST:
            case RPAREN:
            case SEMICOLON:
            case SL_COMMENT:
            case STATEMENT:
            case WS:
                {
                alt38=1;
                }
                break;
            case COLON:
                {
                alt38=2;
                }
                break;
            case STRING:
                {
                alt38=3;
                }
                break;
            case PERCENT:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:321:2: ~ ( COLON | STRING | PERCENT | RBRACE )
                    {
                    if ( (input.LA(1) >= AND && input.LA(1) <= CARET)||(input.LA(1) >= COMMA && input.LA(1) <= OR)||(input.LA(1) >= PLUS && input.LA(1) <= QUESTI)||(input.LA(1) >= REST && input.LA(1) <= STATEMENT)||input.LA(1)==WS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    if(!((meta_scope)meta_stack.peek()).skip) add(((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:323:4: COLON ident= identifier
                    {
                    match(input,COLON,FOLLOW_COLON_in_ordSqlFragment1321); 

                    pushFollow(FOLLOW_identifier_in_ordSqlFragment1325);
                    ident=identifier();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addIdent(ord, ident, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:325:4: STRING cnst= constant
                    {
                    match(input,STRING,FOLLOW_STRING_in_ordSqlFragment1335); 

                    pushFollow(FOLLOW_constant_in_ordSqlFragment1339);
                    cnst=constant();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addConstant(ord, cnst, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;
                case 4 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:327:4: PERCENT dbcol= dbcolumn
                    {
                    match(input,PERCENT,FOLLOW_PERCENT_in_ordSqlFragment1348); 

                    pushFollow(FOLLOW_dbcolumn_in_ordSqlFragment1352);
                    dbcol=dbcolumn();

                    state._fsp--;


                    if(!((meta_scope)meta_stack.peek()).skip) addDatabaseColumn(ord, dbcol, ((meta_scope)meta_stack.peek()).text);

                    }
                    break;

            }
            if(!((meta_scope)meta_stack.peek()).skip) addText(ord, ((meta_scope)meta_stack.peek()).text);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ordSqlFragment"



    // $ANTLR start "column"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:331:1: column returns [SqlMappingItem result] : (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? ;
    public final SqlMappingItem column() throws RecognitionException {
        SqlMappingItem result = null;


        Token col=null;
        Token value=null;

        result = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:333:2: ( (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:334:2: (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:334:2: (col= IDENT_DOT |col= IDENT |col= NUMBER )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENT_DOT:
                {
                alt39=1;
                }
                break;
            case IDENT:
                {
                alt39=2;
                }
                break;
            case NUMBER:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:334:3: col= IDENT_DOT
                    {
                    col=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_column1381); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:334:19: col= IDENT
                    {
                    col=(Token)match(input,IDENT,FOLLOW_IDENT_in_column1387); 

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:334:31: col= NUMBER
                    {
                    col=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_column1393); 

                    }
                    break;

            }


            if(!((meta_scope)meta_stack.peek()).skip) result = newColumn(col);

            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:335:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:335:28: LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_column1409); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:335:35: (value= IDENT |value= NUMBER )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==IDENT) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==NUMBER) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;

                    }
                    switch (alt40) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:335:36: value= IDENT
                            {
                            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_column1414); 

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:335:50: value= NUMBER
                            {
                            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_column1420); 

                            }
                            break;

                    }


                     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:336:3: ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==COMMA) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:336:29: COMMA (value= IDENT |value= NUMBER )
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_column1437); 

                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:336:35: (value= IDENT |value= NUMBER )
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==IDENT) ) {
                    	        alt41=1;
                    	    }
                    	    else if ( (LA41_0==NUMBER) ) {
                    	        alt41=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 41, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt41) {
                    	        case 1 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:336:36: value= IDENT
                    	            {
                    	            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_column1442); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:336:50: value= NUMBER
                    	            {
                    	            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_column1448); 

                    	            }
                    	            break;

                    	    }


                    	     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    match(input,RPAREN,FOLLOW_RPAREN_in_column1458); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "column"



    // $ANTLR start "constant"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:341:1: constant returns [SqlMetaConst result] : (caseCnst= PLUS |caseCnst= MINUS )? (cnst= IDENT_DOT |cnst= IDENT ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? ;
    public final SqlMetaConst constant() throws RecognitionException {
        SqlMetaConst result = null;


        Token caseCnst=null;
        Token cnst=null;
        Token value=null;

        result = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:343:2: ( (caseCnst= PLUS |caseCnst= MINUS )? (cnst= IDENT_DOT |cnst= IDENT ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:2: (caseCnst= PLUS |caseCnst= MINUS )? (cnst= IDENT_DOT |cnst= IDENT ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:2: (caseCnst= PLUS |caseCnst= MINUS )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==PLUS) ) {
                alt44=1;
            }
            else if ( (LA44_0==MINUS) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:3: caseCnst= PLUS
                    {
                    caseCnst=(Token)match(input,PLUS,FOLLOW_PLUS_in_constant1487); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:19: caseCnst= MINUS
                    {
                    caseCnst=(Token)match(input,MINUS,FOLLOW_MINUS_in_constant1493); 

                    }
                    break;

            }


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:36: (cnst= IDENT_DOT |cnst= IDENT )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==IDENT_DOT) ) {
                alt45=1;
            }
            else if ( (LA45_0==IDENT) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }
            switch (alt45) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:37: cnst= IDENT_DOT
                    {
                    cnst=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_constant1500); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:344:54: cnst= IDENT
                    {
                    cnst=(Token)match(input,IDENT,FOLLOW_IDENT_in_constant1506); 

                    }
                    break;

            }


            if(!((meta_scope)meta_stack.peek()).skip) result = newConstant(cnst, caseCnst);

            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:345:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:345:28: LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_constant1522); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:345:35: (value= IDENT |value= NUMBER )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==IDENT) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==NUMBER) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }
                    switch (alt46) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:345:36: value= IDENT
                            {
                            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_constant1527); 

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:345:50: value= NUMBER
                            {
                            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_constant1533); 

                            }
                            break;

                    }


                     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:346:3: ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==COMMA) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:346:29: COMMA (value= IDENT |value= NUMBER )
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_constant1550); 

                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:346:35: (value= IDENT |value= NUMBER )
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==IDENT) ) {
                    	        alt47=1;
                    	    }
                    	    else if ( (LA47_0==NUMBER) ) {
                    	        alt47=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 47, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:346:36: value= IDENT
                    	            {
                    	            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_constant1555); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:346:50: value= NUMBER
                    	            {
                    	            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_constant1561); 

                    	            }
                    	            break;

                    	    }


                    	     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    match(input,RPAREN,FOLLOW_RPAREN_in_constant1571); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "constant"



    // $ANTLR start "identifier"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:361:1: identifier returns [SqlMetaIdent result] : (modeIdent= EQUALS |modeIdent= LESS_THAN |modeIdent= MORE_THAN )? (caseIdent= PLUS |caseIdent= MINUS )? ident= extendedIdentifier[null] ( options {greedy=true; } : extendedIdentifier[ident] )* ;
    public final SqlMetaIdent identifier() throws RecognitionException {
        SqlMetaIdent result = null;


        Token modeIdent=null;
        Token caseIdent=null;
        SqlMetaIdent ident =null;


        SqlMetaIdent ident = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:364:2: ( (modeIdent= EQUALS |modeIdent= LESS_THAN |modeIdent= MORE_THAN )? (caseIdent= PLUS |caseIdent= MINUS )? ident= extendedIdentifier[null] ( options {greedy=true; } : extendedIdentifier[ident] )* )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:2: (modeIdent= EQUALS |modeIdent= LESS_THAN |modeIdent= MORE_THAN )? (caseIdent= PLUS |caseIdent= MINUS )? ident= extendedIdentifier[null] ( options {greedy=true; } : extendedIdentifier[ident] )*
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:2: (modeIdent= EQUALS |modeIdent= LESS_THAN |modeIdent= MORE_THAN )?
            int alt50=4;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt50=1;
                    }
                    break;
                case LESS_THAN:
                    {
                    alt50=2;
                    }
                    break;
                case MORE_THAN:
                    {
                    alt50=3;
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:3: modeIdent= EQUALS
                    {
                    modeIdent=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_identifier1606); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:22: modeIdent= LESS_THAN
                    {
                    modeIdent=(Token)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_identifier1612); 

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:44: modeIdent= MORE_THAN
                    {
                    modeIdent=(Token)match(input,MORE_THAN,FOLLOW_MORE_THAN_in_identifier1618); 

                    }
                    break;

            }


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:66: (caseIdent= PLUS |caseIdent= MINUS )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==PLUS) ) {
                alt51=1;
            }
            else if ( (LA51_0==MINUS) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:67: caseIdent= PLUS
                    {
                    caseIdent=(Token)match(input,PLUS,FOLLOW_PLUS_in_identifier1625); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:365:84: caseIdent= MINUS
                    {
                    caseIdent=(Token)match(input,MINUS,FOLLOW_MINUS_in_identifier1631); 

                    }
                    break;

            }


            pushFollow(FOLLOW_extendedIdentifier_in_identifier1638);
            ident=extendedIdentifier(null);

            state._fsp--;


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:366:33: ( options {greedy=true; } : extendedIdentifier[ident] )*
            loop52:
            do {
                int alt52=2;
                switch ( input.LA(1) ) {
                case IDENT_DOT:
                    {
                    alt52=1;
                    }
                    break;
                case IDENT:
                    {
                    alt52=1;
                    }
                    break;
                case NUMBER:
                    {
                    alt52=1;
                    }
                    break;

                }

                switch (alt52) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:366:59: extendedIdentifier[ident]
            	    {
            	    pushFollow(FOLLOW_extendedIdentifier_in_identifier1651);
            	    extendedIdentifier(ident);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            result = ident;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "extendedIdentifier"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:369:1: extendedIdentifier[SqlMetaIdent ident, Token modeIdent, Token caseIdent] returns [SqlMetaIdent result] : (name= IDENT_DOT |name= IDENT |name= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? ;
    public final SqlMetaIdent extendedIdentifier(SqlMetaIdent ident, Token modeIdent, Token caseIdent) throws RecognitionException {
        SqlMetaIdent result = null;


        Token name=null;
        Token value=null;

        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:370:2: ( (name= IDENT_DOT |name= IDENT |name= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:371:2: (name= IDENT_DOT |name= IDENT |name= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:371:2: (name= IDENT_DOT |name= IDENT |name= NUMBER )
            int alt53=3;
            switch ( input.LA(1) ) {
            case IDENT_DOT:
                {
                alt53=1;
                }
                break;
            case IDENT:
                {
                alt53=2;
                }
                break;
            case NUMBER:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:371:3: name= IDENT_DOT
                    {
                    name=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_extendedIdentifier1675); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:371:20: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendedIdentifier1681); 

                    }
                    break;
                case 3 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:371:33: name= NUMBER
                    {
                    name=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_extendedIdentifier1687); 

                    }
                    break;

            }


            result = newIdent(ident, name, modeIdent, caseIdent);

            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:372:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:372:28: LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_extendedIdentifier1703); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:372:35: (value= IDENT |value= NUMBER )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==IDENT) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==NUMBER) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;

                    }
                    switch (alt54) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:372:36: value= IDENT
                            {
                            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendedIdentifier1708); 

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:372:50: value= NUMBER
                            {
                            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_extendedIdentifier1714); 

                            }
                            break;

                    }


                     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:373:3: ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==COMMA) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:373:29: COMMA (value= IDENT |value= NUMBER )
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_extendedIdentifier1731); 

                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:373:35: (value= IDENT |value= NUMBER )
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( (LA55_0==IDENT) ) {
                    	        alt55=1;
                    	    }
                    	    else if ( (LA55_0==NUMBER) ) {
                    	        alt55=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 55, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:373:36: value= IDENT
                    	            {
                    	            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_extendedIdentifier1736); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:373:50: value= NUMBER
                    	            {
                    	            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_extendedIdentifier1742); 

                    	            }
                    	            break;

                    	    }


                    	     if(!((meta_scope)meta_stack.peek()).skip) addModifier(((meta_scope)meta_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    match(input,RPAREN,FOLLOW_RPAREN_in_extendedIdentifier1752); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "extendedIdentifier"



    // $ANTLR start "dbcolumn"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:378:1: dbcolumn returns [SqlDatabaseColumn result] : (dbcol= IDENT_DOT |dbcol= IDENT ) ;
    public final SqlDatabaseColumn dbcolumn() throws RecognitionException {
        SqlDatabaseColumn result = null;


        Token dbcol=null;

        result = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:380:2: ( (dbcol= IDENT_DOT |dbcol= IDENT ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:381:2: (dbcol= IDENT_DOT |dbcol= IDENT )
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:381:2: (dbcol= IDENT_DOT |dbcol= IDENT )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IDENT_DOT) ) {
                alt58=1;
            }
            else if ( (LA58_0==IDENT) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:381:3: dbcol= IDENT_DOT
                    {
                    dbcol=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_dbcolumn1780); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:381:21: dbcol= IDENT
                    {
                    dbcol=(Token)match(input,IDENT,FOLLOW_IDENT_in_dbcolumn1786); 

                    }
                    break;

            }


            if(!((meta_scope)meta_stack.peek()).skip) result = newDatabaseColumn(dbcol);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "dbcolumn"



    // $ANTLR start "dbtable"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:384:1: dbtable returns [SqlDatabaseTable result] : (dbtab= IDENT_DOT |dbtab= IDENT ) ;
    public final SqlDatabaseTable dbtable() throws RecognitionException {
        SqlDatabaseTable result = null;


        Token dbtab=null;

        result = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:386:2: ( (dbtab= IDENT_DOT |dbtab= IDENT ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:387:2: (dbtab= IDENT_DOT |dbtab= IDENT )
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:387:2: (dbtab= IDENT_DOT |dbtab= IDENT )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT_DOT) ) {
                alt59=1;
            }
            else if ( (LA59_0==IDENT) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:387:3: dbtab= IDENT_DOT
                    {
                    dbtab=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_dbtable1813); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:387:21: dbtab= IDENT
                    {
                    dbtab=(Token)match(input,IDENT,FOLLOW_IDENT_in_dbtable1819); 

                    }
                    break;

            }


            if(!((meta_scope)meta_stack.peek()).skip) result = newDatabaseTable(dbtab);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "dbtable"


    protected static class mapping_scope {
        SqlTypeFactory typeFactory;
        boolean skip;
    }
    protected Stack mapping_stack = new Stack();



    // $ANTLR start "mapping"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:391:1: mapping[String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMappingRule sqlMapping] : ( ( WS )* sqlMappingItem= mappingItem ( ( WS )+ sqlMappingItem= mappingItem )* ( WS )* ( EOF )? ) ;
    public final SqlMappingRule mapping(String name, SqlTypeFactory _typeFactory, boolean _skip) throws RecognitionException {
        mapping_stack.push(new mapping_scope());
        SqlMappingRule sqlMapping = null;


        SqlMappingItem sqlMappingItem =null;


        artifactName.push(name); sqlMapping = new SqlMappingRule();((mapping_scope)mapping_stack.peek()).typeFactory =_typeFactory; ((mapping_scope)mapping_stack.peek()).skip =_skip;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:395:3: ( ( ( WS )* sqlMappingItem= mappingItem ( ( WS )+ sqlMappingItem= mappingItem )* ( WS )* ( EOF )? ) )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:396:3: ( ( WS )* sqlMappingItem= mappingItem ( ( WS )+ sqlMappingItem= mappingItem )* ( WS )* ( EOF )? )
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:396:3: ( ( WS )* sqlMappingItem= mappingItem ( ( WS )+ sqlMappingItem= mappingItem )* ( WS )* ( EOF )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:397:3: ( WS )* sqlMappingItem= mappingItem ( ( WS )+ sqlMappingItem= mappingItem )* ( WS )* ( EOF )?
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:397:3: ( WS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==WS) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:397:3: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_mapping1857); 

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            pushFollow(FOLLOW_mappingItem_in_mapping1864);
            sqlMappingItem=mappingItem();

            state._fsp--;


            if(!((mapping_scope)mapping_stack.peek()).skip) sqlMapping.addMapping(sqlMappingItem);

            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:399:3: ( ( WS )+ sqlMappingItem= mappingItem )*
            loop62:
            do {
                int alt62=2;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:399:4: ( WS )+ sqlMappingItem= mappingItem
            	    {
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:399:4: ( WS )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==WS) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:399:4: WS
            	    	    {
            	    	    match(input,WS,FOLLOW_WS_in_mapping1871); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt61 >= 1 ) break loop61;
            	                EarlyExitException eee =
            	                    new EarlyExitException(61, input);
            	                throw eee;
            	        }
            	        cnt61++;
            	    } while (true);


            	    pushFollow(FOLLOW_mappingItem_in_mapping1876);
            	    sqlMappingItem=mappingItem();

            	    state._fsp--;


            	    if(!((mapping_scope)mapping_stack.peek()).skip) sqlMapping.addMapping(sqlMappingItem);

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:400:3: ( WS )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==WS) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:400:3: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_mapping1884); 

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:400:8: ( EOF )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EOF) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:400:8: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_mapping1888); 

                    }
                    break;

            }


            }


            }

             artifactName.pop();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            mapping_stack.pop();
        }
        return sqlMapping;
    }
    // $ANTLR end "mapping"



    // $ANTLR start "mappingItem"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:404:1: mappingItem returns [SqlMappingItem result] : (col= IDENT |col= NUMBER ) ( STRING (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )* )? ;
    public final SqlMappingItem mappingItem() throws RecognitionException {
        SqlMappingItem result = null;


        Token col=null;
        Token value=null;

        result = null;
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:406:2: ( (col= IDENT |col= NUMBER ) ( STRING (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )* )? )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:407:2: (col= IDENT |col= NUMBER ) ( STRING (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )* )?
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:407:2: (col= IDENT |col= NUMBER )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENT) ) {
                alt65=1;
            }
            else if ( (LA65_0==NUMBER) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:407:3: col= IDENT
                    {
                    col=(Token)match(input,IDENT,FOLLOW_IDENT_in_mappingItem1914); 

                    }
                    break;
                case 2 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:407:15: col= NUMBER
                    {
                    col=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_mappingItem1920); 

                    }
                    break;

            }


            if(!((mapping_scope)mapping_stack.peek()).skip) result = newColumn(col);

            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:24: ( STRING (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==STRING) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:25: STRING (col= IDENT_DOT |col= IDENT |col= NUMBER ) ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )*
                    {
                    match(input,STRING,FOLLOW_STRING_in_mappingItem1949); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:32: (col= IDENT_DOT |col= IDENT |col= NUMBER )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case IDENT_DOT:
                        {
                        alt66=1;
                        }
                        break;
                    case IDENT:
                        {
                        alt66=2;
                        }
                        break;
                    case NUMBER:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;

                    }

                    switch (alt66) {
                        case 1 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:33: col= IDENT_DOT
                            {
                            col=(Token)match(input,IDENT_DOT,FOLLOW_IDENT_DOT_in_mappingItem1954); 

                            }
                            break;
                        case 2 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:49: col= IDENT
                            {
                            col=(Token)match(input,IDENT,FOLLOW_IDENT_in_mappingItem1960); 

                            }
                            break;
                        case 3 :
                            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:408:61: col= NUMBER
                            {
                            col=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_mappingItem1966); 

                            }
                            break;

                    }


                     if(!((mapping_scope)mapping_stack.peek()).skip) addColumnAttr(result, col); 

                    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:409:4: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==LPAREN) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:409:30: LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN
                    	    {
                    	    match(input,LPAREN,FOLLOW_LPAREN_in_mappingItem1984); 

                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:409:37: (value= IDENT |value= NUMBER )
                    	    int alt67=2;
                    	    int LA67_0 = input.LA(1);

                    	    if ( (LA67_0==IDENT) ) {
                    	        alt67=1;
                    	    }
                    	    else if ( (LA67_0==NUMBER) ) {
                    	        alt67=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 67, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt67) {
                    	        case 1 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:409:38: value= IDENT
                    	            {
                    	            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_mappingItem1989); 

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:409:52: value= NUMBER
                    	            {
                    	            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_mappingItem1995); 

                    	            }
                    	            break;

                    	    }


                    	     if(!((mapping_scope)mapping_stack.peek()).skip) addModifier(((mapping_scope)mapping_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:410:5: ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )*
                    	    loop69:
                    	    do {
                    	        int alt69=2;
                    	        int LA69_0 = input.LA(1);

                    	        if ( (LA69_0==COMMA) ) {
                    	            alt69=1;
                    	        }


                    	        switch (alt69) {
                    	    	case 1 :
                    	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:410:31: COMMA (value= IDENT |value= NUMBER )
                    	    	    {
                    	    	    match(input,COMMA,FOLLOW_COMMA_in_mappingItem2014); 

                    	    	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:410:37: (value= IDENT |value= NUMBER )
                    	    	    int alt68=2;
                    	    	    int LA68_0 = input.LA(1);

                    	    	    if ( (LA68_0==IDENT) ) {
                    	    	        alt68=1;
                    	    	    }
                    	    	    else if ( (LA68_0==NUMBER) ) {
                    	    	        alt68=2;
                    	    	    }
                    	    	    else {
                    	    	        NoViableAltException nvae =
                    	    	            new NoViableAltException("", 68, 0, input);

                    	    	        throw nvae;

                    	    	    }
                    	    	    switch (alt68) {
                    	    	        case 1 :
                    	    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:410:38: value= IDENT
                    	    	            {
                    	    	            value=(Token)match(input,IDENT,FOLLOW_IDENT_in_mappingItem2019); 

                    	    	            }
                    	    	            break;
                    	    	        case 2 :
                    	    	            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:410:52: value= NUMBER
                    	    	            {
                    	    	            value=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_mappingItem2025); 

                    	    	            }
                    	    	            break;

                    	    	    }


                    	    	     if(!((mapping_scope)mapping_stack.peek()).skip) addModifier(((mapping_scope)mapping_stack.peek()).typeFactory, result, (value!=null?value.getText():null)); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop69;
                    	        }
                    	    } while (true);


                    	    match(input,RPAREN,FOLLOW_RPAREN_in_mappingItem2036); 

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "mappingItem"



    // $ANTLR start "option"
    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:416:1: option[String name] returns [StringBuilder text] : (~ ( SEMICOLON ) )+ ;
    public final StringBuilder option(String name) throws RecognitionException {
        StringBuilder text = null;


        artifactName.push(name); text = new StringBuilder();
        try {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:419:2: ( (~ ( SEMICOLON ) )+ )
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:419:4: (~ ( SEMICOLON ) )+
            {
            // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:419:4: (~ ( SEMICOLON ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0 >= AND && LA72_0 <= RPAREN)||(LA72_0 >= SL_COMMENT && LA72_0 <= WS)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /home/hudec/git/sql-processor/sql-processor/src/main/antlr3/org/sqlproc/engine/impl/SqlProcessor.g:419:5: ~ ( SEMICOLON )
            	    {
            	    if ( (input.LA(1) >= AND && input.LA(1) <= RPAREN)||(input.LA(1) >= SL_COMMENT && input.LA(1) <= WS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    add(text);

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


            }

             artifactName.pop();
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return text;
    }
    // $ANTLR end "option"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA43_eotS =
        "\11\uffff";
    static final String DFA43_eofS =
        "\2\2\1\uffff\3\2\1\uffff\2\2";
    static final String DFA43_minS =
        "\2\4\1\uffff\3\4\1\uffff\2\4";
    static final String DFA43_maxS =
        "\2\62\1\uffff\3\62\1\uffff\2\62";
    static final String DFA43_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\2\uffff";
    static final String DFA43_specialS =
        "\11\uffff}>";
    static final String[] DFA43_transitionS = {
            "\33\2\1\1\23\2",
            "\27\2\1\3\11\2\1\4\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2",
            "\27\2\1\7\11\2\1\10\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2"
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "335:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?";
        }
    }
    static final String DFA49_eotS =
        "\11\uffff";
    static final String DFA49_eofS =
        "\2\2\1\uffff\3\2\1\uffff\2\2";
    static final String DFA49_minS =
        "\2\4\1\uffff\3\4\1\uffff\2\4";
    static final String DFA49_maxS =
        "\2\62\1\uffff\3\62\1\uffff\2\62";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\2\uffff";
    static final String DFA49_specialS =
        "\11\uffff}>";
    static final String[] DFA49_transitionS = {
            "\33\2\1\1\23\2",
            "\27\2\1\3\11\2\1\4\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2",
            "\27\2\1\7\11\2\1\10\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "345:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?";
        }
    }
    static final String DFA57_eotS =
        "\11\uffff";
    static final String DFA57_eofS =
        "\2\2\1\uffff\3\2\1\uffff\2\2";
    static final String DFA57_minS =
        "\2\4\1\uffff\3\4\1\uffff\2\4";
    static final String DFA57_maxS =
        "\2\62\1\uffff\3\62\1\uffff\2\62";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\2\uffff";
    static final String DFA57_specialS =
        "\11\uffff}>";
    static final String[] DFA57_transitionS = {
            "\33\2\1\1\23\2",
            "\27\2\1\3\11\2\1\4\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2",
            "\27\2\1\7\11\2\1\10\15\2",
            "",
            "\6\2\1\5\42\2\1\6\5\2",
            "\6\2\1\5\42\2\1\6\5\2"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "372:2: ( options {greedy=true; } : LPAREN (value= IDENT |value= NUMBER ) ( options {greedy=true; } : COMMA (value= IDENT |value= NUMBER ) )* RPAREN )?";
        }
    }
    static final String DFA62_eotS =
        "\4\uffff";
    static final String DFA62_eofS =
        "\2\2\2\uffff";
    static final String DFA62_minS =
        "\1\56\1\33\2\uffff";
    static final String DFA62_maxS =
        "\2\62\2\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA62_specialS =
        "\4\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\3\11\uffff\1\3\10\uffff\1\2\3\uffff\1\1",
            "",
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
            return "()* loopback of 399:3: ( ( WS )+ sqlMappingItem= mappingItem )*";
        }
    }
 

    public static final BitSet FOLLOW_parse2_in_parse52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_parse293 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2110 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_parse2114 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_STATEMENT_in_parse2118 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_parse2123 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2127 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_parse2133 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUALS_in_parse2135 = new BitSet(new long[]{0x0007BFFFFFFFFFF0L});
    public static final BitSet FOLLOW_meta_in_parse2151 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_parse2156 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_WS_in_parse2158 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2176 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_parse2180 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_MAPPING_in_parse2184 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_parse2189 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2193 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_parse2199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUALS_in_parse2201 = new BitSet(new long[]{0x0004002008000000L});
    public static final BitSet FOLLOW_mapping_in_parse2217 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_parse2222 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_WS_in_parse2224 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2242 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_parse2244 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OPTION_in_parse2248 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_parse2253 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDENT_in_parse2257 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_parse2263 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUALS_in_parse2265 = new BitSet(new long[]{0x0007BFFFFFFFFFF0L});
    public static final BitSet FOLLOW_option_in_parse2281 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_parse2286 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_WS_in_parse2288 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_EOF_in_parse2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sql_in_meta335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_meta338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqlFragment_in_sql377 = new BitSet(new long[]{0x0007BFFFFFFFFFF2L});
    public static final BitSet FOLLOW_set_in_sqlFragment406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sqlFragment438 = new BitSet(new long[]{0x0000022A58002000L});
    public static final BitSet FOLLOW_identifier_in_sqlFragment442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_sqlFragment457 = new BitSet(new long[]{0x0000020218000000L});
    public static final BitSet FOLLOW_constant_in_sqlFragment461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_sqlFragment481 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_column_in_sqlFragment485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_sqlFragment501 = new BitSet(new long[]{0x0000010018000000L});
    public static final BitSet FOLLOW_PERCENT_in_sqlFragment504 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_dbtable_in_sqlFragment508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dbcolumn_in_sqlFragment529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_sqlFragment542 = new BitSet(new long[]{0x0007F7FFFFFFFFF0L});
    public static final BitSet FOLLOW_metaSql_in_sqlFragment544 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_sqlFragment547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_metaSql572 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql603 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_metaSql612 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql616 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_QUESTI_in_metaSql628 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_ifSqlCond_in_metaSql634 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BOR_in_metaSql641 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql645 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_metaSql654 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql658 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BAND_in_metaSql673 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql679 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_metaSql688 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql692 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_metaSql704 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql710 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_metaSql719 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql723 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_EQUALS_in_metaSql735 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_WS_in_metaSql737 = new BitSet(new long[]{0x0004000008000000L});
    public static final BitSet FOLLOW_IDENT_in_metaSql742 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_metaSql748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_metaSql761 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NUMBER_in_metaSql765 = new BitSet(new long[]{0x0007F7FFFFFFFFF0L});
    public static final BitSet FOLLOW_ordSql_in_metaSql769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifSqlFragment_in_ifSql796 = new BitSet(new long[]{0x0007F7FFFFFFFF72L});
    public static final BitSet FOLLOW_set_in_ifSqlFragment818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_ifSqlFragment854 = new BitSet(new long[]{0x0000022A58002000L});
    public static final BitSet FOLLOW_identifier_in_ifSqlFragment858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_ifSqlFragment868 = new BitSet(new long[]{0x0000020218000000L});
    public static final BitSet FOLLOW_constant_in_ifSqlFragment872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ifSqlFragment887 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_column_in_ifSqlFragment891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_ifSqlFragment906 = new BitSet(new long[]{0x0000010018000000L});
    public static final BitSet FOLLOW_PERCENT_in_ifSqlFragment909 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_dbtable_in_ifSqlFragment913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dbcolumn_in_ifSqlFragment934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_ifSqlFragment942 = new BitSet(new long[]{0x0007F7FFDFFFFFF0L});
    public static final BitSet FOLLOW_ifMetaSql_in_ifSqlFragment944 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_RBRACE_in_ifSqlFragment947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ifMetaSql980 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1007 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1016 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1020 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_QUESTI_in_ifMetaSql1032 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_ifSqlCond_in_ifMetaSql1038 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1045 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1049 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1058 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1062 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BAND_in_ifMetaSql1077 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1083 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1092 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1096 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1108 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1114 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BOR_in_ifMetaSql1123 = new BitSet(new long[]{0x0007F7FFFFFFFF70L});
    public static final BitSet FOLLOW_ifSql_in_ifMetaSql1127 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_WS_in_ifSqlCond1154 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_ifSqlBool_in_ifSqlCond1157 = new BitSet(new long[]{0x0004008000000012L});
    public static final BitSet FOLLOW_WS_in_ifSqlCond1160 = new BitSet(new long[]{0x0004008000000012L});
    public static final BitSet FOLLOW_AND_in_ifSqlCond1165 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_OR_in_ifSqlCond1171 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_WS_in_ifSqlCond1176 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_ifSqlBool_in_ifSqlCond1181 = new BitSet(new long[]{0x0004008000000012L});
    public static final BitSet FOLLOW_WS_in_ifSqlCond1184 = new BitSet(new long[]{0x0004008000000012L});
    public static final BitSet FOLLOW_NOT_in_ifSqlBool1204 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_ifSqlBool1207 = new BitSet(new long[]{0x0000022A58002000L});
    public static final BitSet FOLLOW_identifier_in_ifSqlBool1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_ifSqlBool1220 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_ifSqlBool1223 = new BitSet(new long[]{0x0000020218000000L});
    public static final BitSet FOLLOW_constant_in_ifSqlBool1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_ifSqlBool1236 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_ifSqlBool1239 = new BitSet(new long[]{0x0006001080000200L});
    public static final BitSet FOLLOW_ifSqlCond_in_ifSqlBool1243 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_ifSqlBool1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordSqlFragment_in_ordSql1270 = new BitSet(new long[]{0x0007F7FFFFFFFFF2L});
    public static final BitSet FOLLOW_set_in_ordSqlFragment1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_ordSqlFragment1321 = new BitSet(new long[]{0x0000022A58002000L});
    public static final BitSet FOLLOW_identifier_in_ordSqlFragment1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_ordSqlFragment1335 = new BitSet(new long[]{0x0000020218000000L});
    public static final BitSet FOLLOW_constant_in_ordSqlFragment1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_ordSqlFragment1348 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_dbcolumn_in_ordSqlFragment1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_DOT_in_column1381 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_column1387 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NUMBER_in_column1393 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LPAREN_in_column1409 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_column1414 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_column1420 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_column1437 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_column1442 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_column1448 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_column1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_constant1487 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_MINUS_in_constant1493 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_IDENT_DOT_in_constant1500 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_constant1506 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LPAREN_in_constant1522 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_constant1527 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_constant1533 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_constant1550 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_constant1555 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_constant1561 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_constant1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_identifier1606 = new BitSet(new long[]{0x0000022218000000L});
    public static final BitSet FOLLOW_LESS_THAN_in_identifier1612 = new BitSet(new long[]{0x0000022218000000L});
    public static final BitSet FOLLOW_MORE_THAN_in_identifier1618 = new BitSet(new long[]{0x0000022218000000L});
    public static final BitSet FOLLOW_PLUS_in_identifier1625 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_MINUS_in_identifier1631 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_extendedIdentifier_in_identifier1638 = new BitSet(new long[]{0x0000002018000002L});
    public static final BitSet FOLLOW_extendedIdentifier_in_identifier1651 = new BitSet(new long[]{0x0000002018000002L});
    public static final BitSet FOLLOW_IDENT_DOT_in_extendedIdentifier1675 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_extendedIdentifier1681 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NUMBER_in_extendedIdentifier1687 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LPAREN_in_extendedIdentifier1703 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_extendedIdentifier1708 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_extendedIdentifier1714 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_extendedIdentifier1731 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_extendedIdentifier1736 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_extendedIdentifier1742 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_extendedIdentifier1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_DOT_in_dbcolumn1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_dbcolumn1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_DOT_in_dbtable1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_dbtable1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_mapping1857 = new BitSet(new long[]{0x0004002008000000L});
    public static final BitSet FOLLOW_mappingItem_in_mapping1864 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_WS_in_mapping1871 = new BitSet(new long[]{0x0004002008000000L});
    public static final BitSet FOLLOW_mappingItem_in_mapping1876 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_WS_in_mapping1884 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_EOF_in_mapping1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_mappingItem1914 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_mappingItem1920 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_STRING_in_mappingItem1949 = new BitSet(new long[]{0x0000002018000000L});
    public static final BitSet FOLLOW_IDENT_DOT_in_mappingItem1954 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IDENT_in_mappingItem1960 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_NUMBER_in_mappingItem1966 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_LPAREN_in_mappingItem1984 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_mappingItem1989 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_mappingItem1995 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_COMMA_in_mappingItem2014 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_IDENT_in_mappingItem2019 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_NUMBER_in_mappingItem2025 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_RPAREN_in_mappingItem2036 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_set_in_option2076 = new BitSet(new long[]{0x0007BFFFFFFFFFF2L});

}