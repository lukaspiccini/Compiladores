import org.antlr.v4.runtime.*; // class ANTLRInputStream , Token
import java.io.*;
public class Numbers {
    public static void main(String[] args) throws Exception {
        NumbersLexer lexer;
        Token tk;

        try {
            File input = new File("entrada.txt");
            FileInputStream fin = new FileInputStream(input);
            lexer = new NumbersLexer(new ANTLRInputStream(fin));

        } catch (Exception e) {
            // Pikachu!
            System.out.println("Erro:" + e);
            System.exit(1);
            return;
        }

        // Le da entrada padrao ateh chegar digitar CTRL-D (Linux/Mac)
        // ou CTRL-Z (Windows)

        do {
            tk = lexer.nextToken();
            switch(tk.getType()) {
                case NumbersLexer.BINARY:
                    System.out.println("INTEIRO BINARIO: " + tk.getText());
                    break;


                case NumbersLexer.DECIMAL:
                    System.out.println("INTEIRO DECIMAL: " + tk.getText());
                    break;

                case NumbersLexer.REAL:
                    System.out.println("REAL DECIMAL: " + tk.getText());
                    break;

                case NumbersLexer.HEXADECIMAL:
                    System.out.println("INTEIRO HEXADECIMAL: " + tk.getText());
                    break;


            }
        } while (tk != null && tk.getType() != Token.EOF);

    }
}