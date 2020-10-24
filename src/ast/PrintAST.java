package ast;

public class PrintAST implements Visitor {
    @Override
    public Object visitProgram(ProgramAST ctx) {
         System.out.println("Program\n");
         ctx.singleCommand.visit(this);
         return null;
    }

    @Override
    public Object visitCommand(CommandAST ctx) {
        System.out.println("Command\n");
        ctx.singleCommand.visit(this);
        for(int i = 0;i < ctx.pyCommas.size(); i++){
            System.out.println(ctx.pyCommas.get(i).getText());
            ctx.singleCommands.get(i).visit(this);
        }
        return null;
    }

    @Override
    public Object visitAssingSC(AssingSCAST ctx) {
        System.out.println("AssingSC\n");
        System.out.println(ctx.ID.getText() + "\n");
        ctx.expression.visit(this);
        return null;
    }

    @Override
    public Object visitCallFunSC(CallFunSCAST ctx) {
         System.out.println("Call function\n");
         System.out.println(ctx.IDENT.getText() + "\n");
         System.out.println(ctx.PDER.getText() + "\n");
         System.out.println(ctx.PDER.getText() + "\n");
         ctx.expression.visit(this);
         return null;
    }

    @Override
    public Object visitIfSC(IfSCAST ctx) {
         System.out.println("If\n");
         ctx.expression.visit(this);
         System.out.println(ctx.THEN.getText() + "\n");
         ctx.singleCommand1.visit(this);
         System.out.println(ctx.ELSE.getText() + "\n");
         ctx.singleCommand2.visit(this);
         return null;
    }

    @Override
    public Object visitWhileSC(WhileSCAST ctx) {
        System.out.println("While\n");
        ctx.expression.visit(this);
        System.out.println(ctx.DO.getText() + "\n");
        ctx.singleCommand.visit(this);
         return null;
    }

    @Override
    public Object visitLetSC(LetSCAST ctx) {
        System.out.println("let\n");
        ctx.declaration.visit(this);
        System.out.println(ctx.IN.getText() + "\n");
        ctx.singleCommand.visit(this);
         return null;
    }

    @Override
    public Object visitBeginSC(BeginSCAST ctx) {
        System.out.println("Begin\n");
        ctx.command.visit(this);
        System.out.println(ctx.END.getText() + "\n");
         return null;
    }

    @Override
    public Object visitDeclaration(DeclarationAST ctx) {
        System.out.println("declaration");
        ctx.singleDeclaration.visit(this);
        for(int i = 0; i < ctx.pyCommas.size(); i++){
            System.out.println(ctx.pyCommas.get(i).getText());
            ctx.singleDeclarations.get(i).visit(this);
        }
         return null;
    }

    @Override
    public Object visitConstSingleDeclaration(ConstSingleDeclarationAST ctx)
    {
        System.out.println("Const decl\n");
        System.out.println(ctx.CONST.getText() + "\n");
        System.out.println(ctx.IDENT.getText() + "\n");
        System.out.println(ctx.VIR.getText() + "\n");
        ctx.expression.visit(this);
        return null;
    }

    @Override
    public Object visitVarSingleDeclaration(VarSingleDeclarationAST ctx) {
        System.out.println("Var decl\n");
        System.out.println(ctx.VAR.getText() + "\n");
        System.out.println(ctx.IDENT1.getText() + "\n");
        System.out.println(ctx.DOSPUN.getText() + "\n");
        System.out.println(ctx.IDENT2.getText() + "\n");
         return null;
    }

    @Override
    public Object visitExpression(ExpressionAST ctx) {
        System.out.println("Expression\n");
        ctx.primaryExpression.visit(this);
        for(int i = 0; i < ctx.operators.size(); i++){
            ctx.operators.get(i).visit(this);
            ctx.primaryExpressions.get(i).visit(this);
        }
        return null;
    }

    @Override
    public Object visitNumPrimaryExpression(NumPrimaryExpressionAST ctx) {
        System.out.println("Num PE\n");
        System.out.println(ctx.NUM.getText() + "\n");
         return null;
    }

    @Override
    public Object visitIdentPrimaryExpression(IdentPrimaryExpressionAST ctx) {
        System.out.println("ident PE\n");
        System.out.println(ctx.IDENT.getText() + "\n");
         return null;
    }

    @Override
    public Object visitGroupPrimaryExpression(GroupPrimaryExpressionAST ctx) {
        System.out.println("Group PE\n");
        System.out.println(ctx.PIZQ.getText() + "\n");
        ctx.expression.visit(this);
        System.out.println(ctx.PDER.getText() + "\n");
        return null;
    }

    @Override
    public Object visitSumOperator(SumOperatorAST ctx) {
        System.out.println("SUM Op\n");
        System.out.println(ctx.SUM.getText() + "\n");
         return null;
    }

    @Override
    public Object visitSubOperator(SubOperatorAST ctx) {
        System.out.println("Sub Op\n");
        System.out.println(ctx.SUB.getText() + "\n");
         return null;
    }

    @Override
    public Object visitMulOperator(MulOperatorAST ctx) {
        System.out.println("Mul Op\n");
        System.out.println(ctx.MUL.getText() + "\n");
        return null;
    }

    @Override
    public Object visitDivOperator(DivOperatorAST ctx) {
        System.out.println("Div Op\n");
        System.out.println(ctx.DIV.getText() + "\n");
        return null;
    }
}
