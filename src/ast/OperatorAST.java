package ast;

import org.antlr.v4.runtime.CommonToken;

//Class OperatorAST
public class OperatorAST extends AST {
    private CommonToken operator;

    //Constructor
    public OperatorAST(CommonToken operator) {
        this.operator = operator;
    }

    //Getter
    public CommonToken getOperator() {
        return operator;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitOperatorAST(this);
    }
}
