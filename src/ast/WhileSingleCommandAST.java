package ast;

//Class WhileSingleCommandAST
public class WhileSingleCommandAST extends SingleCommandAST{
    private ExpressionAST expression;
    private SingleCommandAST singleCommand;

    //Constructor
    public WhileSingleCommandAST(ExpressionAST expression, SingleCommandAST singleCommand) {
        this.expression = expression;
        this.singleCommand = singleCommand;
    }

    //Getters
    public ExpressionAST getExpression() {
        return expression;
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitWhileSingleCommandAST(this);
    }
}
