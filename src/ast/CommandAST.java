package ast;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

//Class CommandAST
public class CommandAST extends AST {
    public SingleCommandAST singleCommand;
    public ArrayList<Token> pyCommas;
    public ArrayList<SingleCommandAST> singleCommands;

    //Constructor
    public CommandAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
        this.pyCommas = new ArrayList<>();
        this.singleCommands = new ArrayList<>();
    }

    //Getter
    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    public ArrayList<Token> getPyCommas() {
        return pyCommas;
    }

    public ArrayList<SingleCommandAST> getSingleCommands() {
        return singleCommands;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitCommand(this);
    }
}
