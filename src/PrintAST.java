import ast.*;

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
        //TODO: visitCommandAST
        return null;
    }

    @Override
    public Object visitAssingSingleCommandAST(AssingSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        System.out.println(ctx.getId().getText());
        //TODO: ctx.getExpressionAST()
        //ctx.getExpressionAST().visit(this);
        return null;
    }

    @Override
    public Object visitCallSingleCommandAST(CallSingleCommandAST ctx) {
        System.out.println(ctx.getClass().getSimpleName());
        //TODO: visitCallSingleCommandAST
        return null;
    }
}
