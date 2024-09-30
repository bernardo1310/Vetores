import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] dt = new int[3];

        while (true) {
            System.out.print("Digite a data (dd/mm/aaaa): ");
            String ent = read.nextLine();
            String[] partes = ent.split("/"); 

            if (partes.length != 3) {
                System.out.println("Data inválida. Tente novamente.");
                continue;
            }

            boolean datavalid = true;

            for (int i = 0; i < partes.length; i++) {
                if (!partes[i].matches("\\d+")) {
                    datavalid = false;
                    break;
                }
                dt[i] = Integer.parseInt(partes[i]);
            }

            if (datavalid) {
                int dia = dt[0];
                int mes = dt[1];
                int ano = dt[2]; 

                if (mes < 1 || mes > 12) {
                    datavalid = false;
                } else {
                    int[] dianomes = {0, 31, 28 + (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    if (dia < 1 || dia > dianomes[mes]) {
                        datavalid = false;
                    }
                }
            }

            if (datavalid) {
                System.out.println("Data válida: " + dt[0] + "/" + dt[1] + "/" + dt[2]);
                break; 
            } else {
                System.out.println("Data inválida. Tente novamente.");
            }
        }

        read.close();
    }
}
