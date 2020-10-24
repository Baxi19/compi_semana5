package ast;

import org.antlr.v4.runtime.Token;

//Class AssingSCAST
public class AssingSCAST extends SingleCommandAST{
    public Token ID;
    public Token ASSING;
    public ExpressionAST expression;

    //Constructor
    public AssingSCAST(Token ID, Token ASSING, ExpressionAST expression) {
        this.ID = ID;
        this.ASSING = ASSING;
        this.expression = expression;
    }
    //Getter
    public Token getID() {
        return ID;
    }

    public Token getASSING() {
        return ASSING;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitAssingSC(this);
    }

}
