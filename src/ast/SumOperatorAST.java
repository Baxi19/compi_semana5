package ast;

import org.antlr.v4.runtime.Token;

//Class SumOperatorAST
public class SumOperatorAST extends OperatorAST {
    public Token SUM;

    //Constructor
    public SumOperatorAST(Token SUM) {
        this.SUM = SUM;
    }

    //Getter
    public Token getSUM() {
        return SUM;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitSumOperator(this);
    }
}
