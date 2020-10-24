package ast;

import org.antlr.v4.runtime.CommonToken;

//Class IdPrimaryExpressionAST
public class IdPrimaryExpressionAST extends PrimaryExpressionAST {
    private CommonToken id;

    //Constructor
    public IdPrimaryExpressionAST(CommonToken id) {
        this.id = id;
    }

    //Getter
    public CommonToken getId() {
        return id;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitIdPrimaryExpressionAST(this);
    }
}
