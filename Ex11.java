import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite várias palavras separadas por ';': ");
        String entrada = read.nextLine();

        String[] palavras = entrada.split(";");
        
        System.out.println("Palavras separadas:");
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

        read.close();
    }
}
