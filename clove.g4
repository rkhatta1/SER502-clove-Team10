grammar clove;

program: statement* EOF;

statement: assignment
         | if_statement
         | for_loop
         | while_loop
         | print_statement;

assignment: variable '=' expression;

if_statement: 'if' expression 'then' statement 'else' statement;

for_loop: 'for' variable 'in' 'range' '(' expression ',' expression ')' statement;

while_loop: 'while' expression statement;

print_statement: 'print' '(' expression ')';

expression: boolean_expression;

boolean_expression: boolean_term ('&&' boolean_term)*;

boolean_term: comparison ('||' comparison)*;

comparison: additive_expr ('==' | '!=' | '>' | '<') additive_expr;

additive_expr: multiplicative_expr ('+' multiplicative_expr | '-' multiplicative_expr)*;

multiplicative_expr: factor ('*' factor | '/' factor)*;

factor: '(' expression ')'
     | variable
     | number;

variable: IDENTIFIER;

number: INTEGER | FLOAT;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

INTEGER: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]+;

WS: [ \t\r\n]+ -> skip;
