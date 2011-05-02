grammar SqlMapping;

//options{backtrack=true; memoize=true;}

@lexer::header { 
package org.sqlproc.engine.impl;
}

@header { 
package org.sqlproc.engine.impl;

import java.util.Map;
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
    errors.add(ParserUtils.create(msg,e,tokenNames));
    return msg;
  }
}

@members {
  private Token getLastToken() {
    return input.LT(-1);
  }


  private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
  public List<ErrorMsg> getErrors() {
    return errors;
  }

  @Override
  public void reportError(RecognitionException e) {
    String msg = super.getErrorMessage(e,tokenNames);
    errors.add(ParserUtils.create(msg,e,tokenNames));
  }

  void setMetaType(SqlTypeFactory typeFactory, SqlMappingItem item, String sMetaType) {
    item.setMetaType(typeFactory.getMetaType(sMetaType));
  }
}

parse [SqlTypeFactory _typeFactory] returns [SqlMappingRule sqlMapping]
scope {SqlTypeFactory typeFactory;}
@init {$sqlMapping = new SqlMappingRule();$parse::typeFactory=_typeFactory;}
:
(
  WS*
  sqlMappingItem=mapping {$sqlMapping.addMapping(sqlMappingItem);}
  (WS+ sqlMappingItem=mapping {$sqlMapping.addMapping(sqlMappingItem);})*
  WS* EOF 
)
;

mapping returns[SqlMappingItem item]
@init{ SqlMappingAttribute attr; }
:
  (
   col=(IDENT | NUMBER) { $item = new SqlMappingItem($col.text); }
   (STRING
    (type=IDENT { setMetaType($parse::typeFactory, $item, $type.text); })?
    (STRING
     col=IDENT { attr = $item.addAttributeName($col.text); }
     mappingValues[attr]
     (
      DOT col=IDENT { attr = $item.addAttributeName($col.text); }
      mappingValues[attr]
     )*
    )?
   )?
  )
;

mappingValues [SqlMappingAttribute attr]
:
      (options {greedy=true;} : CARET (value=IDENT (options {greedy=true;} :EQUALS value2=IDENT)? | value=NUMBER) { $attr.setValues($value.text, $value2.text); })*
;

IDENT:    ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '=' )*;
NUMBER: DIGIT+;
fragment
DIGIT:    ('0'..'9');
WS:       (' ' | '\t')+;
DOT:      '.';
STRING:   '$' ;
CARET:    '^';
EQUALS:   '=' ;

