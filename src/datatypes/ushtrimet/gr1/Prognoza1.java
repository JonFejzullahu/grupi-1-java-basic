package datatypes.ushtrimet.gr1;

import java.util.Scanner;

public class Prognoza1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj ekipin vendas: ");
        String ekipiVendas = reader.nextLine();
        System.out.println("Shkruaj ekipin musafir: ");
        String ekipiMusafir = reader.nextLine();

        System.out.printf("Sa gola ka dhene %s: %n", ekipiVendas);
        int golaEkipiVendas = reader.nextInt();
        System.out.printf("Sa gola ka dhene %s: %n", ekipiMusafir);
        int golaEkipiMusafir = reader.nextInt();

        System.out.printf("%s - %s   %d : %d %n"
                , ekipiVendas, ekipiMusafir, golaEkipiVendas, golaEkipiMusafir);
    }
}







