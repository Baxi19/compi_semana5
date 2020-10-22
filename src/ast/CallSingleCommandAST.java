package ast;

import org.antlr.v4.runtime.CommonToken;

public class CallSingleCommandAST extends SingleCommandAST {
    private CommonToken id;
    private ExpressionAST expression;

    public CallSingleCommandAST(CommonToken id, ExpressionAST expression) {
        this.id = id;
        this.expression = expression;
    }

    public CommonToken getId() {
        return id;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitCallSingleCommandAST(this);
    }

}
