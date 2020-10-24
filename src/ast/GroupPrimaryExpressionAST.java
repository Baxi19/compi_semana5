package ast;

import org.antlr.v4.runtime.Token;

public class GroupPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token PIZQ;
    public ExpressionAST expression;
    public Token PDER;

    public GroupPrimaryExpressionAST(Token PIZQ, ExpressionAST expression, Token PDER) {
        this.PIZQ = PIZQ;
        this.expression = expression;
        this.PDER = PDER;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitGroupPrimaryExpression(this);
    }
}
