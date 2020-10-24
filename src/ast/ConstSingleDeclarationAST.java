package ast;

import org.antlr.v4.runtime.Token;

//Class ConstSingleDeclarationAST
public class ConstSingleDeclarationAST extends  SingleDeclarationAST {
    public Token CONST;
    public Token IDENT;
    public Token VIR;
    public ExpressionAST expression;

    //Constructor
    public ConstSingleDeclarationAST(Token CONST, Token IDENT, Token VIR, ExpressionAST expression) {
        this.CONST = CONST;
        this.IDENT = IDENT;
        this.VIR = VIR;
        this.expression = expression;
    }

    //Getter
    public Token getCONST() {
        return CONST;
    }

    public Token getIDENT() {
        return IDENT;
    }

    public Token getVIR() {
        return VIR;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitConstSingleDeclaration(this);
    }
}
