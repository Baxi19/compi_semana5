package ast;

import org.antlr.v4.runtime.Token;

//Class NumPrimaryExpressionAST
public class NumPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token NUM;

    //Constructor
    public NumPrimaryExpressionAST(Token NUM) {
        this.NUM = NUM;
    }

    //Getter
    public Token getNUM() {
        return NUM;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitNumPrimaryExpression(this);
    }
}
