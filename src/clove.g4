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