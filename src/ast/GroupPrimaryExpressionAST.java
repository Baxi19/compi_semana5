package ast;

import org.antlr.v4.runtime.Token;

//Class GroupPrimaryExpressionAST
public class GroupPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token PIZQ;
    public ExpressionAST expression;
    public Token PDER;

    //Constructor
    public GroupPrimaryExpressionAST(Token PIZQ, ExpressionAST expression, Token PDER) {
        this.PIZQ = PIZQ;
        this.expression = expression;
        this.PDER = PDER;
    }

    //Getter
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
        return v.visitGroupPrimaryExpression(this);
    }
}
