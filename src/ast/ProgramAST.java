package ast;

public class ProgramAST extends AST{
    private SingleCommandAST singleCommand;


    public ProgramAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }


    @Override
    public Object visit(Visitor visitor) {
        visitor.visitProgramAST(this);
        return null;
    }
}
