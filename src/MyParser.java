import generated.Scanner;
import org.antlr.v4.runtime.CommonToken;

import java.text.ParseException;


public class MyParser {
    private CommonToken tokenActual;
    private Scanner scanner;


    public MyParser(Scanner s) {
        this.scanner = s;
    }

    private void accept(int tokenEsperado){
        if(tokenActual.getType() == tokenEsperado ){
            tokenActual = ( CommonToken ) scanner.nextToken();

        }else{
            System.out.println("\nError (" +tokenActual.getLine() + tokenActual.getCharPositionInLine()  +"): Se espera : " + Scanner.VOCABULARY.getLiteralName(tokenEsperado)
            + " pero viene : ' " + tokenActual.getText() + "'");
            System.out.println("Fila : " + tokenActual.getLine()
                            + " Columna: " + tokenActual.getCharPositionInLine());
        }

    }

    private void accepIt(){
        tokenActual = ( CommonToken ) scanner.nextToken();
    }

    public void parse(){
        tokenActual = ( CommonToken ) scanner.nextToken();
        parseProgram();
    }

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
                // Crear errores
                // Overrite Sintax Errors, para la progra
                System.out.println("\nError: Se que venga [ASSING, L_PARENT] pero viene : " + tokenActual.getText());
                System.out.println("Fila : " + tokenActual.getLine()
                                + " Columna: " + tokenActual.getCharPositionInLine());
            }

        }else if(tokenActual.getType() == Scanner.IF){
            accepIt();
            parseExpression();
            accept(Scanner.THEN);
            parseSingleCommand();
            accept(Scanner.ELSE);
            parseSingleCommand();
        }else if(tokenActual.getType() == Scanner.WHILE){

        }else if(tokenActual.getType() == Scanner.LET){

        }else if(tokenActual.getType() == Scanner.BEGIN){

        }else{
            System.out.println("\nError: Se que venga [ID, IF, WHILE, LET, BEGIN] pero viene : " + tokenActual.getText());
            System.out.println("Fila : " + tokenActual.getLine()
                            + " Columna: " + tokenActual.getCharPositionInLine());
        }
    }

    private void parseDeclaration(){

    }

    private void parseSingleDeclaration(){

    }

    private void parseTypeDenoter(){

    }

    private void parseExpression(){
        System.out.println("Estoy en Expression");
    }

    private void parsePrimaryExpression(){

    }
}
