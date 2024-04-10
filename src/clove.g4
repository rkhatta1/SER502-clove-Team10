grammar clove;

// Define start rule for the grammar
program : (statement';')+;

// Define various types of statements
statement : expr                                            // Expression statement
          | relational_expr                                  // Relational expression statement
          | condition                                        // Condition statement
          | declarativeStatement                             // Declaration statement
          | assignmentStatement                              // Assignment statement
          | idAssignmentStatement                            // ID assignment statement
          | printStatement                                   // Print statement
          | conditionStatement                               // Condition statement
          | whileStatement                                   // While loop statement
          | ternaryOperator                                  // Ternary operator statement
          | forLoop                                          // For loop statement
          | forEachLoop                                      // For each loop statement
          ;

// Define token literals for relational operators
EQUAL      : '==' ;
NOTEQUAL   : '!=' ;
LESST      : '<'  ;
GREATERT      : '>'  ;
LESSTEQUAL     : '<=' ;
GREATERTEQUAL     : '>=' ;

// Define relational expressions
relational_expr : '(' relational_expr ')'                   // Parenthesized relational expression
                | expr relationalOp=(EQUAL|NOTEQUAL|LESST|GREATERT|LESSTEQUAL|GREATERTEQUAL) expr     // Relational expression
                ;

// Define token literals for boolean operators
AND     : 'and';
OR      : 'or' ;
NOT     : 'not';

// Define conditions used in control flow constructs
condition : '(' condition ')'                                // Parenthesized condition
          | NOT condition                                    // Negation of condition
          | condition booleanOp=(AND|OR) condition           // Condition with logical AND or OR
          | relational_expr                                  // Relational expression as condition
          | ID booleanOp=(AND|OR|NOT) ID                     // Condition comparing IDs with boolean operators
          | NOT ID                                           // Negation of ID
          | bool                                             // Boolean literal as condition
          ;

// Define various types of declaration statements
declarativeStatement : 'int' ID '=' NUM                      // Integer initialization statement
                     | 'Str' ID '=' Str                      // String initialization statement
                     | 'bool' ID '=' condition               // Boolean initialization statement
                     | dtype=('int'|'Str'| 'bool') ID        // Declaration statement
                     ;

// Define various types of assignment statements
assignmentStatement : ID '=' expr                           // Assignment statement
                    | ID '+' '+'                            // Increment operation
                    | ID '-' '-'                            // Decrement operation
                    | ID '=' ternaryOperator                // Ternary assignment
                    ;

// Define various types of ID assignment statements
idAssignmentStatement : 'int' ID '=' ID                      // Integer ID initialization
                      | 'Str' ID '=' ID                     // String ID initialization
                      | 'bool' ID '=' ID                   // Boolean ID initialization
                      ;

// Define while loops
whileStatement : 'while' condition '{' (statement ';')+ '}' ;

// Define the ternary operator
ternaryOperator : condition '?' statement ':' statement ;

// Define traditional for loops
forLoop : 'for' '(' (declarativeStatement | assignmentStatement) ';' relational_expr ';' assignmentStatement ')' '{' (statement ';')+ '}' ;

// Define for each loops
forEachLoop : 'for' ID 'in' 'range' '('NUM ',' NUM ')' '{' (statement ';')+ '}';


// Define token literals for arithmetic operators
MOD     : '%';
DIVIDE     : '/';
MULTIPLY    : '*';
ADD     : '+';
SUBTRACT     : '-' ;

// Define expressions
expr :  '(' expr ')'                                        // Parenthesized expression
     | expr operation=(DIVIDE|MULTIPLY|MOD) expr            // Arithmetic expression
     | expr operation=(ADD|SUBTRACT) expr                   // Arithmetic expression
     | NUM                                                  // Number expression
     | ID                                                   // Identifier expression
     ;

// Define boolean literals
bool : 'true'
     | 'false'
     ;

// Define identifiers and numbers
ID : [a-z][a-zA-Z0-9_]*
    ;

NUM : '0'
    | '-'?[1-9][0-9]*
    ;

Str    : '"' ~('"')+ '"'
          ;