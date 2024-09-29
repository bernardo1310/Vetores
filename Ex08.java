import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char[] consoantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 
                             'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder senha = new StringBuilder();

        System.out.print("Tamanho da senha (menor que 26): ");
        int tamanho = read.nextInt();

        if (tamanho >= 26) {
            System.out.println("Tamanho inválido.");
            read.close();
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                int index = (int) (Math.random() * consoantes.length);
                senha.append(consoantes[index]);
            } else {
                int index = (int) (Math.random() * vogais.length);
                senha.append(vogais[index]);
            }
        }

        if (tamanho % 2 != 0) {
            int index = (int) (Math.random() * consoantes.length);
            senha.append(consoantes[index]);
        }

        System.out.println("Senha gerada: " + senha);
        read.close();
    }
}
