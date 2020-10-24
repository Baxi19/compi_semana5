package ast;

import org.antlr.v4.runtime.Token;

public class BeginSCAST extends SingleCommandAST {
    public Token BEGIN;
    public CommandAST command;
    public Token END;

    //Constructor
    public BeginSCAST(Token BEGIN, CommandAST command, Token END) {
        this.BEGIN = BEGIN;
        this.command = command;
        this.END = END;
    }

    //Getter
    public Token getBEGIN() {
        return BEGIN;
    }

    public CommandAST getCommand() {
        return command;
    }

    public Token getEND() {
        return END;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitBeginSC(this);
    }
}
