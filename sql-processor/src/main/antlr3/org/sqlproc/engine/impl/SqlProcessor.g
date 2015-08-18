grammar SqlProcessor;

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
  
  boolean add(SqlProcessor processor, String type, String name, SqlMetaStatement statement, List<String> activeFilters, String... filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMetaStatement(type, name, null, statement, errorsList, activeFilters, filters);
    return errorsList == null;
  }
  
  boolean add(SqlProcessor processor, String type, String name, SqlMappingRule mapping, List<String> activeFilters, String... filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMappingRule(type, name, null, mapping, errorsList, activeFilters, filters);
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
           metaStatement=meta[$name.text, _typeFactory, skip] {add(processor, $type.text, $name.text, metaStatement, activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT {skip=doSkip(onlyStatements,$name.text);} LPAREN type=MAPPING {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS 
           mappingRule=mapping[$name.text, _typeFactory, skip] {add(processor, $type.text, $name.text, mappingRule, activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT LPAREN type=OPTION {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS 
           text=option[$name.text] {add(processor, $type.text, $name.text, text.toString(), activeFilters, filters);} SEMICOLON WS*)
        )+ EOF
	;
	
meta [String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMetaStatement metaStatement]
scope {StringBuilder text;boolean hasOutputMapping;SqlTypeFactory typeFactory;boolean skip;}
@init {artifactName.push(name); $metaStatement = newSqlMetaStatement(); $meta::text = new StringBuilder(); $meta::typeFactory=_typeFactory; $meta::skip=_skip;}
@after {$metaStatement.setHasOutputMapping($meta::hasOutputMapping); artifactName.pop();}
	: sql[metaStatement] EOF?
	;

sql [SqlMetaStatement metaStatement]	
                     	:	
	(sqlFragment[metaStatement])+
     	;

sqlFragment [SqlMetaStatement metaStatement]	
@after {if(!$meta::skip) addText(metaStatement, $meta::text);}
	:	
	~(COLON | STRING | AT | PERCENT | LBRACE | SEMICOLON)
		{if(!$meta::skip) add($meta::text);}
	| COLON ident=identifier 
		{if(!$meta::skip) addIdent(metaStatement, ident, $meta::text);}
     	| STRING cnst=constant 
     		{if(!$meta::skip) addConstant(metaStatement, cnst, $meta::text);}
	| COLON COLON identOper=identifierOperator 
		{if(!$meta::skip) addOperator(metaStatement, identOper, $meta::text);}
	| STRING STRING cnstOper=constantOperator 
		{if(!$meta::skip) addOperator(metaStatement, cnstOper, $meta::text);}
     	| AT col=column 
     		{if(!$meta::skip) addColumn(metaStatement, col, $meta::text);$meta::hasOutputMapping=true;}
	|  PERCENT (PERCENT dbtab=dbtable {if(!$meta::skip) addDatabaseTable(metaStatement, dbtab, $meta::text);}
	            | dbcol=dbcolumn {if(!$meta::skip) addDatabaseColumn(metaStatement, dbcol, $meta::text);})
     	| LBRACE metaSql[metaStatement] RBRACE
     	;

metaSql [SqlMetaStatement metaStatement]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; SqlMetaOrd metaOrd; SqlMetaSqlFragment sqlFragment; if(!$meta::skip) addText(metaStatement, $meta::text);}	
	:
	~(QUESTI | BAND | BOR | EQUALS | HASH | RBRACE)
		{if(!$meta::skip) add($meta::text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {metaAndOr.addElement(metaIfItem);})* {metaStatement.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {if(!$meta::skip) metaIf.setExpression(metaLogExpr);} 
		BOR metaIfItem=ifSql[null] {if(!$meta::skip) metaIf.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {if(!$meta::skip) metaIf.addElement(metaIfItem);})*
		 {metaStatement.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem);})* {if(!$meta::skip) metaStatement.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem);} 
		(BOR metaIfItem=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem);})* {if(!$meta::skip) metaStatement.addElement(metaAndOr);}
	| EQUALS WS* fragmentType=IDENT {sqlFragment = new SqlMetaSqlFragment(fragmentType.getText());} metaIfItem=ifSql[null] {if(!$meta::skip) sqlFragment.addElement(metaIfItem);} 
		{if(!$meta::skip) metaStatement.addElement(sqlFragment);}
	| HASH orderId=(NUMBER | IDENT) {metaOrd = new SqlMetaOrd(orderId.getText());} ordSql[metaOrd] {if(!$meta::skip) metaStatement.addElement(metaOrd);}
	;
	
ifSql [SqlMetaIfItem metaIfItemIn] returns[SqlMetaIfItem metaIfItem]
@init {$metaIfItem = (metaIfItemIn !=null) ? metaIfItemIn : newSqlMetaIfItem();}
	:
	(ifSqlFragment[metaIfItem])+
	;

ifSqlFragment [SqlMetaIfItem metaIfItem]
@after {if(!$meta::skip) addText(metaIfItem, $meta::text);}
	:
	~(COLON | STRING | AT | PERCENT | LBRACE | BOR | RBRACE)
		{if(!$meta::skip) add($meta::text);}
	| COLON ident=identifier 
		{if(!$meta::skip) addIdent(metaIfItem, ident, $meta::text);}
	| STRING cnst=constant 
		{if(!$meta::skip) addConstant(metaIfItem, cnst, $meta::text);}
	| COLON COLON identOper=identifierOperator 
		{if(!$meta::skip) addOperator(metaIfItem, identOper, $meta::text);}
	| STRING STRING cnstOper=constantOperator 
		{if(!$meta::skip) addOperator(metaIfItem, cnstOper, $meta::text);}
     	| AT col=column 
     		{if(!$meta::skip) addColumn(metaIfItem, col, $meta::text);$meta::hasOutputMapping=true;}
	| PERCENT (PERCENT dbtab=dbtable {if(!$meta::skip) addDatabaseTable(metaIfItem, dbtab, $meta::text);}
	            | dbcol=dbcolumn {if(!$meta::skip) addDatabaseColumn(metaIfItem, dbcol, $meta::text);})
	| LBRACE ifMetaSql[metaIfItem] RBRACE
	;
     	
     	
ifMetaSql [SqlMetaIfItem metaIfItem]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; if(!$meta::skip) addText(metaIfItem, $meta::text);}	
	:
	~(QUESTI | BAND | BOR | LBRACE | RBRACE)
		{if(!$meta::skip) add($meta::text); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);})* {if(!$meta::skip) metaIfItem.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {if(!$meta::skip) metaIf.setExpression(metaLogExpr);} 
		BOR metaIfItem2=ifSql[null] {if(!$meta::skip) metaIf.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {if(!$meta::skip) metaIf.addElement(metaIfItem2);})*
		 {if(!$meta::skip) metaIfItem.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);})* {if(!$meta::skip) metaIfItem.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);} 
		(BOR metaIfItem2=ifSql[null] {if(!$meta::skip) metaAndOr.addElement(metaIfItem2);})* {if(!$meta::skip) metaIfItem.addElement(metaAndOr);}
	;

ifSqlCond returns[SqlMetaLogExpr metaLogExpr]
@init {$metaLogExpr = new SqlMetaLogExpr();}
	:
	WS* ifSqlBool[metaLogExpr] WS* ((AND {if(!$meta::skip) addOperator(metaLogExpr,true);} | OR {if(!$meta::skip) addOperator(metaLogExpr,false);}) WS*
		ifSqlBool[metaLogExpr] WS*)*
	;
	
ifSqlBool [SqlMetaLogExpr metaLogExpr]
	:
	not=NOT? COLON ident=identifier {if(!$meta::skip) {ident.setNot(not!=null); addIdent(metaLogExpr, ident, $meta::text);}}
	| not=NOT? STRING cnst=constant {if(!$meta::skip) {cnst.setNot(not!=null); addConstant(metaLogExpr, cnst, $meta::text);}}
	| not=NOT? LPAREN newMetaLogExpr=ifSqlCond RPAREN {if(!$meta::skip) metaLogExpr.addElement(newMetaLogExpr);}
	;
	
ordSql [SqlMetaOrd ord]
@after {if(!$meta::skip) addText(ord, $meta::text);}
 	:
 	(ordSqlFragment[ord])+	
	;	
	
ordSqlFragment [SqlMetaOrd ord]
@after {if(!$meta::skip) addText(ord, $meta::text);}
 	:	
	~(COLON | STRING | PERCENT | RBRACE)
		{if(!$meta::skip) add($meta::text);}
	| COLON ident=identifier 
		{if(!$meta::skip) addIdent(ord, ident, $meta::text);}
	| STRING cnst=constant
		{if(!$meta::skip) addConstant(ord, cnst, $meta::text);}
	| PERCENT dbcol=dbcolumn
		{if(!$meta::skip) addDatabaseColumn(ord, dbcol, $meta::text);}
	;	

/*
column returns[SqlMappingItem result]
@init {$result = null;}
	:	
	(col=IDENT_DOT | col=IDENT | col=NUMBER) {if(!$meta::skip) $result = newColumn(col);}
	(options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text); }
	 (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text); }
	 )* RPAREN
	)?
	;
*/

column returns [SqlMappingItem result]
@init {$result = null; String sname; Map<String, List<String>> modifiers = new HashMap<String, List<String>>(); }
@after {if(!$meta::skip) $result = newColumn(sname); if(!$meta::skip) for (String n : modifiers.keySet()) for (String m : modifiers.get(n)) addModifier($meta::typeFactory, result, m, n); }
	:
	(name=IDENT_DOT | name=IDENT | name=NUMBER) {sname =  $name.text; }
	(options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	 (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	 )* RPAREN
	)?
	(options {greedy=true;} : 
 	 (name=IDENT_DOT | name=IDENT | name=NUMBER) {sname = sname + "." + $name.text; }
	 (options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	  (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	  )* RPAREN
	 )?
	)*
	;

constant returns [SqlMetaConst result]
@init {$result = null;}
	:	
	(caseCnst=PLUS | caseCnst=MINUS)? (cnst=IDENT_DOT | cnst=IDENT) {if(!$meta::skip) $result = newConstant(cnst, $caseCnst);}
	(options {greedy=true;} : LPAREN not=NOT? (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text, not); }
	 (options {greedy=true;} : COMMA not=NOT? (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text, not); }
	 )* RPAREN
	)?
	;

identifier returns [SqlMetaIdent result]
@init {$result = null;}
	:	
	(modeIdent=EQUALS | modeIdent=LESS_THAN | modeIdent=MORE_THAN)? (caseIdent=PLUS | caseIdent=MINUS)? (ident=IDENT_DOT | ident=IDENT | ident=NUMBER) {if(!$meta::skip) $result = newIdent($ident, $modeIdent, $caseIdent);}
	(options {greedy=true;} : LPAREN not=NOT? (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text, not); }
	 (options {greedy=true;} : COMMA not=NOT? (value=IDENT | value=NUMBER) { if(!$meta::skip) addModifier($meta::typeFactory, $result, $value.text, not); }
	 )* RPAREN
	)?
	;

constantOperator returns [SqlMetaOperator result]
@init {$result = null;}
                      :
                       (ident = IDENT | ident = EQUALS) {if(!$meta::skip) $result = newConstOperator(ident);}
                      ;

identifierOperator returns [SqlMetaOperator result]
@init {$result = null;}
                      :
                       (ident = IDENT | ident = EQUALS) {if(!$meta::skip) $result = newIdentOperator(ident);}
                      ;

dbcolumn returns[SqlDatabaseColumn result]
@init {$result = null;}
	:	
	(dbcol=IDENT_DOT | dbcol=IDENT) {if(!$meta::skip) $result = newDatabaseColumn(dbcol);}
	;

dbtable returns[SqlDatabaseTable result]
@init {$result = null;}
	:	
	(dbtab=IDENT_DOT | dbtab=IDENT) {if(!$meta::skip) $result = newDatabaseTable(dbtab);}
	;


mapping [String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMappingRule sqlMapping]
scope {SqlTypeFactory typeFactory;boolean skip;}
@init {artifactName.push(name); $sqlMapping = new SqlMappingRule();$mapping::typeFactory=_typeFactory; $mapping::skip=_skip;}
@after { artifactName.pop();}
:
(
  WS*
  sqlMappingItem=mappingItem {if(!$mapping::skip) $sqlMapping.addMapping(sqlMappingItem);}
  (WS+ sqlMappingItem=mappingItem {if(!$mapping::skip) $sqlMapping.addMapping(sqlMappingItem);})*
  WS*  EOF?
)
;

/*
mappingItem returns[SqlMappingItem result]
@init {$result = null;}
	:	
	(col=IDENT | col=NUMBER) {if(!$mapping::skip) $result = newColumn($col.text);}
     (STRING (col=IDENT_DOT | col=IDENT | col=NUMBER) { if(!$mapping::skip) addColumnAttr($result, $col); }
	  (options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { if(!$mapping::skip) addModifier($mapping::typeFactory, $result, $value.text); }
	   (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { if(!$mapping::skip) addModifier($mapping::typeFactory, $result, $value.text); }
	  )* RPAREN
	 )*
  	)?
	;
*/
	
mappingItem returns[SqlMappingItem result]
@init {String sname; Map<String, List<String>> modifiers = new HashMap<String, List<String>>(); }
@after {if(!$mapping::skip) for (String n : modifiers.keySet()) for (String m : modifiers.get(n)) addModifier($mapping::typeFactory, result, m, n); }
	:	
	(col=IDENT | col=NUMBER) {if(!$mapping::skip) $result = newColumn($col.text); }
    (STRING (name=IDENT_DOT | name=IDENT | name=NUMBER) { if(!$mapping::skip) addColumnAttr($result, $name); sname =  $name.text; }
	 (options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	  (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	  )* RPAREN
	 )*
     ((name=IDENT_DOT | name=IDENT | name=NUMBER) { if(!$mapping::skip) addColumnAttr($result, $name); sname = sname + "." + $name.text; }
	  (options {greedy=true;} : LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	   (options {greedy=true;} : COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	   )* RPAREN
	  )*
  	 )*
  	)?
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
