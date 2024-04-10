from antlr4 import *
from cloveLexer import cloveLexer
from cloveParser import cloveParser

class cloveInterpreter(cloveParser):
    def __init__(self, input_stream):
        lexer = cloveLexer(input_stream)
        stream = CommonTokenStream(lexer)
        super().__init__(stream)

    def visitPrint_statement(self, ctx):
        value = self.visit(ctx.expression())
        print(value)

    # Implement other visit methods for the remaining statement types

# Example usage:
if __name__ == '__main__':
    input_stream = InputStream("print(2 + 3)")
    interpreter = cloveInterpreter(input_stream)
    interpreter.program()
