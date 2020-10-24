package ast;

public class ProgramAST extends AST {
    public SingleCommandAST singleCommand;

    public ProgramAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
    }


    @Override
    public Object visit(Visitor v) {
        return v.visitProgram(this);
    }
}
