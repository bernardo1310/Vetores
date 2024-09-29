import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] caracteres = new char[10];
        int contConsoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o caractere %d: ", (i + 1));
            caracteres[i] = read.next().charAt(0);
        }

        System.out.println("As consoantes lidas são:");
        for (int i = 0; i < 10; i++) {
            char c = Character.toLowerCase(caracteres[i]);
            if (c >= 'a' && c <= 'z' && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                System.out.print(caracteres[i] + " ");
                contConsoantes++;
            }
        }
        System.out.printf("\nTotal de consoantes: %d\n", contConsoantes);
        read.close();
    }
}
