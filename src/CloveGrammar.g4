grammar CloveGrammar;

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
relational_expr : '(' relational_expr ')'                   # parenthesesRelExpr
                | expr relationalOp=(EQUAL|NOTEQUAL|LESST|GREATERT|LESSTEQUAL|GREATERTEQUAL) expr     # relExpr
                ;

// Define token literals for arithmetic operators
MOD     : '%';
DIVIDE     : '/';
MULTIPLY    : '*';
ADD     : '+';
SUBTRACT     : '-' ;

// Define conditions used in control flow constructs
condition : '(' condition ')'                                # conditionWithParentheses
          | NOT condition                                    # notCondition
          | condition booleanOp=(AND|OR) condition           # conditionConnector
          | relational_expr                                  # conditionRelExpr
          | ID booleanOp=(AND|OR|NOT) ID                     # booleanIdOperation
          | NOT ID                                           # notIDBoolean
          | bool                                             # booleanCondition
          ;

// Define various types of declaration statements
declarativeStatement : 'int' ID '=' NUM                      # intDeclarationStatement
                     | 'Str' ID '=' Str                      # stringDeclarationStatement
                     | 'bool' ID '=' condition               # boolDeclarationStatement
                     | dtype=('int'|'Str'| 'bool') ID        # declarationStatement
                     ;

// Define various types of assignment statements
assignmentStatement : ID '=' expr                           # assignmentOperatorStatement
                    | ID '+' '+'                            # incrementOperation
                    | ID '-' '-'                            # decrementOperation
                    | ID '=' ternaryOperator                # ternaryOperatorAssignment
                    ;

// Define various types of ID assignment statements
idAssignmentStatement : 'int' ID '=' ID                      # intInitialization
                      | 'Str' ID '=' ID                      # stringInitialization
                      | 'bool' ID '=' ID                     # boolInitialization
                      ;

// Define various types of print statements
printStatement : 'print' '(' ID ')'                        # printFunctionIdentifier
                | 'print' expr                             # printFunctionExpression
                ;

ifStatements : statement
             ;

elseStatements : statement
                ;

// Define if statements with optional else clauses
conditionStatement : 'if' condition '{' (ifStatements ';')+ '}' ('else' '{' (elseStatements ';')+ '}')*    # ifThenElseCondition
                   ;

// Define while loops
whileStatement : 'while' condition '{' (statement ';')+ '}' # whileCondition
                ;

// Define the ternary operator
ternaryOperator : condition '?' statement ':' statement  # ternaryOperatorOperation
                  ;

// Define traditional for loops
forLoop : 'for' '(' (declarativeStatement | assignmentStatement) ';' relational_expr ';' assignmentStatement ')' '{' (statement ';')+ '}'  # traditionalForLoop
        ;

// Define for each loops
forEachLoop : 'for' ID 'in' 'range' '('NUM ',' NUM ')' '{' (statement ';')+ '}'     #forEachLoopCondition
        ;

// Define token literals for boolean operators
AND     : 'and';
OR      : 'or' ;
NOT     : 'not';

// Define expressions
expr :  '(' expr ')'                                        # parenthesesExpression
     | expr operation=(DIVIDE|MULTIPLY|MOD) expr            # arithmeticExpression
     | expr operation=(ADD|SUBTRACT) expr                   # arithmeticExpression
     | NUM                                                  # numExpression
     | ID                                                   # idExpression
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

// Define whitespace and comment handling rules
WS  : [ \t\r\n]+ -> skip;

COMMENT
 : '$' ~[\r\n]* -> skip
 ;