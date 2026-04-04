grammar SqlProcessor;

@header {
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.sqlproc.engine.type.SqlTypeFactory;
import org.sqlproc.engine.type.SqlMetaType;
}

@parser::members {
  private Token getLastToken() {
    return _input.LT(-1);
  }

  private Stack artifactName = new Stack();
  private Stack partialErrors = new Stack();
  private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();

  // Scope variables replacing ANTLR 3 dynamic scopes
  private StringBuilder _scopeText;
  private boolean _scopeHasOutputMapping;
  private SqlTypeFactory _scopeTypeFactory;
  private boolean _scopeSkip;

  public List<ErrorMsg> getErrors() {
    return errors;
  }

  public void addError(ErrorMsg error) {
    errors.add(error);
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

  boolean add(SqlProcessor processor, String type, String name, SqlMetaStatement statement, List<String> activeFilters, List<String> filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMetaStatement(type, name, null, statement, errorsList, activeFilters, filters.toArray(new String[0]));
    return errorsList == null;
  }

  boolean add(SqlProcessor processor, String type, String name, SqlMappingRule mapping, List<String> activeFilters, List<String> filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addMappingRule(type, name, null, mapping, errorsList, activeFilters, filters.toArray(new String[0]));
    return errorsList == null;
  }

  boolean add(SqlProcessor processor, String type, String name, String feature, List<String> activeFilters, List<String> filters) {
    List<ErrorMsg> errorsList = getPartialErrors();
    processor.addFeature(type, name, feature, errorsList, activeFilters, filters.toArray(new String[0]));
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
        parse2[org.sqlproc.engine.jdbc.type.JdbcTypeFactory.getInstance(), new java.util.HashMap<String, Object>(), new java.util.HashSet<String>(), java.util.Collections.emptyList()]
	;

parse2 [SqlTypeFactory _typeFactory, Map<String, Object> defaultFeatures, Set<String> onlyStatements, List<String> filters] returns [SqlProcessor processor]
@init {$processor = new SqlProcessor(defaultFeatures, onlyStatements); boolean skip; List<String> activeFilters;}
        :
        WS* (
         (name=IDENT {skip=doSkip(onlyStatements,$name.text);} LPAREN type=STATEMENT {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS
           metaStatement=meta[$name.text, _typeFactory, skip] {add($processor, $type.text, $name.text, $metaStatement.metaStatement, activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT {skip=doSkip(onlyStatements,$name.text);} LPAREN type=MAPPING {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS
           mappingRule=mapping[$name.text, _typeFactory, skip] {add($processor, $type.text, $name.text, $mappingRule.sqlMapping, activeFilters, filters);} SEMICOLON WS*)
         | (name=IDENT LPAREN type=OPTION {activeFilters = new ArrayList<String>();} (COMMA filter=IDENT {activeFilters.add($filter.text);})* RPAREN EQUALS
           optionCtx=option[$name.text] {add($processor, $type.text, $name.text, $optionCtx.text.toString(), activeFilters, filters);} SEMICOLON WS*)
        )+ EOF
	;

meta [String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMetaStatement metaStatement]
@init {artifactName.push(name); $metaStatement = newSqlMetaStatement(); _scopeText = new StringBuilder(); _scopeTypeFactory=_typeFactory; _scopeSkip=_skip; _scopeHasOutputMapping=false;}
@after {$metaStatement.setHasOutputMapping(_scopeHasOutputMapping); artifactName.pop();}
	: sql[$metaStatement] EOF?
	;

sql [SqlMetaStatement metaStatement]
                     	:
	(sqlFragment[metaStatement])+
     	;

sqlFragment [SqlMetaStatement metaStatement]
@after {if(!_scopeSkip) addText(metaStatement, _scopeText);}
	:
	~(COLON | STRING | AT | PERCENT | LBRACE | SEMICOLON)
		{if(!_scopeSkip) add(_scopeText);}
	| COLON ident=identifier
		{if(!_scopeSkip) addIdent(metaStatement, $ident.result, _scopeText);}
   	| STRING cnst=constant
   		{if(!_scopeSkip) addConstant(metaStatement, $cnst.result, _scopeText);}
	| COLON COLON identOper=identifierOperator
		{if(!_scopeSkip) addOperator(metaStatement, $identOper.result, _scopeText);}
	| STRING STRING cnstOper=constantOperator
		{if(!_scopeSkip) addOperator(metaStatement, $cnstOper.result, _scopeText);}
   	| AT col=column
   		{if(!_scopeSkip) addColumn(metaStatement, $col.result, _scopeText); _scopeHasOutputMapping=true;}
	|  PERCENT (PERCENT dbtab=dbtable {if(!_scopeSkip) addDatabaseTable(metaStatement, $dbtab.result, _scopeText);}
	            | dbcol=dbcolumn {if(!_scopeSkip) addDatabaseColumn(metaStatement, $dbcol.result, _scopeText);})
   	| LBRACE metaSql[metaStatement] RBRACE
   	;

metaSql [SqlMetaStatement metaStatement]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; SqlMetaOrd metaOrd; SqlMetaSqlFragment sqlFragment; if(!_scopeSkip) addText(metaStatement, _scopeText);}
	:
	~(QUESTI | BAND | BOR | EQUALS | HASH | RBRACE)
		{if(!_scopeSkip) add(_scopeText); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem.metaIfItem);}
		(BOR metaIfItem=ifSql[null] {metaAndOr.addElement($metaIfItem.metaIfItem);})* {metaStatement.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {if(!_scopeSkip) metaIf.setExpression($metaLogExpr.metaLogExpr);}
		BOR metaIfItem=ifSql[null] {if(!_scopeSkip) metaIf.addElement($metaIfItem.metaIfItem);}
		(BOR metaIfItem=ifSql[null] {if(!_scopeSkip) metaIf.addElement($metaIfItem.metaIfItem);})*
		 {metaStatement.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem.metaIfItem);}
		(BOR metaIfItem=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem.metaIfItem);})* {if(!_scopeSkip) metaStatement.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem.metaIfItem);}
		(BOR metaIfItem=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem.metaIfItem);})* {if(!_scopeSkip) metaStatement.addElement(metaAndOr);}
	| EQUALS WS* fragmentType=IDENT {sqlFragment = new SqlMetaSqlFragment($fragmentType.getText());} metaIfItem=ifSql[null] {if(!_scopeSkip) sqlFragment.addElement($metaIfItem.metaIfItem);}
		{if(!_scopeSkip) metaStatement.addElement(sqlFragment);}
	| HASH orderId=(NUMBER | IDENT) {metaOrd = new SqlMetaOrd($orderId.text);} ordSql[metaOrd] {if(!_scopeSkip) metaStatement.addElement(metaOrd);}
	;

ifSql [SqlMetaIfItem metaIfItemIn] returns[SqlMetaIfItem metaIfItem]
@init {$metaIfItem = (metaIfItemIn !=null) ? metaIfItemIn : newSqlMetaIfItem();}
	:
	(ifSqlFragment[$metaIfItem])+
	;

ifSqlFragment [SqlMetaIfItem metaIfItem]
@after {if(!_scopeSkip) addText(metaIfItem, _scopeText);}
	:
	~(COLON | STRING | AT | PERCENT | LBRACE | BOR | RBRACE)
		{if(!_scopeSkip) add(_scopeText);}
	| COLON ident=identifier
		{if(!_scopeSkip) addIdent(metaIfItem, $ident.result, _scopeText);}
	| STRING cnst=constant
		{if(!_scopeSkip) addConstant(metaIfItem, $cnst.result, _scopeText);}
	| COLON COLON identOper=identifierOperator
		{if(!_scopeSkip) addOperator(metaIfItem, $identOper.result, _scopeText);}
	| STRING STRING cnstOper=constantOperator
		{if(!_scopeSkip) addOperator(metaIfItem, $cnstOper.result, _scopeText);}
   	| AT col=column
   		{if(!_scopeSkip) addColumn(metaIfItem, $col.result, _scopeText); _scopeHasOutputMapping=true;}
	| PERCENT (PERCENT dbtab=dbtable {if(!_scopeSkip) addDatabaseTable(metaIfItem, $dbtab.result, _scopeText);}
	            | dbcol=dbcolumn {if(!_scopeSkip) addDatabaseColumn(metaIfItem, $dbcol.result, _scopeText);})
	| LBRACE ifMetaSql[metaIfItem] RBRACE
	;


ifMetaSql [SqlMetaIfItem metaIfItem]
@init {SqlMetaAndOr metaAndOr; SqlMetaIf metaIf; if(!_scopeSkip) addText(metaIfItem, _scopeText);}
	:
	~(QUESTI | BAND | BOR | LBRACE | RBRACE)
		{if(!_scopeSkip) add(_scopeText); metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.NO);} metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);}
		(BOR metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);})* {if(!_scopeSkip) metaIfItem.addElement(metaAndOr);}
	| QUESTI {metaIf = new SqlMetaIf(); } metaLogExpr=ifSqlCond {if(!_scopeSkip) metaIf.setExpression($metaLogExpr.metaLogExpr);}
		BOR metaIfItem2=ifSql[null] {if(!_scopeSkip) metaIf.addElement($metaIfItem2.metaIfItem);}
		(BOR metaIfItem2=ifSql[null] {if(!_scopeSkip) metaIf.addElement($metaIfItem2.metaIfItem);})*
		 {if(!_scopeSkip) metaIfItem.addElement(metaIf);}
	| BAND {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.AND);} metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);}
		(BOR metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);})* {if(!_scopeSkip) metaIfItem.addElement(metaAndOr);}
	| BOR {metaAndOr = new SqlMetaAndOr(SqlMetaAndOr.Type.OR);} metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);}
		(BOR metaIfItem2=ifSql[null] {if(!_scopeSkip) metaAndOr.addElement($metaIfItem2.metaIfItem);})* {if(!_scopeSkip) metaIfItem.addElement(metaAndOr);}
	;

ifSqlCond returns[SqlMetaLogExpr metaLogExpr]
@init {$metaLogExpr = new SqlMetaLogExpr();}
	:
	WS* ifSqlBool[$metaLogExpr] WS* ((AND {if(!_scopeSkip) addOperator($metaLogExpr,true);} | OR {if(!_scopeSkip) addOperator($metaLogExpr,false);}) WS*
		ifSqlBool[$metaLogExpr] WS*)*
	;

ifSqlBool [SqlMetaLogExpr metaLogExpr]
	:
	not=NOT? COLON ident=identifier {if(!_scopeSkip) {$ident.result.setNot($not!=null); addIdent($metaLogExpr, $ident.result, _scopeText);}}
	| not=NOT? STRING cnst=constant {if(!_scopeSkip) {$cnst.result.setNot($not!=null); addConstant($metaLogExpr, $cnst.result, _scopeText);}}
	| not=NOT? LPAREN newMetaLogExpr=ifSqlCond RPAREN {if(!_scopeSkip) $metaLogExpr.addElement($newMetaLogExpr.metaLogExpr);}
	;

ordSql [SqlMetaOrd ord]
@after {if(!_scopeSkip) addText(ord, _scopeText);}
 	:
 	(ordSqlFragment[ord])+
	;

ordSqlFragment [SqlMetaOrd ord]
@after {if(!_scopeSkip) addText(ord, _scopeText);}
 	:
	~(COLON | STRING | PERCENT | RBRACE)
		{if(!_scopeSkip) add(_scopeText);}
	| COLON ident=identifier
		{if(!_scopeSkip) addIdent(ord, $ident.result, _scopeText);}
	| STRING cnst=constant
		{if(!_scopeSkip) addConstant(ord, $cnst.result, _scopeText);}
	| PERCENT dbcol=dbcolumn
		{if(!_scopeSkip) addDatabaseColumn(ord, $dbcol.result, _scopeText);}
	;

column returns [SqlMappingItem result]
@init {$result = null; String sname; Map<String, List<String>> modifiers = new HashMap<String, List<String>>(); }
@after {if(!_scopeSkip) $result = newColumn(sname); if(!_scopeSkip) for (String n : modifiers.keySet()) for (String m : modifiers.get(n)) addModifier(_scopeTypeFactory, $result, m, n); }
	:
	(name=IDENT_DOT | name=IDENT | name=NUMBER) {sname = $name.text; }
	(LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	 (COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	 )* RPAREN
	)?
	(
 	 (name=IDENT_DOT | name=IDENT | name=NUMBER) {sname = sname + "." + $name.text; }
	 (LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	  (COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	  )* RPAREN
	 )?
	)*
	;

constant returns [SqlMetaConst result]
@init {$result = null;}
	:
	(caseCnst=PLUS | caseCnst=MINUS)? (cnst=IDENT_DOT | cnst=IDENT) {if(!_scopeSkip) $result = newConstant($cnst, $caseCnst);}
	(LPAREN not=NOT? (value=IDENT | value=NUMBER) { if(!_scopeSkip) addModifier(_scopeTypeFactory, $result, $value.text, $not); }
	 (COMMA not=NOT? (value=IDENT | value=NUMBER) { if(!_scopeSkip) addModifier(_scopeTypeFactory, $result, $value.text, $not); }
	 )* RPAREN
	)?
	;

identifier returns [SqlMetaIdent result]
@init {$result = null;}
	:
	(modeIdent=EQUALS | modeIdent=LESS_THAN | modeIdent=MORE_THAN)? (caseIdent=PLUS | caseIdent=MINUS)? (ident=IDENT_DOT | ident=IDENT | ident=NUMBER) {if(!_scopeSkip) $result = newIdent($ident, $modeIdent, $caseIdent);}
	(LPAREN not=NOT? (value=IDENT | value=NUMBER) { if(!_scopeSkip) addModifier(_scopeTypeFactory, $result, $value.text, $not); }
	 (COMMA not=NOT? (value=IDENT | value=NUMBER) { if(!_scopeSkip) addModifier(_scopeTypeFactory, $result, $value.text, $not); }
	 )* RPAREN
	)?
	;

constantOperator returns [SqlMetaOperator result]
@init {$result = null;}
                      :
                       (ident = IDENT | ident = EQUALS) {if(!_scopeSkip) $result = newConstOperator($ident);}
                      ;

identifierOperator returns [SqlMetaOperator result]
@init {$result = null;}
                      :
                       (ident = IDENT | ident = EQUALS) {if(!_scopeSkip) $result = newIdentOperator($ident);}
                      ;

dbcolumn returns[SqlDatabaseColumn result]
@init {$result = null;}
	:
	(dbcol=IDENT_DOT | dbcol=IDENT) {if(!_scopeSkip) $result = newDatabaseColumn($dbcol);}
	;

dbtable returns[SqlDatabaseTable result]
@init {$result = null;}
	:
	(dbtab=IDENT_DOT | dbtab=IDENT) {if(!_scopeSkip) $result = newDatabaseTable($dbtab);}
	;


mapping [String name, SqlTypeFactory _typeFactory, boolean _skip] returns [SqlMappingRule sqlMapping]
@init {artifactName.push(name); $sqlMapping = new SqlMappingRule(); _scopeTypeFactory=_typeFactory; _scopeSkip=_skip;}
@after { artifactName.pop();}
:
(
  WS*
  sqlMappingItem=mappingItem {if(!_scopeSkip) $sqlMapping.addMapping($sqlMappingItem.result);}
  (WS+ sqlMappingItem=mappingItem {if(!_scopeSkip) $sqlMapping.addMapping($sqlMappingItem.result);})*
  WS*  EOF?
)
;

mappingItem returns[SqlMappingItem result]
@init {String sname; Map<String, List<String>> modifiers = new HashMap<String, List<String>>(); }
@after {if(!_scopeSkip) for (String n : modifiers.keySet()) for (String m : modifiers.get(n)) addModifier(_scopeTypeFactory, $result, m, n); }
	:
	(col=IDENT | col=NUMBER) {if(!_scopeSkip) $result = newColumn($col.text); }
    (STRING (name=IDENT_DOT | name=IDENT | name=NUMBER) { if(!_scopeSkip) addColumnAttr($result, $name); sname = $name.text; }
	 (LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	  (COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	  )* RPAREN
	 )*
     ((name=IDENT_DOT | name=IDENT | name=NUMBER) { if(!_scopeSkip) addColumnAttr($result, $name); sname = sname + "." + $name.text; }
	  (LPAREN (value=IDENT | value=NUMBER) { modifiers.put(sname, new ArrayList<String>()); modifiers.get(sname).add($value.text); }
	   (COMMA (value=IDENT | value=NUMBER) { modifiers.get(sname).add($value.text); }
	   )* RPAREN
	  )*
  	 )*
  	)?
	;

option [String name] returns [StringBuilder text]
@init {artifactName.push(name); $text = new StringBuilder();}
@after { artifactName.pop();}
	: (~(SEMICOLON) {add($text);})+
	;


STATEMENT: 'QRY'|'CRUD'|'CALL';
MAPPING: 'OUT';
OPTION: 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' | 'MOPT';

IDENT_DOT: IDENT ('.' IDENT)+;
IDENT: [a-zA-Z] [a-zA-Z0-9_=]*;
NUMBER: DIGIT+;
fragment
DIGIT: [0-9];
ML_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
SL_COMMENT : '//' ~[\n\r]* ('\r'? '\n')? -> channel(HIDDEN) ;
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
REST:     ~[:;$,\-+(){}?!&|#@^=<>%];
