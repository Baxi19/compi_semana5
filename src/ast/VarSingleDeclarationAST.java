package ast;

import org.antlr.v4.runtime.Token;


public class VarSingleDeclarationAST extends SingleDeclarationAST{
    public Token VAR;
    public Token IDENT1;
    public Token DOSPUN;
    public Token IDENT2;

    public VarSingleDeclarationAST(Token VAR, Token IDENT1, Token DOSPUN, Token IDENT2) {
        this.VAR = VAR;
        this.IDENT1 = IDENT1;
        this.DOSPUN = DOSPUN;
        this.IDENT2 = IDENT2;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitVarSingleDeclaration(this);
    }
}
