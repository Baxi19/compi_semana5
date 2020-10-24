package ast;

import java.util.ArrayList;

//Class CommandAST
public class CommandAST extends  AST {
    private SingleCommandAST singleCommand;
    private ArrayList<SingleCommandAST> singleCommandList ;

    //Constructor
    public CommandAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
        this.singleCommandList = new ArrayList<>();
    }

    //Getters
    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    public SingleCommandAST getSingleCommand(int i) {
        return singleCommandList.get(i);
    }

    public ArrayList<SingleCommandAST> getSingleCommandList() {
        return singleCommandList;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitCommandAST(this);
    }
}
