package ast;

import org.antlr.v4.runtime.Token;

//Class IfSCAST
public class IfSCAST extends SingleCommandAST {
    public Token IF;
    public ExpressionAST expression;
    public Token THEN;
    public SingleCommandAST singleCommand1;
    public Token ELSE;
    public SingleCommandAST singleCommand2;

    //Constructor
    public IfSCAST(Token IF, ExpressionAST expression, Token THEN, SingleCommandAST singleCommand1, Token ELSE, SingleCommandAST singleCommand2) {
        this.IF = IF;
        this.expression = expression;
        this.THEN = THEN;
        this.singleCommand1 = singleCommand1;
        this.ELSE = ELSE;
        this.singleCommand2 = singleCommand2;
    }

    //Getter
    public Token getIF() {
        return IF;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    public Token getTHEN() {
        return THEN;
    }

    public SingleCommandAST getSingleCommand1() {
        return singleCommand1;
    }

    public Token getELSE() {
        return ELSE;
    }

    public SingleCommandAST getSingleCommand2() {
        return singleCommand2;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitIfSC(this);
    }
}
