import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] medias = new double[10];
        int alunosAprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            System.out.printf("Aluno %d:\n", (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota %d: ", (j + 1));
                double nota = read.nextDouble();
                soma += nota;
            }
            medias[i] = soma / 4;

            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        System.out.printf("Número de alunos com média maior ou igual a 7.0: %d\n", alunosAprovados);
        
        read.close();
    }
}
