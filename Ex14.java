import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alturas = new double[30];
        double somaAlturas = 0;
        int contAcima13 = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = read.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + ": ");
            alturas[i] = read.nextDouble();
            somaAlturas += alturas[i];
        }

        double mediaAltura = somaAlturas / 30;

        for (int i = 0; i < 30; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contAcima13++;
            }
        }

        System.out.println("Número de alunos com mais de 13 anos e altura inferior à média: " + contAcima13);
        read.close();
    }
}
