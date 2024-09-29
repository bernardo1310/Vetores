import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o número: %d - ", (i + 1));
            numeros[i] = read.nextInt();
        }

        System.out.println("Os números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        read.close();
    }
}
