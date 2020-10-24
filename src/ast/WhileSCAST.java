package ast;

import org.antlr.v4.runtime.Token;

//Class WhileSCAST
public class WhileSCAST extends SingleCommandAST {
    public Token WHILE;
    public ExpressionAST expression;
    public Token DO;
    public SingleCommandAST singleCommand;

    //Constructor
    public WhileSCAST(Token WHILE, ExpressionAST expression, Token DO, SingleCommandAST singleCommand) {
        this.WHILE = WHILE;
        this.expression = expression;
        this.DO = DO;
        this.singleCommand = singleCommand;
    }

    //Getter
    public Token getWHILE() {
        return WHILE;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    public Token getDO() {
        return DO;
    }

    public SingleCommandAST getSingleCommand() {
        return singleCommand;
    }

    //AST Method
    @Override
    public Object visit(Visitor v) {
        return v.visitWhileSC(this);
    }
}
