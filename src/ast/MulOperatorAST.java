package ast;

import org.antlr.v4.runtime.Token;

public class MulOperatorAST extends OperatorAST {
    public Token MUL;

    public MulOperatorAST(Token MUL) {
        this.MUL = MUL;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitMulOperator(this);
    }
}
