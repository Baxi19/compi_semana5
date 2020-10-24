package ast;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

//Class DeclarationAST
public class DeclarationAST extends AST {
    public SingleDeclarationAST singleDeclaration;
    public ArrayList<Token> pyCommas;
    public ArrayList<SingleDeclarationAST> singleDeclarations;

    //Constructor
    public DeclarationAST(SingleDeclarationAST singleDeclaration) {
        this.singleDeclaration = singleDeclaration;
        this.pyCommas = new ArrayList<>();
        this.singleDeclarations = new ArrayList<>();
    }

    //Getter
    public SingleDeclarationAST getSingleDeclaration() {
        return singleDeclaration;
    }

    public ArrayList<Token> getPyCommas() {
        return pyCommas;
    }

    public ArrayList<SingleDeclarationAST> getSingleDeclarations() {
        return singleDeclarations;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitDeclaration(this);
    }
}
