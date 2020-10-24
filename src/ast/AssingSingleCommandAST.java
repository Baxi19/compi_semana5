package ast;

import org.antlr.v4.runtime.CommonToken;

//Class AssingSingleCommandAST
public class AssingSingleCommandAST extends  SingleCommandAST {
    private CommonToken id;
    private ExpressionAST expression;

    //Constructor
    public AssingSingleCommandAST(CommonToken id, ExpressionAST expression) {
        this.id = id;
        this.expression = expression;
    }

    //Getters
    public CommonToken getId() {
        return id;
    }

    public ExpressionAST getExpressionAST() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitAssingSingleCommandAST(this);
    }
}
