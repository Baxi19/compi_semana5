import generated.Scanner;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        Scanner inst = null;
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new generated.Scanner(input);
            MyParser p = new MyParser(inst);
            try {
                p.parse();
                int size = p.errors.size();
                //Show Sintax Errors
                for (int i = 0; i < size; i++) {
                    System.out.println("Sintaxis => " +  p.errors.get(i));
                }
                System.out.println("Compilacion Terminada");
            }catch (Exception e){
                System.out.println("Error al compilar: " + e);
            };
        }catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }
}
