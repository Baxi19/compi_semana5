package ast;

import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

//Class ExpressionAST
public class ExpressionAST extends AST{
    private PrimaryExpressionAST primaryExpression;
    private ArrayList<CommonToken> operatorList;
    private ArrayList<PrimaryExpressionAST> primaryExpressionList;

    //Constructor
    public ExpressionAST(PrimaryExpressionAST primaryExpression) {
        this.primaryExpression = primaryExpression;
        operatorList = new ArrayList<>();
        this.primaryExpressionList = new ArrayList<>();
    }

    //Getter
    public PrimaryExpressionAST getPrimaryExpression() {
        return primaryExpression;
    }

    public PrimaryExpressionAST getPrimaryExpression(int i) {
        return primaryExpressionList.get(i);
    }

    public ArrayList<CommonToken> getOperatorList() {
        return operatorList;
    }

    public ArrayList<PrimaryExpressionAST> getPrimaryExpressionList() {
        return primaryExpressionList;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitExpressionAST(this);
    }
}
