package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends ExprBaseVisitor<Program> {
    public List<String> semanticErrors; // to be accessed by main application program
    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program program = new Program();
        semanticErrors = new ArrayList<>();
        AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
        // a help visitor for transforming each subtree in an Expression

        for (int i = 0; i < ctx.getChildCount() - 1; i++) {
            // last child is EOF
            program.addExpression(exprVisitor.visit(ctx.getChild(i)));
        }
        return program;
    }
}
