package ast;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class DeclarationAST extends AST {
    public SingleDeclarationAST singleDeclaration;
    public ArrayList<Token> pyCommas;
    public ArrayList<SingleDeclarationAST> singleDeclarations;

    public DeclarationAST(SingleDeclarationAST singleDeclaration, ArrayList<Token> pyCommas, ArrayList<SingleDeclarationAST> singleDeclarations) {
        this.singleDeclaration = singleDeclaration;
        this.pyCommas = pyCommas;
        this.singleDeclarations = singleDeclarations;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitDeclaration(this);
    }
}
