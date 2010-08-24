lexer grammar InternalArithmetics;
@header {
package org.eclipse.xtext.example.arithmetics.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : ';' ;
T13 : '+' ;
T14 : '-' ;
T15 : '*' ;
T16 : '/' ;
T17 : '(' ;
T18 : ')' ;

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 429
RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 431
RULE_INT : 'this one has been deactivated';

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 433
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 435
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 437
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 439
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 441
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.example.arithmetics/src-gen/org/eclipse/xtext/example/arithmetics/parser/antlr/internal/InternalArithmetics.g" 443
RULE_ANY_OTHER : .;


