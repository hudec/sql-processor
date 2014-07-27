grammar SqlProcessorLazy;

//options {
//    k=2;                                // needed for "&&" and "||"
//}

@lexer::header { 
package org.sqlproc.engine.impl;
}

@header { 
package org.sqlproc.engine.impl;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.type.SqlMetaType;
}

@lexer::members {
  private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
  
  public List<ErrorMsg> getErrors() {
    return errors;
  }

  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    String msg = super.getErrorMessage(e,tokenNames);
    errors.add(ParserUtils.create(null,msg,e,tokenNames));
    return msg;
  }
}

@members {
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
  
  SqlMappingItem newColumn(String col) {
    return ParserUtils.newColumn(col);
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

 SqlMetaOperator lastOperator = null;
  
  void addIdent(Object target, SqlMetaIdent ident, StringBuilder text) {
    ParserUtils.addIdent(target, ident, text, lastOperator);
    lastOperator = null;
  }
  
  SqlMetaIdent newIdent(Token ident, Token modeIdent, Token caseIdent) {
    return ParserUtils.newIdent(ident.getText(), getText(modeIdent), getText(caseIdent));
  }

  void addConstant(Object target, SqlMetaConst cnst, StringBuilder text) {
    ParserUtils.addConstant(target, cnst, text, lastOperator);
    lastOperator = null;
  }
  
  SqlMetaConst newConstant(Token cnst, Token caseConversion) {
    return ParserUtils.newConstant(cnst.getText(), getText(caseConversion));
  }
  
  void addOperator(Object target, SqlMetaOperator metaOper, StringBuilder text) {
    ParserUtils.addOperator(target, metaOper, text);
    lastOperator = metaOper;
  }

  SqlMetaOperator newIdentOperator(Token ident) {
    return ParserUtils.newOperator(true, ident.getText());
  }
  
  SqlMetaOperator newConstOperator(Token cnst) {
    return ParserUtils.newOperator(false, cnst.getText());
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

  void addModifier(SqlTypeFactory typeFactory, SqlMappingItem item, String modifier, String attrName) {
    ParserUtils.addModifier(item, typeFactory, modifier, attrName);
  }

  void addModifier(SqlTypeFactory typeFactory, SqlMetaIdent item, String modifier, Token not) {
    if (not != null)
      modifier = "not" + modifier;
    ParserUtils.addModifier(item, typeFactory, modifier);
  }

  void addModifier(SqlTypeFactory typeFactory, SqlMetaConst item, String modifier, Token not) {
    if (not != null)
      modifier = "not" + modifier;
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
  
  boolean addStatement(SqlProcessor processor, String type, String name, String statement, List<String> activeFilters, String... filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMetaStatement(type, name, statement, null, errorsList, activeFilters, filters);
    return errorsList == null;
  }
  
  boolean addMapping(SqlProcessor processor, String type, String name, String mapping, List<String> activeFilters, String... filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMappingRule(type, name, mapping, null, errorsList, activeFilters, filters);
    return errorsList == null;
  }
  
  boolean add(SqlProcessor processor, String type, String name, String feature, List<String> activeFilters, String... filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addFeature(type, name, feature, errorsList, activeFilters, filters);
    return errorsList == null;
  }
  
  SqlMetaIfItem newSqlMetaIfItem() {
    lastOperator = null;
    return new SqlMetaIfItem();
  }
  
  SqlMetaStatement newSqlMetaStatement() {
    lastOperator = null;
    return new SqlMetaStatement();
  }
}

parse	:
        parse2[org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), new String[\] {}]
	;
	
parse2 [SqlTypeFactory _typeFactory, Map<String, Object> defaultFeatures, Set<String> onlyStatements, String[\] filters] returns [SqlProcessor processor]
@init {$processor = new SqlProcessor(defaultFeatures, onlyStatements); boolean skip; List<String> activeFilters;}
        :  
        WS* (
         (name=IDENT {skip=doSkip(onlyStatements,$name.text);} LPAREN type=STATEMENT {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS 
           text=option[$name.text] {addStatement(processor, $type.text, $name.text, text.toString(), activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT {skip=doSkip(onlyStatements,$name.text);} LPAREN type=MAPPING {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS 
           text=option[$name.text] {addMapping(processor, $type.text, $name.text, text.toString(), activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT LPAREN type=OPTION {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS 
           text=option[$name.text] {add(processor, $type.text, $name.text, text.toString(), activeFilters, filters);} SEMICOLON WS*)
        )+ EOF
	;

option [String name] returns [StringBuilder text]
@init {artifactName.push(name); text = new StringBuilder();}
@after { artifactName.pop();}
	: (~(SEMICOLON) {add(text);})+
	;

	
STATEMENT: 'QRY'|'CRUD'|'CALL';
MAPPING: 'OUT';
OPTION: 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' | 'MOPT';
	
IDENT_DOT: IDENT (DOT IDENT)+;
IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '=')*;
NUMBER: DIGIT+;
fragment
DIGIT: ('0'..'9');
ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {$channel=HIDDEN;} ;
SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {$channel=HIDDEN;} ;
WS:    (' ' | '\t' | '\n' | '\r')+ ;
AND:   '&' '&' ;
OR:    '|' '|' ;

fragment
ESC_COLON:    '\\' ':' ;
fragment
ESC_SEMICOLON:'\\' ';' ;
fragment
ESC_STRING:   '\\' '$' ;
fragment
ESC_LBRACE:   '\\' '{' ;
fragment
ESC_RBRACE:   '\\' '}' ;
fragment
ESC_BOR:      '\\' '|' ;
fragment
ESC_HASH:     '\\' '#' ;
fragment
ESC_AT:	      '\\' '@';
fragment
ESC_PERCENT:  '\\' '%';
fragment
ESC_DOT:  '\\' '.';
fragment
ESC_SLASH:  '\\' '/';
ESC_CHAR:  (ESC_COLON | ESC_SEMICOLON | ESC_STRING | ESC_LBRACE | ESC_RBRACE | ESC_BOR | ESC_HASH | ESC_AT | ESC_PERCENT|ESC_DOT|ESC_SLASH);

COLON:    ':' ;
SEMICOLON:';' ;
STRING:   '$' ;
fragment
DOT:      '.' ;
COMMA:    ',' ;
MINUS:    '-' ;
PLUS:     '+' ;
LPAREN:   '(' ;
RPAREN:   ')' ;
LBRACE:   '{' ;
RBRACE:   '}' ;
QUESTI:   '?' ;
NOT:      '!' ;
BAND:     '&' ;
BOR:      '|' ;
HASH:     '#' ;
AT:	  '@';
CARET:    '^';
EQUALS:   '=' ;
LESS_THAN:'<' ;
MORE_THAN:'>' ;
PERCENT:  '%' ;
REST:     ~(COLON | SEMICOLON | STRING | COMMA | MINUS | PLUS | LPAREN | RPAREN | LBRACE | RBRACE | QUESTI | NOT | BAND | BOR | HASH | AT | CARET | EQUALS | LESS_THAN | MORE_THAN | PERCENT);
