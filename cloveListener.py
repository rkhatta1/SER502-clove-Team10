# Generated from clove.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .cloveParser import cloveParser
else:
    from cloveParser import cloveParser

# This class defines a complete listener for a parse tree produced by cloveParser.
class cloveListener(ParseTreeListener):

    # Enter a parse tree produced by cloveParser#program.
    def enterProgram(self, ctx:cloveParser.ProgramContext):
        pass

    # Exit a parse tree produced by cloveParser#program.
    def exitProgram(self, ctx:cloveParser.ProgramContext):
        pass


    # Enter a parse tree produced by cloveParser#statement.
    def enterStatement(self, ctx:cloveParser.StatementContext):
        pass

    # Exit a parse tree produced by cloveParser#statement.
    def exitStatement(self, ctx:cloveParser.StatementContext):
        pass


    # Enter a parse tree produced by cloveParser#assignment.
    def enterAssignment(self, ctx:cloveParser.AssignmentContext):
        pass

    # Exit a parse tree produced by cloveParser#assignment.
    def exitAssignment(self, ctx:cloveParser.AssignmentContext):
        pass


    # Enter a parse tree produced by cloveParser#if_statement.
    def enterIf_statement(self, ctx:cloveParser.If_statementContext):
        pass

    # Exit a parse tree produced by cloveParser#if_statement.
    def exitIf_statement(self, ctx:cloveParser.If_statementContext):
        pass


    # Enter a parse tree produced by cloveParser#for_loop.
    def enterFor_loop(self, ctx:cloveParser.For_loopContext):
        pass

    # Exit a parse tree produced by cloveParser#for_loop.
    def exitFor_loop(self, ctx:cloveParser.For_loopContext):
        pass


    # Enter a parse tree produced by cloveParser#while_loop.
    def enterWhile_loop(self, ctx:cloveParser.While_loopContext):
        pass

    # Exit a parse tree produced by cloveParser#while_loop.
    def exitWhile_loop(self, ctx:cloveParser.While_loopContext):
        pass


    # Enter a parse tree produced by cloveParser#print_statement.
    def enterPrint_statement(self, ctx:cloveParser.Print_statementContext):
        pass

    # Exit a parse tree produced by cloveParser#print_statement.
    def exitPrint_statement(self, ctx:cloveParser.Print_statementContext):
        pass


    # Enter a parse tree produced by cloveParser#expression.
    def enterExpression(self, ctx:cloveParser.ExpressionContext):
        pass

    # Exit a parse tree produced by cloveParser#expression.
    def exitExpression(self, ctx:cloveParser.ExpressionContext):
        pass


    # Enter a parse tree produced by cloveParser#boolean_expression.
    def enterBoolean_expression(self, ctx:cloveParser.Boolean_expressionContext):
        pass

    # Exit a parse tree produced by cloveParser#boolean_expression.
    def exitBoolean_expression(self, ctx:cloveParser.Boolean_expressionContext):
        pass


    # Enter a parse tree produced by cloveParser#boolean_term.
    def enterBoolean_term(self, ctx:cloveParser.Boolean_termContext):
        pass

    # Exit a parse tree produced by cloveParser#boolean_term.
    def exitBoolean_term(self, ctx:cloveParser.Boolean_termContext):
        pass


    # Enter a parse tree produced by cloveParser#comparison.
    def enterComparison(self, ctx:cloveParser.ComparisonContext):
        pass

    # Exit a parse tree produced by cloveParser#comparison.
    def exitComparison(self, ctx:cloveParser.ComparisonContext):
        pass


    # Enter a parse tree produced by cloveParser#additive_expr.
    def enterAdditive_expr(self, ctx:cloveParser.Additive_exprContext):
        pass

    # Exit a parse tree produced by cloveParser#additive_expr.
    def exitAdditive_expr(self, ctx:cloveParser.Additive_exprContext):
        pass


    # Enter a parse tree produced by cloveParser#multiplicative_expr.
    def enterMultiplicative_expr(self, ctx:cloveParser.Multiplicative_exprContext):
        pass

    # Exit a parse tree produced by cloveParser#multiplicative_expr.
    def exitMultiplicative_expr(self, ctx:cloveParser.Multiplicative_exprContext):
        pass


    # Enter a parse tree produced by cloveParser#factor.
    def enterFactor(self, ctx:cloveParser.FactorContext):
        pass

    # Exit a parse tree produced by cloveParser#factor.
    def exitFactor(self, ctx:cloveParser.FactorContext):
        pass


    # Enter a parse tree produced by cloveParser#variable.
    def enterVariable(self, ctx:cloveParser.VariableContext):
        pass

    # Exit a parse tree produced by cloveParser#variable.
    def exitVariable(self, ctx:cloveParser.VariableContext):
        pass


    # Enter a parse tree produced by cloveParser#number.
    def enterNumber(self, ctx:cloveParser.NumberContext):
        pass

    # Exit a parse tree produced by cloveParser#number.
    def exitNumber(self, ctx:cloveParser.NumberContext):
        pass



del cloveParser