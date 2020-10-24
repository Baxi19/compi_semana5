package ast;

import java.util.ArrayList;

//Class ExpressionAST
public class ExpressionAST extends AST {
    public PrimaryExpressionAST primaryExpression;
    public ArrayList<OperatorAST> operators;
    public ArrayList<PrimaryExpressionAST> primaryExpressions;

    //Constructor
    public ExpressionAST(PrimaryExpressionAST primaryExpression) {
        this.primaryExpression = primaryExpression;
        this.operators = new ArrayList<>();
        this.primaryExpressions = new ArrayList<>();
    }

    //Getter
    public PrimaryExpressionAST getPrimaryExpression() {
        return primaryExpression;
    }

    public ArrayList<OperatorAST> getOperators() {
        return operators;
    }

    public ArrayList<PrimaryExpressionAST> getPrimaryExpressions() {
        return primaryExpressions;
    }

    //AST method
    @Override
    public Object visit(Visitor v) {
        return v.visitExpression(this);
    }
}
