import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a nota %d: ", (i + 1));
            notas[i] = read.nextDouble();
            soma += notas[i];
        }

        System.out.println("As notas são:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota %d: %.2f\n", (i + 1), notas[i]);
        }

        double media = soma / 4;
        System.out.printf("A média das notas é: %.2f\n", media);

        read.close();
    }
}
