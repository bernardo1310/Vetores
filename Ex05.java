import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPares = 0, contImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o %d° número: ", (i + 1));
            numeros[i] = read.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[contPares] = numeros[i];
                contPares++;
            } else {
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        System.out.println("Números lidos:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }
        
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        read.close();
    }
}
