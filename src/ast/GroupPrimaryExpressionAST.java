package ast;

//Class GroupPrimaryExpressionAST
public class GroupPrimaryExpressionAST extends PrimaryExpressionAST {
    private ExpressionAST expression;

    //Constructor
    public GroupPrimaryExpressionAST(ExpressionAST expression) {
        this.expression = expression;
    }

    //Getter
    public ExpressionAST getExpression() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitGroupPrimaryExpressionAST(this);
    }
}
