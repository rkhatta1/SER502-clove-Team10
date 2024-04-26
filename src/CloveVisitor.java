import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class CloveVisitor extends CloveGrammarBaseVisitor {

    public StringBuilder errors = new StringBuilder();
    static HashMap<String, HashMap<String, String>> environment = new HashMap<>();


    @Override
    public Object visitProgram(CloveGrammarParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitStatement(CloveGrammarParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Object visitIntDeclarationStatement(CloveGrammarParser.IntDeclarationStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitStringDeclarationStatement(CloveGrammarParser.StringDeclarationStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitBoolDeclarationStatement(CloveGrammarParser.BoolDeclarationStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclarationStatement(CloveGrammarParser.DeclarationStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitIntInitialization(CloveGrammarParser.IntInitializationContext ctx) {

        return null;
    }

    @Override
    public Object visitStringInitialization(CloveGrammarParser.StringInitializationContext ctx) {
        return null;
    }

    @Override
    public Object visitBoolInitialization(CloveGrammarParser.BoolInitializationContext ctx) {
        return null;
    }

    @Override
    public Object visitAssignmentOperatorStatement(CloveGrammarParser.AssignmentOperatorStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitIncrementOperation(CloveGrammarParser.IncrementOperationContext ctx) {
        return null;
    }

    @Override
    public Object visitDecrementOperation(CloveGrammarParser.DecrementOperationContext ctx) {
        return null;
    }

    @Override
    public Object visitTernaryOperatorAssignment(CloveGrammarParser.TernaryOperatorAssignmentContext ctx) {
        return null;
    }


    @Override
    public Object visitPrintFunctionIdentifier(CloveGrammarParser.PrintFunctionIdentifierContext ctx) {
        return null;
    }

    @Override
    public Object visitPrintFunctionExpression(CloveGrammarParser.PrintFunctionExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitNotCondition(CloveGrammarParser.NotConditionContext ctx) {
        return null;
    }

    @Override
    public Object visitConditionRelExpr(CloveGrammarParser.ConditionRelExprContext ctx) {
        return null;
    }

    @Override
    public Object visitBooleanIdOperation(CloveGrammarParser.BooleanIdOperationContext ctx) {
        return null;
    }

    @Override
    public Object visitBooleanCondition(CloveGrammarParser.BooleanConditionContext ctx) {
        return null;
    }

    @Override
    public Object visitConditionConnector(CloveGrammarParser.ConditionConnectorContext ctx) {
        return null;
    }

    @Override
    public Object visitNotIDBoolean(CloveGrammarParser.NotIDBooleanContext ctx) {
        return null;
    }

    @Override
    public Object visitParenthesesRelExpr(CloveGrammarParser.ParenthesesRelExprContext ctx) {
        return null;
    }

    @Override
    public Object visitRelExpr(CloveGrammarParser.RelExprContext ctx) {
        return null;
    }

    @Override
    public Object visitIdExpression(CloveGrammarParser.IdExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitNumExpression(CloveGrammarParser.NumExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitArithmeticExpression(CloveGrammarParser.ArithmeticExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitParenthesesExpression(CloveGrammarParser.ParenthesesExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitIfThenElseCondition(CloveGrammarParser.IfThenElseConditionContext ctx) {
        int ifStmtCount = ctx.ifStatements().size();
        int elseStmtCount = ctx.elseStatements().size();
        int i, j;

        boolean result = (boolean) visit(ctx.condition());
        if (result) {
            for (i = 0; i < ifStmtCount; i++) {
                visit(ctx.ifStatements(i));
            }
        } else if (ctx.elseStatements(0) != null) {
            for (j = 0; j < elseStmtCount; j++) {
                visit(ctx.elseStatements(j));
            }
        }
        return 0;
    }

    @Override
    public Object visitIfStatements(CloveGrammarParser.IfStatementsContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Object visitElseStatements(CloveGrammarParser.ElseStatementsContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Object visitWhileCondition(CloveGrammarParser.WhileConditionContext ctx) {

        boolean res = (boolean) this.visit(ctx.condition());

        int statementCnt = ctx.statement().size();
        int i;

        while (res) {

            for (i = 0; i < statementCnt; i++) {
                visit(ctx.statement(i));
            }
            res = (boolean) this.visit(ctx.condition());
        }
        return 0;
    }

    @Override
    public Object visitTernaryOperatorOperation(CloveGrammarParser.TernaryOperatorOperationContext ctx) {
        int value = 0;

        boolean conditionStmt = (boolean) this.visit(ctx.condition());
        if (conditionStmt) {
            value = (int) visit(ctx.statement(0));
        }
        if (!conditionStmt) {
            value = (int) visit(ctx.statement(1));
        }

        return value;
    }

    @Override
    public Object visitTraditionalForLoop(CloveGrammarParser.TraditionalForLoopContext ctx) {
        boolean flag = true;
        if (ctx.declarativeStatement() != null) {
            visit(ctx.declarativeStatement());
            flag = false;
        }
        if (flag) {
            visit(ctx.assignmentStatement(0));
        }
        boolean condition = (boolean) visit(ctx.relational_expr());

        int statementCnt = ctx.statement().size();
        int i;

        while (condition) {
            for (i = 0; i < statementCnt; i++) {
                visit(ctx.statement(i));
            }
            if (flag) {
                visit(ctx.assignmentStatement(1));
            } else {
                visit(ctx.assignmentStatement(0));
            }
            condition = (boolean) visit(ctx.relational_expr());
        }
        return 0;
    }

    @Override
    public Object visitForEachLoopCondition(CloveGrammarParser.ForEachLoopConditionContext ctx) {
        String id = ctx.ID().getText();
        String number1 = ctx.NUM(0).getText();
        String number2 = ctx.NUM(1).getText();
        int integerNum1 = Integer.parseInt(number1);
        int integerNum2 = Integer.parseInt(number2);

        if (environment.get("Integers").containsKey(id)) {
            environment.get("Integers").put(id, number1);
        } else {
            errors.append("ERROR: Identifier '").append(ctx.ID().getText()).append("' not found in the for loop syntax!\n");
            System.out.println(errors);
            System.exit(0);
        }

        String newId = environment.get("Integers").get(id);

        int statementCnt = ctx.statement().size();
        int i;

        while (parseInt(newId) < integerNum2) {

            for (i = 0; i < statementCnt; i++) {
                visit(ctx.statement(i));
            }

            integerNum1 = integerNum1 + 1;
            environment.get("Integers").put(id, String.valueOf(integerNum1));
            newId = environment.get("Integers").get(id);
        }


        return 0;
    }

    @Override
    public Object visitConditionWithParentheses(CloveGrammarParser.ConditionWithParenthesesContext ctx) {
        return visit(ctx.condition());
    }
}