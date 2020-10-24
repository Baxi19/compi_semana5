import ast.*;
import generated.Scanner;
import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

//Tarea #1
//Randald Villegas Brenes
//Compiladores e interpretes

public class MyParser {
    private CommonToken tokenActual;
    private Scanner scanner;
    public ArrayList<String> errors = new ArrayList<>();

    public MyParser(Scanner s) {
        this.scanner = s;
    }

    private void accept(int tokenEsperado){
        if(tokenActual.getType() == tokenEsperado ){
            tokenActual = ( CommonToken ) scanner.nextToken();
        }else{
             errors.add("Error (" +tokenActual.getLine()+", "+ tokenActual.getCharPositionInLine()  +"): " +
                        " Se espera : " + Scanner.VOCABULARY.getLiteralName(tokenEsperado) +
                        " pero viene : ' " + tokenActual.getText() + "'");

        }

    }

    private void accepIt(){
        tokenActual = ( CommonToken ) scanner.nextToken();
    }

    public AST parse(){
        tokenActual = ( CommonToken ) scanner.nextToken();
        ProgramAST raiz = parseProgram();
        return raiz;
    }

    //Alpha Grammar
    private ProgramAST parseProgram(){
        ProgramAST ctx;
        SingleCommandAST singleCommand = parseSingleCommand();
        ctx = new ProgramAST(singleCommand);
        return ctx;
    }

    private CommandAST parseCommand(){
        CommandAST ctx;
        SingleCommandAST sc1 = parseSingleCommand();
        ctx = new CommandAST(sc1);

        while (tokenActual.getType() == Scanner.PyCOMMA){
            accepIt();
            SingleCommandAST scAux = parseSingleCommand();
            ctx.getSingleCommandList().add(scAux);
        }
        return  ctx;
    }

    private SingleCommandAST parseSingleCommand(){
        SingleCommandAST ctx = null;
        //Identifier
        if(tokenActual.getType() == Scanner.IDENT){
            CommonToken id = tokenActual;
            accepIt();
            if(tokenActual.getType() == Scanner.ASSING){
                accepIt();
                ExpressionAST expression = parseExpression();
                ctx = new AssingSingleCommandAST(id, expression);
            }else if(tokenActual.getType() == Scanner.L_PARENT){
                accepIt();
                ExpressionAST expression = parseExpression();
                accept(Scanner.R_PARENT);
                ctx = new CallSingleCommandAST(id, expression);
            }else{
                errors.add("Error (" +tokenActual.getLine()+", "+ tokenActual.getCharPositionInLine()  +"): " +
                                    " Se que venga [ASSING, L_PARENT] pero viene : " + tokenActual.getText());
            }

        }
        //If
        else if(tokenActual.getType() == Scanner.IF){
            accepIt();
            parseExpression();
            accept(Scanner.THEN);
            parseSingleCommand();
            accept(Scanner.ELSE);
            parseSingleCommand();
        }
        //while
        else if(tokenActual.getType() == Scanner.WHILE){
            accepIt();
            parseExpression();
            accept(Scanner.DO);
            parseSingleCommand();
        }
        //let
        else if(tokenActual.getType() == Scanner.LET){
            accepIt();
            parseDeclaration();
            accept(Scanner.IN);
            parseSingleCommand();
        }
        //begin
        else if(tokenActual.getType() == Scanner.BEGIN){
            accepIt();
            parseCommand();
            accept(Scanner.END);
        }
        //error
        else{
            errors.add("Error (" +tokenActual.getLine()+", "+ tokenActual.getCharPositionInLine()  +"): " +
                    " Se que venga [ID, IF, WHILE, LET, BEGIN] pero viene : " + tokenActual.getText());

        }
        return ctx;
    }

    private void parseDeclaration(){
        parseSingleDeclaration();
        while (tokenActual.getType() == Scanner.PyCOMMA){
            accepIt();
            parseSingleDeclaration();
        }
    }

    private void parseSingleDeclaration(){
        //Const
        if(tokenActual.getType() == Scanner.CONST){
            accepIt();
            accept(Scanner.IDENT);
            accept(Scanner.VIR);
            parseExpression();
        }
        //Var
        else if(tokenActual.getType() == Scanner.VAR){
            accepIt();
            accept(Scanner.IDENT);
            accept(Scanner.TWO_P);
            //parseTypeDenoter();
            accept(Scanner.IDENT);
        }
        //Error
        else{
           errors.add("Error (" +tokenActual.getLine()+", "+ tokenActual.getCharPositionInLine()  +"): " +
                    " Se que venga [CONS, VAR] pero viene : " + tokenActual.getText());

        }
    }

    private ExpressionAST parseExpression(){
        parsePrimaryExpression();
        while (checkOperator(tokenActual.getText())){
            accepIt();
            parsePrimaryExpression();
        }

        //TODO: Hecer el metodo
        return null;
    }

    private Boolean checkOperator(String operator){
        switch (operator) {
            case ":=":
            case "/=":
            case "==":
            case "<=":
            case ">=":
            case "+":
            case "-":
            case "*":
            case "<":
            case ">":
            case "/":
                return true;
        }
        return false;
    }

    private void parsePrimaryExpression(){
        //Literal
        if(tokenActual.getType() == Scanner.LITERAL){
            accepIt();
        }
        //Ident
        else if(tokenActual.getType() == Scanner.IDENT){
            accepIt();
        }
        //Expression
        else if(tokenActual.getType() == Scanner.L_PARENT){
            accepIt();
            parseExpression();
            accept(Scanner.R_PARENT);
        }
        //Error
        else{
            errors.add("Error (" +tokenActual.getLine()+", "+ tokenActual.getCharPositionInLine()  +"): " +
                    " Se que venga [Literal, Ident, Expression] pero viene : " + tokenActual.getText());
        }
    }
}
