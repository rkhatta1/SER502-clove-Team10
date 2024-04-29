import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class CloveGrammar {

    public static void main(String[] args) throws IOException {

        String filePath = "./data/testProgram1.clove";

        if(args.length > 0) {
            filePath = "./data/" + args[0];
        }

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CloveGrammarLexer lexer = new CloveGrammarLexer(inputStream);
        CommonTokenStream tokenizer = new CommonTokenStream(lexer);
        CloveGrammarParser parser = new CloveGrammarParser(tokenizer);
        ParseTree tree = parser.program();

        CloveVisitor visitor = new CloveVisitor();
        visitor.visit(tree);

        try {
            PrintWriter writer = new PrintWriter("parseTree.pt", "UTF-8");
            writer.println(tree.toStringTree(parser));
            writer.close();
        } catch (Exception e) {
            System.out.println("Cannot write to the file \n\n\n\n"
                    + e.toString());
        }

    }

}
