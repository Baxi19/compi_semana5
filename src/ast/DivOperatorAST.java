package ast;

import org.antlr.v4.runtime.Token;

//Class DivOperatorAST
public class DivOperatorAST extends OperatorAST {
    public Token DIV;

    //Constructor
    public DivOperatorAST(Token DIV) {
        this.DIV = DIV;
    }

    //Getter
    public Token getDIV() {
        return DIV;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitDivOperator(this);
    }
}
