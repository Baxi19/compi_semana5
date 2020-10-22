package ast;

public abstract  class AST {
    public  abstract  Object visit(Visitor visitor);
}
