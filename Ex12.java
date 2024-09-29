import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = read.nextInt();
            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            alturas[i] = read.nextDouble();
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }

        double mediaIdade = somaIdades / 5.0;
        double mediaAltura = somaAlturas / 5.0;

        int maisVelho = idades[0], maisNovo = idades[0];
        double maisAlto = alturas[0], maisBaixo = alturas[0];

        for (int i = 1; i < 5; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
            }
            if (alturas[i] > maisAlto) {
                maisAlto = alturas[i];
            }
            if (alturas[i] < maisBaixo) {
                maisBaixo = alturas[i];
            }
        }

        System.out.println("\nIdades e alturas na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

        System.out.println("\nMais velho: " + maisVelho);
        System.out.println("Mais novo: " + maisNovo);
        System.out.println("Mais alto: " + maisAlto);
        System.out.println("Mais baixo: " + maisBaixo);

        System.out.println("\nAbaixo da média de idade:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nAcima da média de idade:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] > mediaIdade) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nAbaixo da média de altura:");
        for (int i = 0; i < 5; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nAcima da média de altura:");
        for (int i = 0; i < 5; i++) {
            if (alturas[i] > mediaAltura) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        read.close();
    }
}
