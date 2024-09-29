import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        final int N = 10;
        int[] valores = new int[N];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um valor entre 0 e 20: ");
            int valor = read.nextInt();
            while (valor < 0 || valor > 20) {
                System.out.print("Valor inválido. Digite um valor entre 0 e 20: ");
                valor = read.nextInt();
            }
            valores[i] = valor;
        }

        System.out.println("Gráfico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        read.close();
    }
}
