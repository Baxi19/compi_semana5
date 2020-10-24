package ast;

//Class PrintAST
public class PrintAST implements Visitor {
    private int cantTabs=0;

    private String printTabs(int cantTabs){
        String res="";
        for(int i=0; i< cantTabs;i++)
            res+="\t";
        return res;
    }

    @Override
    public Object visitProgram(ProgramAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.singleCommand.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitCommand(CommandAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.singleCommand.visit(this);
        cantTabs--;
        for(int i = 0;i < ctx.pyCommas.size(); i++){
            //System.out.println(ctx.pyCommas.get(i).getText());
            cantTabs++;
            ctx.singleCommands.get(i).visit(this);
            cantTabs--;
        }
        return null;
    }

    @Override
    public Object visitAssingSC(AssingSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        //System.out.println(ctx.ID.getText() + "\n");
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitCallFunSC(CallFunSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        //System.out.println(ctx.IDENT.getText() + "\n");
        //System.out.println(ctx.PDER.getText() + "\n");
        //System.out.println(ctx.PDER.getText() + "\n");
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitIfSC(IfSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs--;
        //System.out.println(ctx.THEN.getText() + "\n");
        cantTabs++;
        ctx.singleCommand1.visit(this);
        cantTabs--;
        //System.out.println(ctx.ELSE.getText() + "\n");
        cantTabs++;
        ctx.singleCommand2.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitWhileSC(WhileSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs--;
        //System.out.println(ctx.DO.getText() + "\n");
        cantTabs++;
        ctx.singleCommand.visit(this);
        cantTabs--;
         return null;
    }

    @Override
    public Object visitLetSC(LetSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.declaration.visit(this);
        cantTabs--;
        //System.out.println(ctx.IN.getText() + "\n");
        cantTabs++;
        ctx.singleCommand.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitBeginSC(BeginSCAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.command.visit(this);
        cantTabs--;
        //System.out.println(ctx.END.getText() + "\n");
        return null;
    }

    @Override
    public Object visitDeclaration(DeclarationAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.singleDeclaration.visit(this);
        cantTabs--;
        for(int i = 0; i < ctx.pyCommas.size(); i++){
            //System.out.println(ctx.pyCommas.get(i).getText());
            cantTabs++;
            ctx.singleDeclarations.get(i).visit(this);
            cantTabs--;
        }
         return null;
    }

    @Override
    public Object visitConstSingleDeclaration(ConstSingleDeclarationAST ctx){
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        //System.out.println(ctx.CONST.getText() + "\n");
        //System.out.println(ctx.IDENT.getText() + "\n");
        //System.out.println(ctx.VIR.getText() + "\n");
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs--;
        return null;
    }

    @Override
    public Object visitVarSingleDeclaration(VarSingleDeclarationAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs) + "=> "+ctx.VAR.getText() + " " + ctx.IDENT1.getText() + " " + ctx.DOSPUN.getText() + " " + ctx.IDENT2.getText());
        //System.out.println(ctx.IDENT1.getText() + "\n");
        //System.out.println(ctx.DOSPUN.getText() + "\n");
        //System.out.println(ctx.IDENT2.getText() + "\n");
         return null;
    }

    @Override
    public Object visitExpression(ExpressionAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        cantTabs++;
        ctx.primaryExpression.visit(this);
        cantTabs--;
        for(int i = 0; i < ctx.operators.size(); i++){
            cantTabs++;
            ctx.operators.get(i).visit(this);
            cantTabs--;
            cantTabs++;
            ctx.primaryExpressions.get(i).visit(this);
            cantTabs--;
        }
        return null;
    }

    @Override
    public Object visitNumPrimaryExpression(NumPrimaryExpressionAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.NUM.getText() + "\n");
        return null;
    }

    @Override
    public Object visitIdentPrimaryExpression(IdentPrimaryExpressionAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.IDENT.getText() + "\n");
        return null;
    }

    @Override
    public Object visitGroupPrimaryExpression(GroupPrimaryExpressionAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        //System.out.println(ctx.PIZQ.getText() + "\n");
        cantTabs++;
        ctx.expression.visit(this);
        cantTabs++;
        //System.out.println(ctx.PDER.getText() + "\n");
        return null;
    }

    @Override
    public Object visitSumOperator(SumOperatorAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.SUM.getText() + "\n");
        return null;
    }

    @Override
    public Object visitSubOperator(SubOperatorAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.SUB.getText() + "\n");
        return null;
    }

    @Override
    public Object visitMulOperator(MulOperatorAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.MUL.getText() + "\n");
        return null;
    }

    @Override
    public Object visitDivOperator(DivOperatorAST ctx) {
        System.out.println(printTabs(cantTabs)+ctx.getClass().getSimpleName());
        System.out.println(printTabs(cantTabs)+ "=> " +ctx.DIV.getText() + "\n");
        return null;
    }
}
