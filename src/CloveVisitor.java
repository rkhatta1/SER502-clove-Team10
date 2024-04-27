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
                    errors.append("ERROR: String Variable '").append(id).append("' already declared for the string\n");
                    System.exit(0);
                } else {
                    environment.get("Strings").put(id, null);
                }
                break;

            case "int":

                if (environment.get("Integers").containsKey(id)) {
                    System.out.println("Variable already declared");
                    errors.append("ERROR: Int Variable '").append(id).append("' already declared for the Integers\n");
                    System.exit(0);
                } else {
                    environment.get("Integers").put(id, null);
                }
                break;

            case "bool":

                if (environment.get("Booleans").containsKey(id)) {
                    System.out.println("Variable already declared");
                    errors.append("ERROR: Boolean Variable '").append(id).append("' already declared for the Booleans\n");
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
            errors.append("ERROR: Int Variable '").append(ctx.ID(1).getText())
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
            errors.append(" ERROR: String Variable '").append(ctx.ID(1)).append("' not found in the environment \n");
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
            errors.append("ERROR: Boolean Variable '").append(ctx.ID(1)).append("' not found in the environment \n");
            System.out.println(errors);
            System.exit(0);
        } else {
            environment.get(varDataType).put(id, val);
        }
        return 0;
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
        int value = 0;
        String id = ctx.ID().getText();
        boolean foundVariable = false;
        boolean initializedVariable = true;

        for (String dataTypes : environment.keySet()) {
            HashMap<String, String> innerMap = environment.get(dataTypes);
            if (innerMap.containsKey(id)) {
                if(innerMap.get(id)!=null) {
                    value = parseInt(innerMap.get(id));
                }else{
                    initializedVariable = false;
                }
                foundVariable = true;
            }
            if (!foundVariable) {
                errors.append("ERROR: Could not find relevant identifier in environment for '").append(ctx.ID().getText()).append("' variable.\n");
                System.out.println(errors);
                System.exit(0);
            } else if (!initializedVariable) {
                errors.append("ERROR: Variable '").append(ctx.ID().getText()).append("' is not initialized in the relevant environment for any operation\n");
                System.out.println(errors);
                System.exit(0);
            } else {
                return value;
            }
        }
        return value;
    }

    @Override
    public Object visitNumExpression(CloveGrammarParser.NumExpressionContext ctx) {
        return parseInt(ctx.NUM().getText());
    }

    @Override
    public Object visitArithmeticExpression(CloveGrammarParser.ArithmeticExpressionContext ctx) {
        if (ctx.getChildCount() == 3) {
            int leftValue = (int) visit(ctx.expr(0));
            int rightValue = (int) visit(ctx.expr(1));
            if((ctx.operation.getType()== CloveGrammarParser.DIVIDE || ctx.operation.getType()== CloveGrammarParser.MOD) && rightValue ==0){
                errors.append("ERROR: Invalid arithmetic operation performed on the operators!\n");
                System.out.println(errors);
                System.exit(0);
            }

            return switch (ctx.operation.getType()) {
                case CloveGrammarParser.ADD -> leftValue + rightValue;
                case CloveGrammarParser.SUBTRACT -> leftValue - rightValue;
                case CloveGrammarParser.MULTIPLY -> leftValue * rightValue;
                case CloveGrammarParser.DIVIDE -> leftValue / rightValue;
                case CloveGrammarParser.MOD -> leftValue % rightValue;
                default -> throw new IllegalStateException("Unknown operator " + ctx.operation);
            };
        }

        return 0;
    }

    @Override
    public Object visitParenthesesExpression(CloveGrammarParser.ParenthesesExpressionContext ctx) {
        return visit(ctx.expr());
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