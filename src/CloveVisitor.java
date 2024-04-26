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
            return 0;
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
            return 0;
        }

        String currentValue = dataTypeEnvironment.get(id);
        int newValue = Integer.parseInt(currentValue) - 1;
        dataTypeEnvironment.put(id, Integer.toString(newValue));
        return 0;
    }

    @Override
    public Object visitTernaryOperatorAssignment(CloveGrammarParser.TernaryOperatorAssignmentContext ctx) {
        String id = ctx.ID().getText();
        String resultExpression = visit(ctx.ternaryOperator()).toString();
        boolean dataUpdated = false;

        for (HashMap<String, String> dataTypeEnvironment : environment.values()) {
            if (dataTypeEnvironment.containsKey(id)) {
                dataTypeEnvironment.put(id, resultExpression);
                dataUpdated = true;
                break;
            }
        }

        if (!dataUpdated) {
            errors.append(String.format("ERROR: Variable '%s' not found in the environment\n", id));
            System.out.println(errors);
            return 0;
        }
        return 0;
    }


    @Override
    public Object visitPrintFunctionIdentifier(CloveGrammarParser.PrintFunctionIdentifierContext ctx) {
        String id = ctx.ID().getText();
        String val = "";

        for (HashMap<String, String> dataTypeEnvironment : environment.values()) {
            if (dataTypeEnvironment.containsKey(id)) {
                val = dataTypeEnvironment.get(id);
                System.out.println("PRINTED VALUE: " + val);
                return val;
            }
        }

        errors.append(String.format("ERROR: Variable '%s' not found in the environment for the print statement\n", id));
        System.out.println(errors);
        return null;
    }

    @Override
    public Object visitPrintFunctionExpression(CloveGrammarParser.PrintFunctionExpressionContext ctx) {
        String resExpr = visit(ctx.expr()).toString();

        System.out.println("PRINTED: " + resExpr);

        return resExpr;
    }

    @Override
    public Object visitNotCondition(CloveGrammarParser.NotConditionContext ctx) {
        boolean result = (boolean) visit(ctx.condition());
        return !result;
    }

    @Override
    public Object visitConditionRelExpr(CloveGrammarParser.ConditionRelExprContext ctx) {
        return visit(ctx.relational_expr());
    }

    @Override
    public Object visitBooleanIdOperation(CloveGrammarParser.BooleanIdOperationContext ctx) {
        String id1 = ctx.ID(0).getText();
        String id2 = ctx.ID(1).getText();

        HashMap<String, String> booleanEnvironment = environment.get("Booleans");
        if (booleanEnvironment == null) {
            System.out.println("Environment does not contain boolean variables");
            System.exit(0);
        }

        String val1 = booleanEnvironment.getOrDefault(id1, null);
        String val2 = booleanEnvironment.getOrDefault(id2, null);

        if (val1 == null || val2 == null) {
            System.out.println("Variable not initialized for boolean operation");
            errors.append("ERROR: One or both variables not initialized for the boolean operation\n");
            System.exit(0);
        }

        Boolean b1 = Boolean.valueOf(val1);
        Boolean b2 = Boolean.valueOf(val2);

        return switch (ctx.booleanOp.getType()) {
            case CloveGrammarParser.AND -> b1 && b2;
            case CloveGrammarParser.OR -> b1 || b2;
            case CloveGrammarParser.NOT -> b1 != b2;
            default -> throw new IllegalStateException("Unknown operator " + ctx.booleanOp);
        };
    }

    @Override
    public Object visitBooleanCondition(CloveGrammarParser.BooleanConditionContext ctx) {
        boolean flag = true;

        if (ctx.getText().equals("true")) {
            flag = true;
        } else if (ctx.getText().equals("false")) {
            flag = false;
        } else {
            errors.append("ERROR: Not valid entry for boolean!\n");
            System.out.println(errors);
            System.exit(0);
        }

        return flag;
    }

    @Override
    public Object visitConditionConnector(CloveGrammarParser.ConditionConnectorContext ctx) {
        if (ctx.getChildCount() == 3) {

            boolean leftResult = (boolean) visit(ctx.condition(0));
            boolean rightResult = (boolean) visit(ctx.condition(1));

            if (ctx.booleanOp.getText().equals("and")) {
                return leftResult && rightResult;
            } else if (ctx.booleanOp.getText().equals("or")) {
                return leftResult || rightResult;
            }

        } else {
            return visit(ctx);
        }

        return visit(ctx);
    }

    @Override
    public Object visitNotIDBoolean(CloveGrammarParser.NotIDBooleanContext ctx) {
        String id = ctx.ID().getText();
        boolean result = true;

        if (!environment.get("Booleans").containsKey(id)) {
            System.out.println("Variable already there");
            errors.append("ERROR: Variable '").append(id).append("' already initialized for the boolean\n");
            System.exit(0);
        } else {
            String value = environment.get("Booleans").get(id);
            result = Boolean.parseBoolean(value);
        }

        return !result;
    }

    @Override
    public Object visitParenthesesRelExpr(CloveGrammarParser.ParenthesesRelExprContext ctx) {
        return visit(ctx.relational_expr());
    }

    @Override
    public Object visitRelExpr(CloveGrammarParser.RelExprContext ctx) {

        if (ctx.getChildCount() == 3) {

            int leftVal = (int) visit(ctx.expr(0));
            int rightVal = (int) visit(ctx.expr(1));

            return switch (ctx.relationalOp.getType()) {
                case CloveGrammarParser.EQUAL -> leftVal == rightVal;
                case CloveGrammarParser.NOTEQUAL -> leftVal != rightVal;
                case CloveGrammarParser.GREATERT -> leftVal > rightVal;
                case CloveGrammarParser.LESST -> leftVal < rightVal;
                case CloveGrammarParser.GREATERTEQUAL -> leftVal >= rightVal;
                case CloveGrammarParser.LESSTEQUAL -> leftVal <= rightVal;
                default -> throw new IllegalStateException("Unknown operator " + ctx.relationalOp);
            };
        } else {
            return 0;
        }
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