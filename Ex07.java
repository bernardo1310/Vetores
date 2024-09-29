import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d° número: ", (i + 1));
            numeros[i] = read.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.printf("\nSoma: %d\n", soma);
        System.out.printf("Multiplicação: %d\n", multiplicacao);

        read.close();
    }
}
