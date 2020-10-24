package ast;

import org.antlr.v4.runtime.Token;

public class DivOperatorAST extends OperatorAST {
    public Token DIV;

    public DivOperatorAST(Token DIV) {
        this.DIV = DIV;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitDivOperator(this);
    }
}
