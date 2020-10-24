package ast;

import org.antlr.v4.runtime.Token;

public class AssingSCAST extends SingleCommandAST{
    public Token ID;
    public Token ASSING;
    public ExpressionAST expression;

    public AssingSCAST(Token ID, Token ASSING, ExpressionAST expression) {
        this.ID = ID;
        this.ASSING = ASSING;
        this.expression = expression;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitAssingSC(this);
    }

}
