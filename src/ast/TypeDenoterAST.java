package ast;

import org.antlr.v4.runtime.CommonToken;

//Class TypeDenoterAST
public class TypeDenoterAST extends AST {


    private CommonToken id;

    //Constructor
    public TypeDenoterAST(CommonToken id) {
        this.id = id;
    }

    //Getter
    public CommonToken getId() {
        return id;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitTypeDenoterAST(this);
    }


}
