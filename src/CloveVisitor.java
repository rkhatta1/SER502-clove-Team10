import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class CloveVisitor extends CloveGrammarBaseVisitor {

    public StringBuilder errors = new StringBuilder();
    static HashMap<String, HashMap<String, String>> environment = new HashMap<>();

    @Override
    public Object visitProgram(CloveGrammarParser.ProgramContext ctx) {
        HashMap<String, String> stringVars = new HashMap<>();
        HashMap<String, String> integerVars = new HashMap<>();
        HashMap<String, String> booleanVars = new HashMap<>();
        environment.put("Strings", stringVars);
        environment.put("Integers", integerVars);
        environment.put("Booleans", booleanVars);
        return visitChildren(ctx);
    }

    @Override
    public Object visitStatement(CloveGrammarParser.StatementContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Object visitIntDeclarationStatement(CloveGrammarParser.IntDeclarationStatementContext ctx) {

        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(ctx.ID().getText())) {
                errors.append("ERROR: Variable '").append(ctx.ID().getText()).append("' already initialized for ")
                        .append(dataTypes).append(" \n");
                System.out.println(errors);
                System.exit(0);
            }
        }

        if (environment.get("Integers").containsKey(ctx.ID().getText())) {
            // throw new RuntimeException("Variable already initialized :" +
            // ctx.ID().getText());
            System.out.println("Variable already there");
            errors.append("ERROR: Variable '").append(ctx.ID().getText())
                    .append("' already initialized for the integer\n");
            System.exit(0);
        } else {
            environment.get("Integers").put(ctx.ID().getText(), ctx.NUM().getText());
        }

        return 0;
    }

    @Override
    public Object visitStringDeclarationStatement(CloveGrammarParser.StringDeclarationStatementContext ctx) {

        String str = ctx.Str().getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        // Check if the variable is already inside any HashMap
        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(ctx.ID().getText())) {
                errors.append("ERROR: Variable '").append(ctx.ID().getText()).append("' already initialized for ")
                        .append(dataTypes).append(" \n");
                System.out.println(errors);
                System.exit(0);
            }
        }

        if (environment.get("Strings").containsKey(ctx.ID().getText())) {
            System.out.println("Variable already there");
            errors.append("ERROR: Variable '").append(ctx.ID().getText())
                    .append("' already initialized for the string\n");
            System.exit(0);
        } else {
            environment.get("Strings").put(ctx.ID().getText(), str);
        }

        return 0;
    }

    @Override
    public Object visitBoolDeclarationStatement(CloveGrammarParser.BoolDeclarationStatementContext ctx) {
        boolean bl = (boolean) visit(ctx.condition());
        String str;

        if (bl) {
            str = "true";
        } else {
            str = "false";
        }

        // Check if the variable is already inside any HashMap
        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(ctx.ID().getText())) {
                errors.append("ERROR: Variable '").append(ctx.ID().getText()).append("' already initialized for ")
                        .append(dataTypes).append(" \n");
                System.out.println(errors);
                System.exit(0);
            }
        }

        if (environment.get("Booleans").containsKey(ctx.ID().getText())) {
            System.out.println("Variable already there");
            errors.append("ERROR: Variable '").append(ctx.ID().getText())
                    .append("' already initialized for the boolean\n");
            System.exit(0);
        } else {
            environment.get("Booleans").put(ctx.ID().getText(), str);
        }

        return 0;
    }

    @Override
    public Object visitDeclarationStatement(CloveGrammarParser.DeclarationStatementContext ctx) {
        String dataType = ctx.dtype.getText();
        String id = ctx.ID().getText();

        // Check if the variable is already inside any HashMap
        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(ctx.ID().getText())) {
                errors.append("ERROR: Variable '").append(ctx.ID().getText())
                        .append("' already initialized/declared for ").append(dataTypes).append(" \n");
                System.out.println(errors);
                System.exit(0);
            }
        }

        // If the data type is String then add the variable into the enviroment

        switch (dataType) {
            case "Str":
                if (environment.get("Strings").containsKey(id)) {
                    System.out.println("Variable already declared");
                    errors.append("ERROR: Variable '").append(id).append("' already declared for the string\n");
                    System.exit(0);
                } else {
                    environment.get("Strings").put(id, null);
                }
                break;

            case "int":

                if (environment.get("Integers").containsKey(id)) {
                    System.out.println("Variable already declared");
                    errors.append("ERROR: Variable '").append(id).append("' already declared for the Integers\n");
                    System.exit(0);
                } else {
                    environment.get("Integers").put(id, null);
                }
                break;

            case "bool":

                if (environment.get("Booleans").containsKey(id)) {
                    System.out.println("Variable already declared");
                    errors.append("ERROR: Variable '").append(id).append("' already declared for the Booleans\n");
                    System.exit(0);
                } else {
                    environment.get("Integers").put(id, null);
                }
                break;
        }

        return 0;
    }

    @Override
    public Object visitIntInitialization(CloveGrammarParser.IntInitializationContext ctx) {

        String id = ctx.ID(0).getText();

        String val = "";
        String id2 = ctx.ID(1).getText();

        boolean variableFound = false;
        String varDataType = "";

        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(id2)) {
                val = innerMap.get(id2);
                variableFound = true;
                varDataType = dataTypes;
            }
        }
        if (!variableFound) {
            errors.append("HERE ERROR: Variable '").append(ctx.ID(1).getText())
                    .append("' not found in the environment \n");
            System.out.println(errors);
            System.exit(0);
        } else {
            environment.get(varDataType).put(id, val);
        }

        return 0;
    }

    @Override
    public Object visitStringInitialization(CloveGrammarParser.StringInitializationContext ctx) {

        String id = ctx.ID(0).getText();
        String val = "";
        String id2 = ctx.ID(1).getText();
        boolean variableFound = false;
        String varDataType = "";

        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(id2)) {
                val = innerMap.get(id2);
                variableFound = true;
                varDataType = dataTypes;
            }
        }
        if (!variableFound) {
            errors.append(" HERE 2 ERROR: Variable '").append(ctx.ID(1)).append("' not found in the environment \n");
            System.out.println(errors);
            System.exit(0);
        } else {
            environment.get(varDataType).put(id, val);
        }

        return 0;
    }

    @Override
    public Object visitBoolInitialization(CloveGrammarParser.BoolInitializationContext ctx) {
        String id = ctx.ID(0).getText();

        String val = "";
        String id2 = ctx.ID(1).getText();
        boolean variableFound = false;
        String varDataType = "";

        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(id2)) {
                val = innerMap.get(id2);
                variableFound = true;
                varDataType = dataTypes;
            }
        }
        if (!variableFound) {
            errors.append("HERE 3 ERROR: Variable '").append(ctx.ID(1)).append("' not found in the environment \n");
            System.out.println(errors);
            System.exit(0);
        } else {
            environment.get(varDataType).put(id, val);
        }
        return 0;
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