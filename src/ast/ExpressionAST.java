package ast;

import java.util.ArrayList;

public class ExpressionAST extends AST {
    public PrimaryExpressionAST primaryExpression;
    public ArrayList<OperatorAST> operators;
    public ArrayList<PrimaryExpressionAST> primaryExpressions;

    public ExpressionAST(PrimaryExpressionAST primaryExpression, ArrayList<OperatorAST> operators, ArrayList<PrimaryExpressionAST> primaryExpressions) {
        this.primaryExpression = primaryExpression;
        this.operators = operators;
        this.primaryExpressions = primaryExpressions;
    }

    @Override
    public Object visit(Visitor v) {
        return v.visitExpression(this);
    }
}
