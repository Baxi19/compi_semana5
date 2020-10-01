//--------------------------------------------------------------
lexer grammar Scanner;

//--------------------------------------------------------------
// Symbols
PyCOMMA     : ';' ;
TWO_P       : ':' ;
L_PARENT    : '(' ;
R_PARENT    : ')' ;
VIR         : '~' ;  //para asignacion de const

//--------------------------------------------------------------
//Operators
ASSING      : ':=' ;
SUM         : '+' ;
SUB         : '-' ;
MUL         : '*' ;
DIV         : '/' ;

//Added
NOT_EQUAL   : '/=' ;
GT          : '>';
LT          : '<';
LE          : '<=';
GE          : '>=';
EQUAL       : '==';

//--------------------------------------------------------------
//Reserved Keywords
IF          : 'if' ;
THEN        : 'then' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
DO          : 'do' ;
LET         : 'let' ;
IN          : 'in' ;
BEGIN       : 'begin' ;
END         : 'end' ;
CONST       : 'const' ;
VAR         : 'var' ;

//--------------------------------------------------------------
//Others Regular expressions
INTEGER: [1-9][0-9]* | ZERO;

fragment ZERO
    : [0]
    ;

fragment DIGIT
    : [0-9]
    ;

//--------------------------------------------------------------
// Letter
IDENT : LETTER(LETTER|DIGIT)*;


// fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment LETTER
    : [a-z]
    ;

// fragment DIGIT : '0'..'9';
LITERAL
    : DIGIT DIGIT*
    ;

//--------------------------------------------------------------
// skiped words

WS              : [ \r\t\n]+                -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/'             -> skip;
COMMENT    : '//' ~[\r\n]* '\r'? '\n'       -> skip ;




