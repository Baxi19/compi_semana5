package ast;

import java.util.ArrayList;

public class CommandAST extends  AST {
    private SingleCommandAST singleCommand;
    private ArrayList<SingleCommandAST> singleCommandList ;

    public CommandAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
        this.singleCommandList = new ArrayList<>();
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    public SingleCommandAST SingleCommand(int i) {
        return singleCommandList.get(i);
    }

    public ArrayList<SingleCommandAST> getSingleCommandList() {
        return singleCommandList;
    }

    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitCommandAST(this);
    }
}
