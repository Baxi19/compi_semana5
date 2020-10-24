package ast;

import org.antlr.v4.runtime.Token;

public class SubOperatorAST extends OperatorAST {
    public Token SUB;

    public SubOperatorAST(Token SUB) {
        this.SUB = SUB;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitSubOperator(this);
    }
}
