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
                //Show Parser Errors
                int size = p.errors.size();
                if(size > 0){
                    System.out.println("Compilation: Failed");
                    for (int i = 0; i < size; i++) {
                        System.out.println((i+1) +") " +  p.errors.get(i));
                    }
                }
                else{
                    System.out.println("Compilation: Successful");
                }

            }catch (Exception e){
                System.out.println("Compilation: Failed => " + e);
            };
        }catch(Exception e){
            System.out.println("The file doesn't exist!");
            e.printStackTrace();
        }
    }
}
