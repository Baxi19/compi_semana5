package ast;

import org.antlr.v4.runtime.Token;

public class NumPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token NUM;

    public NumPrimaryExpressionAST(Token NUM) {
        this.NUM = NUM;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitNumPrimaryExpression(this);
    }
}
