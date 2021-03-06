package app;

import antlr.ExprLexer;
import antlr.ExprParser;
import expression.ExpressionProcessor;
import expression.Program;
import expression.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class ExpressionApp {
    private static ExprParser getParser(String fileName) {
        ExprParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ExprParser(tokens);

            // syntax error handling
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }

    public static void main(String[] args) {
//        args = new String[]{"/home/toorevitimirp/Desktop/antlr4/AntlrExampleAction/src/test/test2.txt"};
        if (args.length != 1) {
            System.err.println("Usage: file name");
        } else {
            String fileName = args[0];
            ExprParser parser = getParser(fileName);
            parser.prog();
            if (SyntaxErrorListener.hasError) {
                /* syntax errors handling */
            } else {
                //convert parse tree into Program/Expression object
                Program program = parser.program;
                if (parser.semanticErrors.isEmpty()) {
                    ExpressionProcessor ep = new ExpressionProcessor(program.expressions);
                    for (String evaluation : ep.getEvaluationResults()) {
                        System.out.println(evaluation);
                    }
                } else {
                    for (String err : parser.semanticErrors) {
                        System.err.println(err);
                    }
                }
            }
        }
    }
}
