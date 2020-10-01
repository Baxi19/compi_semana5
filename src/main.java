import generated.Scanner;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class main {
    public static void main(String[] args) {
        Scanner inst = null;
        CharStream input = null;
        ParseTree tree = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new generated.Scanner(input);

            MyParser p = new MyParser(inst);
            try {
                p.parse();
            }catch (Exception e){
                System.out.println("Error: " + e);
            };


            System.out.println("Compilacion Terminada");
        }catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }
}
