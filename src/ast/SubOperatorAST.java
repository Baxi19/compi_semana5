package ast;

import org.antlr.v4.runtime.Token;

//Class SubOperatorAST
public class SubOperatorAST extends OperatorAST {
    public Token SUB;

    //Constructor
    public SubOperatorAST(Token SUB) {
        this.SUB = SUB;
    }

    //Getter
    public Token getSUB() {
        return SUB;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitSubOperator(this);
    }
}
