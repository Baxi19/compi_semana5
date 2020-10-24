package ast;

import org.antlr.v4.runtime.Token;

//Class VarSingleDeclarationAST
public class VarSingleDeclarationAST extends SingleDeclarationAST{
    public Token VAR;
    public Token IDENT1;
    public Token DOSPUN;
    public Token IDENT2;

    //Constructor
    public VarSingleDeclarationAST(Token VAR, Token IDENT1, Token DOSPUN, Token IDENT2) {
        this.VAR = VAR;
        this.IDENT1 = IDENT1;
        this.DOSPUN = DOSPUN;
        this.IDENT2 = IDENT2;
    }

    //Getter
    public Token getVAR() {
        return VAR;
    }

    public Token getIDENT1() {
        return IDENT1;
    }

    public Token getDOSPUN() {
        return DOSPUN;
    }

    public Token getIDENT2() {
        return IDENT2;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitVarSingleDeclaration(this);
    }
}
