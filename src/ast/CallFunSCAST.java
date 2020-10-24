package ast;

import org.antlr.v4.runtime.Token;

public class CallFunSCAST extends SingleCommandAST {
    public Token IDENT;
    public Token PIZQ;
    public ExpressionAST expression;
    public Token PDER;

    public CallFunSCAST(Token IDENT, Token PIZQ, ExpressionAST expression, Token PDER) {
        this.IDENT = IDENT;
        this.PIZQ = PIZQ;
        this.expression = expression;
        this.PDER = PDER;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitCallFunSC(this);
    }
}
