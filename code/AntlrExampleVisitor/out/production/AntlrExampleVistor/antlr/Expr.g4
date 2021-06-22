grammar Expr;

/* the grammar name and the file name must match */

@header {
    package antlr;
}

// production rules
prog: (decl | expr)+ EOF          # Program
    ;
decl: ID ':' INT_TYPE '=' NUM     # Declaration
    ;

expr: expr '*' expr               # Multiplication
    | expr '+' expr               # Addition
    | ID                          # Variable
    | NUM                         # Number
    ;

// Tokens
ID : [a-z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;
WS : [\t\n]+ -> skip;
NEWLINE : ('\r'? '\n' | '\r')+ -> skip;
