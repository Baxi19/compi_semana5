package ast;

import java.util.ArrayList;

//Class DeclarationAST
public class DeclarationAST extends AST{
    private SingleDeclarationAST singleDeclaration;
    private ArrayList<SingleDeclarationAST> singleDeclarationList ;

    //Constructor

    public DeclarationAST(SingleDeclarationAST singleDeclaration) {
        this.singleDeclaration = singleDeclaration;
        this.singleDeclarationList = new ArrayList<>();
    }

    //Getter
    public SingleDeclarationAST getSingleDeclaration() {
        return singleDeclaration;
    }

    public SingleDeclarationAST getSingleDeclaration(int i) {
        return singleDeclarationList.get(i);
    }

    public ArrayList<SingleDeclarationAST> getSingleDeclarationList() {
        return singleDeclarationList;
    }

    //AST Method
    @Override
    public Object visit(Visitor visitor) {
        return visitor.visitDeclarationAST(this);
    }
}
