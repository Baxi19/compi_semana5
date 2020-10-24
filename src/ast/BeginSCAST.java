package ast;

import org.antlr.v4.runtime.Token;

public class BeginSCAST extends SingleCommandAST {
    public Token BEGIN;
    public CommandAST command;
    public Token END;

    public BeginSCAST(Token BEGIN, CommandAST command, Token END) {
        this.BEGIN = BEGIN;
        this.command = command;
        this.END = END;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitBeginSC(this);
    }
}
