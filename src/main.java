import ast.*;
import generated.Scanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.Parser;

//Class Main
public class main {
    public static void main(String[] args) {
        Scanner scanner = null;
        CharStream input = null;
        CommonTokenStream tokens = null;
        AST tree;

        try {
            input = CharStreams.fromFileName("test.txt");
            scanner = new generated.Scanner(input);
            Parser parser = new Parser(scanner);
            tree = parser.parse();
            tree.visit(new PrintAST());
            System.out.println("Compilation: Successful");
        }catch(Exception e){
            System.out.println("The file doesn't exist!");
            e.printStackTrace();
        }
    }
}
