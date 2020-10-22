package ast;

import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

public class ExpressionAST extends AST{
    private PrimaryExpressionAST primaryExpression;
    private ArrayList<PrimaryExpressionAST> primaryExpressionList;
    private ArrayList<CommonToken> operatorList;

    public ExpressionAST(PrimaryExpressionAST primaryExpression) {
        this.primaryExpression = primaryExpression;
        this.primaryExpressionList = new ArrayList<>();
        operatorList = new ArrayList<>();
    }

    public PrimaryExpressionAST getPrimaryExpression() {
        return primaryExpression;
    }

    public PrimaryExpressionAST getPrimaryExpression(int i) {
        return primaryExpressionList.get(i);
    }

    public CommonToken getOperator(int i) {
        return operatorList.get(i);
    }

    //TODO:
    @Override
    public Object visit(Visitor visitor) {
        return null;
    }
}
