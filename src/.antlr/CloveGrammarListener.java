// Generated from e:/ASU/SER502/Project/SER502-clove-Team10/src/CloveGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CloveGrammarParser}.
 */
public interface CloveGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CloveGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CloveGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloveGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CloveGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloveGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CloveGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloveGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CloveGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesRelExpr}
	 * labeled alternative in {@link CloveGrammarParser#relational_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesRelExpr(CloveGrammarParser.ParenthesesRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesRelExpr}
	 * labeled alternative in {@link CloveGrammarParser#relational_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesRelExpr(CloveGrammarParser.ParenthesesRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CloveGrammarParser#relational_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(CloveGrammarParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CloveGrammarParser#relational_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(CloveGrammarParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanCondition}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBooleanCondition(CloveGrammarParser.BooleanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanCondition}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBooleanCondition(CloveGrammarParser.BooleanConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionWithParentheses}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionWithParentheses(CloveGrammarParser.ConditionWithParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionWithParentheses}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionWithParentheses(CloveGrammarParser.ConditionWithParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notIDBoolean}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotIDBoolean(CloveGrammarParser.NotIDBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notIDBoolean}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotIDBoolean(CloveGrammarParser.NotIDBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(CloveGrammarParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(CloveGrammarParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanIdOperation}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBooleanIdOperation(CloveGrammarParser.BooleanIdOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanIdOperation}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBooleanIdOperation(CloveGrammarParser.BooleanIdOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionRelExpr}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionRelExpr(CloveGrammarParser.ConditionRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionRelExpr}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionRelExpr(CloveGrammarParser.ConditionRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionConnector}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionConnector(CloveGrammarParser.ConditionConnectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionConnector}
	 * labeled alternative in {@link CloveGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionConnector(CloveGrammarParser.ConditionConnectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclarationStatement(CloveGrammarParser.IntDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclarationStatement(CloveGrammarParser.IntDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclarationStatement(CloveGrammarParser.StringDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclarationStatement(CloveGrammarParser.StringDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclarationStatement(CloveGrammarParser.BoolDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDeclarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclarationStatement(CloveGrammarParser.BoolDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(CloveGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link CloveGrammarParser#declarativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(CloveGrammarParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentOperatorStatement}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorStatement(CloveGrammarParser.AssignmentOperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentOperatorStatement}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorStatement(CloveGrammarParser.AssignmentOperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncrementOperation(CloveGrammarParser.IncrementOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementOperation}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncrementOperation(CloveGrammarParser.IncrementOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrementOperation}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterDecrementOperation(CloveGrammarParser.DecrementOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrementOperation}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitDecrementOperation(CloveGrammarParser.DecrementOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperatorAssignment}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorAssignment(CloveGrammarParser.TernaryOperatorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperatorAssignment}
	 * labeled alternative in {@link CloveGrammarParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorAssignment(CloveGrammarParser.TernaryOperatorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntInitialization(CloveGrammarParser.IntInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntInitialization(CloveGrammarParser.IntInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringInitialization(CloveGrammarParser.StringInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringInitialization(CloveGrammarParser.StringInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolInitialization(CloveGrammarParser.BoolInitializationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolInitialization}
	 * labeled alternative in {@link CloveGrammarParser#idAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolInitialization(CloveGrammarParser.BoolInitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionIdentifier}
	 * labeled alternative in {@link CloveGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionIdentifier(CloveGrammarParser.PrintFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionIdentifier}
	 * labeled alternative in {@link CloveGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionIdentifier(CloveGrammarParser.PrintFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionExpression}
	 * labeled alternative in {@link CloveGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionExpression(CloveGrammarParser.PrintFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionExpression}
	 * labeled alternative in {@link CloveGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionExpression(CloveGrammarParser.PrintFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloveGrammarParser#ifStatements}.
	 * @param ctx the parse tree
	 */
	void enterIfStatements(CloveGrammarParser.IfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloveGrammarParser#ifStatements}.
	 * @param ctx the parse tree
	 */
	void exitIfStatements(CloveGrammarParser.IfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloveGrammarParser#elseStatements}.
	 * @param ctx the parse tree
	 */
	void enterElseStatements(CloveGrammarParser.ElseStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloveGrammarParser#elseStatements}.
	 * @param ctx the parse tree
	 */
	void exitElseStatements(CloveGrammarParser.ElseStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseCondition}
	 * labeled alternative in {@link CloveGrammarParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseCondition(CloveGrammarParser.IfThenElseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseCondition}
	 * labeled alternative in {@link CloveGrammarParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseCondition(CloveGrammarParser.IfThenElseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileCondition}
	 * labeled alternative in {@link CloveGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(CloveGrammarParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileCondition}
	 * labeled alternative in {@link CloveGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(CloveGrammarParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOperatorOperation}
	 * labeled alternative in {@link CloveGrammarParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorOperation(CloveGrammarParser.TernaryOperatorOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOperatorOperation}
	 * labeled alternative in {@link CloveGrammarParser#ternaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorOperation(CloveGrammarParser.TernaryOperatorOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code traditionalForLoop}
	 * labeled alternative in {@link CloveGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterTraditionalForLoop(CloveGrammarParser.TraditionalForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code traditionalForLoop}
	 * labeled alternative in {@link CloveGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitTraditionalForLoop(CloveGrammarParser.TraditionalForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachLoopCondition}
	 * labeled alternative in {@link CloveGrammarParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void enterForEachLoopCondition(CloveGrammarParser.ForEachLoopConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachLoopCondition}
	 * labeled alternative in {@link CloveGrammarParser#forEachLoop}.
	 * @param ctx the parse tree
	 */
	void exitForEachLoopCondition(CloveGrammarParser.ForEachLoopConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(CloveGrammarParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(CloveGrammarParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(CloveGrammarParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(CloveGrammarParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpression(CloveGrammarParser.NumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpression(CloveGrammarParser.NumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(CloveGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpression}
	 * labeled alternative in {@link CloveGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(CloveGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CloveGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CloveGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CloveGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CloveGrammarParser.BoolContext ctx);
}