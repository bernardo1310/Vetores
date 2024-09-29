import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o número %d: ", (i + 1));
            numeros[i] = read.nextDouble();
        }

        System.out.println("Os números na ordem inversa são:");
        for (int i = 9; i >= 0; i--) {
            System.out.printf("%.2f ", numeros[i]);
        }

        read.close();
    }
}
