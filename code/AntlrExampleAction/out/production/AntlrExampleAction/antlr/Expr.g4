grammar Expr;

/* the grammar name and the file name must match */

@header {
    package antlr;
    import org.antlr.v4.runtime.*;
    import java.io.*;
    import java.util.*;
    import expression.*;
}

// attributes or methods for the generated parser class
@members {
    // for error handling
    public List<String> vars = new ArrayList<>();
    public List<String> semanticErrors = new ArrayList<>();

    // root of the ast
    public Program program;
}

// production rules
prog returns [Program p]
@init{
// executed before the production takes effect
    $p = new Program();
    program = $p;
}
    : (
        d=decl {
            $p.addExpression($d.d);
        }
        |
        e=expr {
            $p.addExpression($e.e);
        }
       )+ EOF
    ;
decl returns [Expression d]
    : name=ID ':' type=INT_TYPE '=' val=NUM {
        int line = $name.getLine();
        int column = $name.getCharPositionInLine() + 1;
        String id = $name.text;
        if (vars.contains(id)) {
            semanticErrors.add("Error: variable " + id + " already declared ("  + line + ", " + column + ")");
        }
        else {
            vars.add(id);
        }
        String type = $type.getText();
        int val = $val.int;
        $d = new VariableDeclaration(id, type, val);
    }
    ;

expr returns [Expression e]
    : left=expr '*' right=expr {
        $e = new Multiplication($left.e, $right.e);
    }
    | left=expr '+' right=expr {
        $e = new Addition($left.e, $right.e);
    }
    | id=ID {
        int line = $id.getLine();
        int column = $id.getCharPositionInLine() + 1;
        if(!vars.contains($id.text)) {
            semanticErrors.add("Error: variable " + $id.text + " not declared (" + line + ", " + column + ")");
        }
        $e = new Variable($id.text);
    }
    | n=NUM {
    // while building the subtree of an expression node that contains NUM as the first child, we also build Exprssion object
        $e = new expression.Number($n.int);
    }
    ;

// Tokens
ID : [a-z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]* -> skip;
WS : [ \t\n]+ -> skip;
NEWLINE : ('\r'? '\n' | '\r')+ -> skip;
