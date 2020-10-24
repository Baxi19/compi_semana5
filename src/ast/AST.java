package ast;

//Class AST
public abstract class AST {
    public abstract Object visit(Visitor v);
}
