import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
            vetor1[i] = read.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
            vetor2[i] = read.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetor3[i * 2] = vetor1[i];
            vetor3[i * 2 + 1] = vetor2[i];
        }

        System.out.println("\nVetor resultante:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor3[i] + " ");
        }

        read.close();
    }
}
