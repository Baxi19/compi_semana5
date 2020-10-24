package ast;

import org.antlr.v4.runtime.Token;

public class WhileSCAST extends SingleCommandAST {
    public Token WHILE;
    public ExpressionAST expression;
    public Token DO;
    public SingleCommandAST singleCommand;

    public WhileSCAST(Token WHILE, ExpressionAST expression, Token DO, SingleCommandAST singleCommand) {
        this.WHILE = WHILE;
        this.expression = expression;
        this.DO = DO;
        this.singleCommand = singleCommand;
    }
    @Override
    public Object visit(Visitor v) {
        return v.visitWhileSC(this);
    }
}
