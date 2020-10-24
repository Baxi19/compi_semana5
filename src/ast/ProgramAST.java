package ast;

//Class ProgramAST
public class ProgramAST extends AST{
    private SingleCommandAST singleCommand;

    //Constructor
    public ProgramAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
    }

    //Getters
    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        visitor.visitProgramAST(this);
        return null;
    }
}
