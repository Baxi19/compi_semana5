package ast;

import org.antlr.v4.runtime.Token;

//Class CallFunSCAST
public class CallFunSCAST extends SingleCommandAST {
    public Token IDENT;
    public Token PIZQ;
    public ExpressionAST expression;
    public Token PDER;

    //Constructor
    public CallFunSCAST(Token IDENT, Token PIZQ, ExpressionAST expression, Token PDER) {
        this.IDENT = IDENT;
        this.PIZQ = PIZQ;
        this.expression = expression;
        this.PDER = PDER;
    }

    //Getter
    public Token getIDENT() {
        return IDENT;
    }

    public Token getPIZQ() {
        return PIZQ;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    public Token getPDER() {
        return PDER;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitCallFunSC(this);
    }
}
