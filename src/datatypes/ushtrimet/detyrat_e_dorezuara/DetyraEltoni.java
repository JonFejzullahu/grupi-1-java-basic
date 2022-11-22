package datatypes.ushtrimet.detyrat_e_dorezuara;

import java.util.Scanner;

public class DetyraEltoni {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Shkruaj ekipi vendas: ");
        String ekipiVendas= reader.nextLine();
        System.out.print("Shkruaj ekipi musafir: ");
        String ekipiMusafir= reader.nextLine();
        System.out.print("Numri i tifozve: ");
        int nrITifozve= reader.nextInt();
        reader.nextLine();
        System.out.print("Arena ku eshte luajtur: ");
        String arena = reader.nextLine();
        System.out.print("Numri i golave te shenuar nga ekipi vendas: ");
        byte nrIGolaveNgaEkipiVendas= reader.nextByte();
        System.out.print("Numri i golave te shenuar nga ekipi musafir: ");
        byte nrIGolaveNgaEkipiMusafir= reader.nextByte();
        System.out.println("------------------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s-%s %d-%d %n",ekipiVendas,ekipiMusafir,nrIGolaveNgaEkipiVendas,nrIGolaveNgaEkipiMusafir);
        System.out.printf("Arena ku eshte lujatur eshte %s dhe ka gjithsej %d tifoz.%n",arena,nrITifozve);
        System.out.println("------------------------------------------");


    }
}
