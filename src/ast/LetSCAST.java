package ast;

import org.antlr.v4.runtime.Token;

public class LetSCAST extends SingleCommandAST{
    public Token LET;
    public DeclarationAST declaration;
    public Token IN;
    public SingleCommandAST singleCommand;

    public LetSCAST(Token LET, DeclarationAST declaration, Token IN, SingleCommandAST singleCommand) {
        this.LET = LET;
        this.declaration = declaration;
        this.IN = IN;
        this.singleCommand = singleCommand;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitLetSC(this);
    }
}
