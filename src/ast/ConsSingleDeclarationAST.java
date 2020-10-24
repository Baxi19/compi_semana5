package ast;

import org.antlr.v4.runtime.CommonToken;

//Class ConsSingleDeclarationAST
public class ConsSingleDeclarationAST extends SingleDeclarationAST {
    private CommonToken id;
    private ExpressionAST expression;

    //Constructor
    public ConsSingleDeclarationAST(CommonToken id, ExpressionAST expression) {
        this.id = id;
        this.expression = expression;
    }

    //Getter
    public CommonToken getId() {
        return id;
    }

    public ExpressionAST getExpression() {
        return expression;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitConsSingleDeclarationAST(this);
    }
}
