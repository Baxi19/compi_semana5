package parser;

import ast.*;
import generated.Scanner;
import org.antlr.v4.runtime.Token;

//Randald Villegas Brenes
//Compiladores e interpretes

//Class Parser's Manual
public class Parser {
    private Token tokenActual;
    private Scanner scanner;


    public Parser(Scanner scanner){
        this.scanner = scanner;
    }

    private void accept(int tokenEsperado){
        if(tokenActual.getType() == tokenEsperado){
            tokenActual = scanner.nextToken();
        }else{
            System.err.println("Error (" + tokenActual.getLine() + "," + tokenActual.getCharPositionInLine() + ")." +
                    " Se espera " + Scanner.VOCABULARY.getLiteralName(tokenEsperado) + " pero viene '" + tokenActual.getText() + "'");
            tokenActual = (Token) scanner.nextToken();
        }
    }

    private void acceptIt(){
        tokenActual = (Token) scanner.nextToken();
    }

    public AST parse(){
        acceptIt();
        ProgramAST raiz = parseProgram();
        return raiz;
    }

    private ProgramAST parseProgram(){
        ProgramAST ctx;
        SingleCommandAST singleCommand = parseSingleCommand();
        ctx = new ProgramAST(singleCommand);
        return ctx;
    }

    private CommandAST parseCommand(){
        CommandAST ctx = new CommandAST(parseSingleCommand());
        while(tokenActual.getType() == scanner.PyCOMMA){
            ctx.getPyCommas().add(tokenActual);
            acceptIt();
            ctx.getSingleCommands().add(parseSingleCommand());
        }
        return ctx;
    }

    private SingleCommandAST parseSingleCommand(){
        SingleCommandAST ctx;
        if(tokenActual.getType() == scanner.IDENT){
            Token id =  tokenActual;
            acceptIt();
            Token ASSING  = tokenActual;
            accept(scanner.ASSING);
            ctx = new AssingSCAST(id, ASSING, parseExpression());
        //Id
        }else if(tokenActual.getType() == scanner.IDENT){
            Token id = tokenActual;
            acceptIt();
            Token PIZQ = tokenActual;
            accept(scanner.L_PARENT);
            ExpressionAST expression = parseExpression();
            Token PDER = tokenActual;
            accept(scanner.R_PARENT);
            ctx = new CallFunSCAST(id,PIZQ,expression,PDER);
        //If
        }else if(tokenActual.getType() == scanner.IF){
            Token IF  = tokenActual;
            acceptIt();
            ExpressionAST expression = parseExpression();
            Token THEN  = tokenActual;
            accept(scanner.THEN);
            SingleCommandAST singleCommand2 = parseSingleCommand();
            Token ELSE  = tokenActual;
            accept(scanner.ELSE);
            ctx = new IfSCAST(IF,expression,THEN,singleCommand2,ELSE,parseSingleCommand());
        //While
        }else if(tokenActual.getType() == scanner.WHILE){
            Token WHILE = tokenActual;
            acceptIt();
            ExpressionAST expression = parseExpression();
            Token DO  = tokenActual;
            accept(scanner.DO);
            SingleCommandAST singleCommand2 = parseSingleCommand();
            ctx = new WhileSCAST(WHILE,expression,DO,singleCommand2);
        //Let
        }else if(tokenActual.getType() == scanner.LET){
            Token LET  = tokenActual;
            acceptIt();
            DeclarationAST declaration = parseDeclaration();
            Token IN  = tokenActual;
            accept(scanner.IN);
            SingleCommandAST singleCommand2 = parseSingleCommand();
            ctx = new LetSCAST(LET,declaration,IN, singleCommand2);
        //Begin
        }else if(tokenActual.getType() == scanner.BEGIN){
            Token BEGIN  = tokenActual;
            acceptIt();
            CommandAST command = parseCommand();
            Token END  = tokenActual;
            accept(scanner.END);
            ctx = new BeginSCAST(BEGIN,command,END);

        }else{
            System.err.println("Error (" + tokenActual.getLine() + "," + tokenActual.getCharPositionInLine() + ")." +
                    " Se espera " + "[ID, IF, WHILE, LET, BEGIN]" + " pero viene " + tokenActual.getText());
            return null;
        }
        return ctx;
    }

    private DeclarationAST parseDeclaration(){
        DeclarationAST ctx = new DeclarationAST(parseSingleDeclaration());
        while(tokenActual.getType() == scanner.PyCOMMA){
            ctx.getPyCommas().add(tokenActual);
            acceptIt();
            ctx.getSingleDeclarations().add(parseSingleDeclaration());
        }
        return ctx;
    }

    private SingleDeclarationAST parseSingleDeclaration(){
        SingleDeclarationAST ctx;
        //Const
        if(tokenActual.getType() == scanner.CONST){
            Token CONST = tokenActual;
            acceptIt();
            Token IDENT = tokenActual;
            accept(scanner.IDENT);
            Token VIR = tokenActual;
            accept(scanner.VIR);
            ExpressionAST expression = parseExpression();
            ctx = new ConstSingleDeclarationAST(CONST, IDENT, VIR, expression);
        //Var
        }else if(tokenActual.getType() == scanner.VAR){
            Token VAR = tokenActual;
            acceptIt();
            Token IDENT1 = tokenActual;
            accept(scanner.IDENT);
            Token DOSPUN = tokenActual;
            accept(scanner.TWO_P);
            Token IDENT2 = tokenActual;
            accept(scanner.IDENT);
            ctx = new VarSingleDeclarationAST(VAR, IDENT1, DOSPUN, IDENT2);

        }else{
            System.err.println("Error (" + tokenActual.getLine() + "," + tokenActual.getCharPositionInLine() + ")." +
                    " Se espera " + "[CONST, VAR]" + " pero viene " + tokenActual.getText());
            return null;
        }
        return ctx;
    }

    private ExpressionAST parseExpression(){
        ExpressionAST ctx = new ExpressionAST(parsePrimaryExpression());
        while (tokenActual.getType() == scanner.SUM || tokenActual.getType() == scanner.SUB || tokenActual.getType() == scanner.MUL || tokenActual.getType() == scanner.DIV) {
            ctx.getOperators().add(parseOperator());
            ctx.getPrimaryExpressions().add(parsePrimaryExpression());
        }
        return ctx;
    }

    private PrimaryExpressionAST parsePrimaryExpression(){
        PrimaryExpressionAST ctx;
        if(tokenActual.getType()== scanner.LITERAL){
            ctx = new NumPrimaryExpressionAST(tokenActual);
            acceptIt();

        }else if(tokenActual.getType()== scanner.IDENT){
            ctx = new IdentPrimaryExpressionAST(tokenActual);
            acceptIt();

        }else if(tokenActual.getType() == scanner.L_PARENT){
            Token PIZQ = tokenActual;
            acceptIt();
            ExpressionAST expression = parseExpression();
            Token PDER = tokenActual;
            accept(scanner.R_PARENT);
            ctx = new GroupPrimaryExpressionAST(PIZQ, expression, PDER);

        }else{
            System.err.println("Error (" + tokenActual.getLine() + "," + tokenActual.getCharPositionInLine() + ")." +
                    " Se espera " + "[LIT, ID, PIZQ]" + " pero viene " + tokenActual.getText());
            return null;
        }
        return ctx;
    }

    private OperatorAST parseOperator(){
        OperatorAST ctx;
        if(tokenActual.getType() == scanner.SUM){
            ctx = new SumOperatorAST(tokenActual);
            acceptIt();
        }
        else if(tokenActual.getType() == scanner.SUB){
            ctx = new SubOperatorAST(tokenActual);
            acceptIt();
        }
        else if(tokenActual.getType() == scanner.MUL){
            ctx = new MulOperatorAST(tokenActual);
            acceptIt();
        }
        else if(tokenActual.getType() == scanner.DIV){
            ctx = new DivOperatorAST(tokenActual);
            acceptIt();
        }
        else{
            System.err.println("Error (" + tokenActual.getLine() + "," + tokenActual.getCharPositionInLine() + ")." +
                    " Se espera " + "['+','-','*','/']" + " pero viene " + tokenActual.getText());
            return null;
        }
        return ctx;
    }
}
