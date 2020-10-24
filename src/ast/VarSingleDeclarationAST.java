package ast;

import org.antlr.v4.runtime.CommonToken;

//Class VarSingleDeclarationAST
public class VarSingleDeclarationAST extends SingleDeclarationAST {
    private CommonToken id;
    private TypeDenoterAST typeDenoter;

    //Constructor
    public VarSingleDeclarationAST(CommonToken id, TypeDenoterAST typeDenoter) {
        this.id = id;
        this.typeDenoter = typeDenoter;
    }

    //Getter
    public CommonToken getId() {
        return id;
    }

    public TypeDenoterAST getTypeDenoter() {
        return typeDenoter;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitVarSingleDeclarationAST(this);
    }
}
