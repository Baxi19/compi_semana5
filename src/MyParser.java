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

    public void parse(){
        tokenActual = ( CommonToken ) scanner.nextToken();
        parseProgram();
    }

    //Alpha Grammar
    private void parseProgram(){
        parseSingleCommand();
    }

    private void parseCommand(){
        parseSingleCommand();
        while (tokenActual.getType() == Scanner.PyCOMMA){
            accepIt();
            parseSingleCommand();
        }
    }

    private void parseSingleCommand(){
        //Identifier
        if(tokenActual.getType() == Scanner.IDENT){
            accepIt();
            if(tokenActual.getType() == Scanner.ASSING){
                accepIt();
                parseExpression();
            }else if(tokenActual.getType() == Scanner.L_PARENT){
                accepIt();
                parseExpression();
                accept(Scanner.R_PARENT);
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

    private void parseExpression(){
        parsePrimaryExpression();
        while (checkOperator(tokenActual.getText())){
            accepIt();
            parsePrimaryExpression();
        }
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
                System.out.println(operator);
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
