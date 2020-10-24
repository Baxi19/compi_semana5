package ast;

import org.antlr.v4.runtime.Token;

//Class IdentPrimaryExpressionAST
public class IdentPrimaryExpressionAST extends PrimaryExpressionAST {
    public Token IDENT;

    //Constructor
    public IdentPrimaryExpressionAST(Token IDENT) {
        this.IDENT = IDENT;
    }

    //Getter
    public Token getIDENT() {
        return IDENT;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitIdentPrimaryExpression(this);
    }
}
