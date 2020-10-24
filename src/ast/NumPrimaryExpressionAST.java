package ast;

import org.antlr.v4.runtime.CommonToken;

//Class NumPrimaryExpressionAST
public class NumPrimaryExpressionAST extends PrimaryExpressionAST {
    private CommonToken literal;

    //Constructor
    public NumPrimaryExpressionAST(CommonToken literal) {
        this.literal = literal;
    }

    //Getter
    public CommonToken getLiteral() {
        return literal;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitNumPrimaryExpressionAST(this);
    }
}
