package ast;

public interface Visitor {
    public Object visitProgram(ProgramAST ctx);
    public Object visitCommand(CommandAST ctx);
    public Object visitAssingSC(AssingSCAST ctx);
    public Object visitCallFunSC(CallFunSCAST ctx);
    public Object visitIfSC(IfSCAST ctx);
    public Object visitWhileSC(WhileSCAST ctx);
    public Object visitLetSC(LetSCAST ctx);
    public Object visitBeginSC(BeginSCAST ctx);
    public Object visitDeclaration(DeclarationAST ctx);
    public Object visitConstSingleDeclaration(ConstSingleDeclarationAST ctx);
    public Object visitVarSingleDeclaration(VarSingleDeclarationAST ctx);
    public Object visitExpression(ExpressionAST ctx);
    public Object visitNumPrimaryExpression(NumPrimaryExpressionAST ctx);
    public Object visitIdentPrimaryExpression(IdentPrimaryExpressionAST ctx);
    public Object visitGroupPrimaryExpression(GroupPrimaryExpressionAST ctx);
    public Object visitSumOperator(SumOperatorAST ctx);
    public Object visitSubOperator(SubOperatorAST ctx);
    public Object visitMulOperator(MulOperatorAST ctx);
    public Object visitDivOperator(DivOperatorAST ctx);
}
