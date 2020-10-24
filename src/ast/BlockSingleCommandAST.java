package ast;

//Class BlockSingleCommandAST
public class BlockSingleCommandAST extends SingleCommandAST{
    private CommandAST command;

    //Constructor
    public BlockSingleCommandAST(CommandAST command) {
        this.command = command;
    }

    //Getter
    public CommandAST getCommand() {
        return command;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitBlockSingleCommandAST(this);
    }
}
