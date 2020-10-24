package ast;

import org.antlr.v4.runtime.Token;

public class IdentPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token IDENT;

    public IdentPrimaryExpressionAST(Token IDENT) {
        this.IDENT = IDENT;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitIdentPrimaryExpression(this);
    }
}
