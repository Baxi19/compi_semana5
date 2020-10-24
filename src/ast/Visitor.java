package ast;

public interface Visitor {

    public Object visitProgramAST(ProgramAST ctx);
    public Object visitCommandAST(CommandAST ctx);
    public Object visitAssingSingleCommandAST(AssingSingleCommandAST ctx);
    public Object visitCallSingleCommandAST(CallSingleCommandAST ctx);
    public Object visitIfSingleCommandAST(IfSingleCommandAST ctx);
    public Object visitWhileSingleCommandAST(WhileSingleCommandAST ctx);
    public Object visitLetSingleCommandAST(LetSingleCommandAST ctx);
    public Object visitBlockSingleCommandAST(BlockSingleCommandAST ctx);
    public Object visitDeclarationAST(DeclarationAST ctx);
    public Object visitConsSingleDeclarationAST(ConsSingleDeclarationAST ctx);
    public Object visitVarSingleDeclarationAST(VarSingleDeclarationAST ctx);
    public Object visitTypeDenoterAST(TypeDenoterAST ctx);
    public Object visitExpressionAST(ExpressionAST ctx);
    public Object visitNumPrimaryExpressionAST(NumPrimaryExpressionAST ctx);
    public Object visitIdPrimaryExpressionAST(IdPrimaryExpressionAST ctx);
    public Object visitGroupPrimaryExpressionAST(GroupPrimaryExpressionAST ctx);
    public Object visitOperatorAST(OperatorAST ctx);

}
