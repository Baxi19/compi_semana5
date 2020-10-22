package ast;

public interface Visitor {

    public Object visitProgramAST(ProgramAST ctx);
    public Object visitCommandAST(CommandAST ctx);
    public Object visitAssingSingleCommandAST(AssingSingleCommandAST ctx);
    public Object visitCallSingleCommandAST(CallSingleCommandAST ctx);

    //TODO: crear patrones faltantes


}
