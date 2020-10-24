package ast;

//Class LetSingleCommandAST
public class LetSingleCommandAST extends SingleCommandAST {
    private DeclarationAST declaration;
    private SingleCommandAST singleCommand;

    //Constructor
    public LetSingleCommandAST(DeclarationAST declaration, SingleCommandAST singleCommand) {
        this.declaration = declaration;
        this.singleCommand = singleCommand;
    }

    //Getter
    public DeclarationAST getDeclaration() {
        return declaration;
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return null;
    }
}
