package ast;

import org.antlr.v4.runtime.Token;

//Class LetSCAST
public class LetSCAST extends SingleCommandAST{
    public Token LET;
    public DeclarationAST declaration;
    public Token IN;
    public SingleCommandAST singleCommand;

    //Constructor
    public LetSCAST(Token LET, DeclarationAST declaration, Token IN, SingleCommandAST singleCommand) {
        this.LET = LET;
        this.declaration = declaration;
        this.IN = IN;
        this.singleCommand = singleCommand;
    }

    //Getter
    public Token getLET() {
        return LET;
    }

    public DeclarationAST getDeclaration() {
        return declaration;
    }

    public Token getIN() {
        return IN;
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitLetSC(this);
    }
}
