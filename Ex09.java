import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = read.nextLine();
        char[] caracteres = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            caracteres[i] = texto.charAt(i);
        }

        System.out.println("Texto armazenado no vetor:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }

        read.close();
    }
}
