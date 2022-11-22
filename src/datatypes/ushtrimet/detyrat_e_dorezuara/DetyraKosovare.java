package datatypes.ushtrimet.detyrat_e_dorezuara;

import java.util.Scanner;

public class DetyraKosovare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Ekipi vendas : ");
        String ekipiVendas= sc.nextLine();
        System.out.print("Ekipi mysafir : ");
        String ekipiMysafir= sc.nextLine();
        System.out.print("Numri i tifozeve : ");
        int numriItifozve= sc.nextInt();
        sc.nextLine();
        System.out.print("Fusha/Arena : ");
        String fushaArena= sc.nextLine();
        System.out.print("Sa gola i ka jep  "+ ekipiVendas + " : ");
        int golaEkipiVendas= sc.nextInt();
        System.out.print("Sa gola i ka jep  "+ ekipiMysafir + " : ");
        int golaEkipiMusafir= sc.nextInt();
        System.out.println("-------------------------------------------");

        System.out.println("Rezultati perfundimtar ");
        System.out.printf("%s - %s %d : %d ",ekipiVendas,ekipiMysafir,golaEkipiVendas,golaEkipiMusafir);
        System.out.println();
        System.out.println("Ne stadiumin : "+ fushaArena + " ishin te pranishem "+numriItifozve+ " shikues");
        System.out.println("-------------------------------------------");

    }
}