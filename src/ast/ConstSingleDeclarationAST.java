package ast;

import org.antlr.v4.runtime.Token;

public class ConstSingleDeclarationAST extends  SingleDeclarationAST {
    public Token CONST;
    public Token IDENT;
    public Token VIR;
    public ExpressionAST expression;

    public ConstSingleDeclarationAST(Token CONST, Token IDENT, Token VIR, ExpressionAST expression) {
        this.CONST = CONST;
        this.IDENT = IDENT;
        this.VIR = VIR;
        this.expression = expression;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitConstSingleDeclaration(this);
    }
}
