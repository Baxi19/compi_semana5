import ast.*;

//Class print
public class PrintAST implements Visitor {

    @Override
    public Object visitProgramAST(ProgramAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getSingleCommand().visit(this);
        return null;
    }

    @Override
    public Object visitCommandAST(CommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getSingleCommand().visit(this);

        if(!ctx.getSingleCommandList().isEmpty()){
            for (int i = 0; i < ctx.getSingleCommandList().size(); i++) {
                ctx.getSingleCommand(i).visit(this);
            }
        }
        return null;
    }

    @Override
    public Object visitAssingSingleCommandAST(AssingSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText() +" = ");
        ctx.getExpressionAST().visit(this);
        return null;
    }

    @Override
    public Object visitCallSingleCommandAST(CallSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText() +" ( ");
        ctx.getExpression().visit(this);
        return null;
    }

    @Override
    public Object visitIfSingleCommandAST(IfSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getExpression().visit(this);
        ctx.getThenSingleCommand().visit(this);
        ctx.getElseSingleCommand().visit(this);
        return null;
    }


    @Override
    public Object visitWhileSingleCommandAST(WhileSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getExpression().visit(this);
        ctx.getSingleCommand().visit(this);
        return null;
    }

    @Override
    public Object visitLetSingleCommandAST(LetSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getDeclaration().visit(this);
        ctx.getSingleCommand().visit(this);
        return null;
    }

    @Override
    public Object visitBlockSingleCommandAST(BlockSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getCommand().visit(this);
        return null;
    }

    @Override
    public Object visitDeclarationAST(DeclarationAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getSingleDeclaration().visit(this);

        if(!ctx.getSingleDeclarationList().isEmpty()){
            for (int i = 0; i < ctx.getSingleDeclarationList().size(); i++) {
                ctx.getSingleDeclarationList().get(i).visit(this);
            }
        }

        return null;
    }

    @Override
    public Object visitConsSingleDeclarationAST(ConsSingleDeclarationAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText() + " ~ ");
        ctx.getExpression().visit(this);
        return null;
    }

    @Override
    public Object visitVarSingleDeclarationAST(VarSingleDeclarationAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText() + " : ");
        ctx.getTypeDenoter().visit(this);
        return null;
    }

    @Override
    public Object visitTypeDenoterAST(TypeDenoterAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText());
        return null;
    }

    @Override
    public Object visitExpressionAST(ExpressionAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        ctx.getPrimaryExpression().visit(this);

        if(!ctx.getPrimaryExpressionList().isEmpty()){
            for (int i = 0; i < ctx.getPrimaryExpressionList().size(); i++) {
                ctx.getPrimaryExpressionList().get(i).visit(this);
            }
        }
        return null;
    }

    @Override
    public Object visitNumPrimaryExpressionAST(NumPrimaryExpressionAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        return null;
    }

    @Override
    public Object visitIdPrimaryExpressionAST(IdPrimaryExpressionAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        return null;
    }

    @Override
    public Object visitGroupPrimaryExpressionAST(GroupPrimaryExpressionAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getExpression());
        return null;
    }

    @Override
    public Object visitOperatorAST(OperatorAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getOperator().getText());
        return null;
    }
}
