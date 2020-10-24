package ast;

import org.antlr.v4.runtime.Token;

public class SumOperatorAST extends OperatorAST {
    public Token SUM;

    public SumOperatorAST(Token SUM) {
        this.SUM = SUM;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitSumOperator(this);
    }
}
