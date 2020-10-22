package ast;

import org.antlr.v4.runtime.CommonToken;

public class AssingSingleCommandAST extends  SingleCommandAST {
    private CommonToken id;
    private ExpressionAST expression;

    public AssingSingleCommandAST(CommonToken id, ExpressionAST expression) {
        this.id = id;
        this.expression = expression;
    }

    public CommonToken getId() {
        return id;
    }

    public ExpressionAST getExpressionAST() {
        return expression;
    }

    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitAssingSingleCommandAST(this);
    }
}
