package ast;

//Class ProgramAST
public class ProgramAST extends AST {
    public SingleCommandAST singleCommand;

    //Constructor
    public ProgramAST(SingleCommandAST singleCommand) {
        this.singleCommand = singleCommand;
    }

    //Getter
    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitProgram(this);
    }
}
