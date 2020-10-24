package ast;

import org.antlr.v4.runtime.Token;

//Class MulOperatorAST
public class MulOperatorAST extends OperatorAST {
    public Token MUL;

    //Constructor
    public MulOperatorAST(Token MUL) {
        this.MUL = MUL;
    }

    //Getter
    public Token getMUL() {
        return MUL;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitMulOperator(this);
    }
}
