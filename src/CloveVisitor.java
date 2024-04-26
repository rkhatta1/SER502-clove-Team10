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

        String id = ctx.ID().getText();
        String expr = visit(ctx.expr()).toString();
        boolean modified = false;

        // Check if the variable exists in any data type environment
        for (HashMap<String, String> dataTypeEnvironment : environment.values()) {
            if (dataTypeEnvironment.containsKey(id)) {
                dataTypeEnvironment.put(id, expr);
                modified = true;
                break;
            }
        }

        if (!modified) {
            errors.append(String.format("ERROR: Variable '%s' not found in the environment \n", id));
            System.out.println(errors);
            System.exit(0);
        }

        return 0;
    }

    @Override
    public Object visitIncrementOperation(CloveGrammarParser.IncrementOperationContext ctx) {
        String id = ctx.ID().getText();
        HashMap<String, String> dataTypeEnvironment = environment.get("Integers");

        if (dataTypeEnvironment == null || !dataTypeEnvironment.containsKey(id)) {
            String errorMessage;
            if (dataTypeEnvironment == null) {
                errorMessage = "not found in the environment";
            } else {
                errorMessage = "not initialized in the environment";
            }
            errors.append(String.format("ERROR: Variable '%s' %s for the increment statement\n", id, errorMessage));
            System.out.println(errors);
            return 0; // No need for System.exit(0)
        }

        String currentValue = dataTypeEnvironment.get(id);
        int newValue = Integer.parseInt(currentValue) + 1;
        dataTypeEnvironment.put(id, Integer.toString(newValue));
        return 0;
    }

    @Override
    public Object visitDecrementOperation(CloveGrammarParser.DecrementOperationContext ctx) {
        String id = ctx.ID().getText();
        HashMap<String, String> dataTypeEnvironment = environment.get("Integers");

        if (dataTypeEnvironment == null || !dataTypeEnvironment.containsKey(id)) {
            String errorMessage;
            if (dataTypeEnvironment == null) {
                errorMessage = "not found in the environment";
            } else {
                errorMessage = "not initialized in the environment";
            }
            errors.append(String.format("ERROR: Variable '%s' %s for the decrement statement\n", id, errorMessage));
            System.out.println(errors);
            return 0; // No need for System.exit(0)
        }

        String currentValue = dataTypeEnvironment.get(id);
        int newValue = Integer.parseInt(currentValue) - 1;
        dataTypeEnvironment.put(id, Integer.toString(newValue));
        return 0;
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
        return null;
    }

    @Override
    public Object visitIfStatements(CloveGrammarParser.IfStatementsContext ctx) {
        return null;
    }

    @Override
    public Object visitElseStatements(CloveGrammarParser.ElseStatementsContext ctx) {
        return null;
    }

    @Override
    public Object visitWhileCondition(CloveGrammarParser.WhileConditionContext ctx) {
        return null;
    }

    @Override
    public Object visitTernaryOperatorOperation(CloveGrammarParser.TernaryOperatorOperationContext ctx) {
        return null;
    }

    @Override
    public Object visitTraditionalForLoop(CloveGrammarParser.TraditionalForLoopContext ctx) {
        return null;
    }

    @Override
    public Object visitForEachLoopCondition(CloveGrammarParser.ForEachLoopConditionContext ctx) {
        return null;
    }

    @Override
    public Object visitConditionWithParentheses(CloveGrammarParser.ConditionWithParenthesesContext ctx) {
        return null;
    }
}