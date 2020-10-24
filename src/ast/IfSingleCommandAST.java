package ast;

//Class IfSingleCommandAST
public class IfSingleCommandAST extends SingleCommandAST{
    private ExpressionAST expression;
    private SingleCommandAST thenSingleCommand;
    private SingleCommandAST elseSingleCommand;

    //Constructor
    public IfSingleCommandAST(ExpressionAST expression, SingleCommandAST thenSingleCommand, SingleCommandAST elseSingleCommand) {
        this.expression = expression;
        this.thenSingleCommand = thenSingleCommand;
        this.elseSingleCommand = elseSingleCommand;
    }

    //Getter
    public ExpressionAST getExpression() {
        return expression;
    }

    public SingleCommandAST getThenSingleCommand() {
        return thenSingleCommand;
    }

    public SingleCommandAST getElseSingleCommand() {
        return elseSingleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitIfSingleCommandAST(this);
    }
}
