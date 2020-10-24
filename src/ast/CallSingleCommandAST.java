package ast;

import org.antlr.v4.runtime.CommonToken;

//Class CallSingleCommandAST
public class CallSingleCommandAST extends SingleCommandAST {
    private CommonToken id;
    private ExpressionAST expression;

    //Constructor
    public CallSingleCommandAST(CommonToken id, ExpressionAST expression) {
        this.id = id;
        this.expression = expression;
    }

    //Getters
    public CommonToken getId() {
        return id;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitCallSingleCommandAST(this);
    }

}
