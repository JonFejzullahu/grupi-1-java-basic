package datatypes.ushtrimet;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EKuleta {
    public static void main(String[] args) {
        final double VLERA_500_EURO = 500.00;
        final double VLERA_1_CENTSHE = 0.01;

        Scanner reader = new Scanner(System.in);
        System.out.print("1 centshe: ");
        int sasia1centshe = reader.nextInt();

        System.out.print("2 centshe: ");
        int sasia2centshe = reader.nextInt(); // 15 * 2cent -> 30 cent

        System.out.print("5 centshe: ");
        int sasia5centshe = reader.nextInt(); // 12 * 5 cent -> 60 cent

        System.out.print("10 centshe: ");
        int sasia10centshe = reader.nextInt(); //25 * 10 cent = 250 cent => 2 euro e 50 cent

        System.out.print("20 centshe: ");
        int sasia20centshe = reader.nextInt(); // 20 * 20 cent => 400 cent => 4 euro

        System.out.print("50 centshe: ");
        int sasia50centshe = reader.nextInt(); // 3 *  50 cent => 150 cent => 1 euro e 50 cent

        System.out.print("1 euro: ");
        int sasia1eurove = reader.nextInt(); // 5 * 1 euro => 5 euro

        System.out.print("2 euro: ");
        int sasia2eurove = reader.nextInt(); // 22 * 2 euro => 44 euro

        System.out.print("5 euro: ");
        int sasia5eurove = reader.nextInt(); // 12 * 5 euro => 60 euro

        System.out.print("10 euro: ");
        int sasia10eurove = reader.nextInt(); // 5 * 10 euro => 50 euro

        System.out.print("20 euro: ");
        int sasia20eurove = reader.nextInt(); // 22 * 20 euro => 440 euro

        System.out.print("50 euro: ");
        int sasia50eurove = reader.nextInt(); // 12 * 50 euro => 600 euro

        System.out.print("100 euro: ");
        int sasia100eurove = reader.nextInt(); // 5 * 100 euro => 500 euro

        System.out.print("200 euro: ");
        int sasia200eurove = reader.nextInt(); // 22 * 200 euro => 4400 euro

        System.out.print("500 euro: ");
        int sasia500eurove = reader.nextInt(); // 12 * 500 euro => 6000 euro

        System.out.println("------------------------------------------------");
        System.out.printf("1 centshe:  %6d      %10.2f EUR%n", sasia1centshe, sasia1centshe * VLERA_1_CENTSHE);
        System.out.printf("2 centshe:  %6d      %10.2f EUR%n", sasia2centshe, sasia2centshe * 0.02);
        System.out.printf("5 centshe:  %6d      %10.2f EUR%n", sasia5centshe, sasia5centshe * 0.05);
        System.out.printf("10 centshe: %6d      %10.2f EUR%n", sasia10centshe, sasia10centshe * 0.10);
        System.out.printf("20 centshe: %6d      %10.2f EUR%n", sasia20centshe, sasia20centshe * 0.20);
        System.out.printf("50 centshe: %6d      %10.2f EUR%n", sasia50centshe, sasia50centshe * 0.50);
        System.out.printf("1 euro:     %6d      %10.2f EUR%n", sasia1eurove, sasia1eurove * 1.00);
        System.out.printf("2 euro:     %6d      %10.2f EUR%n", sasia2eurove, sasia2eurove * 2.00);
        System.out.printf("5 euro:     %6d      %10.2f EUR%n", sasia5eurove, sasia5eurove * 5.00);
        System.out.printf("10 euro:    %6d      %10.2f EUR%n", sasia10eurove, sasia10eurove * 10.00);
        System.out.printf("20 euro:    %6d      %10.2f EUR%n", sasia20eurove, sasia20eurove * 20.00);
        System.out.printf("50 euro:    %6d      %10.2f EUR%n", sasia50eurove, sasia50eurove * 50.00);
        System.out.printf("100 euro:   %6d      %10.2f EUR%n", sasia100eurove, sasia100eurove * 100.00);
        System.out.printf("200 euro:   %6d      %10.2f EUR%n", sasia200eurove, sasia200eurove * 200.00);
        System.out.printf("500 euro:   %6d      %10.2f EUR%n", sasia500eurove, sasia500eurove * VLERA_500_EURO);
        System.out.println("------------------------------------------------");
        double totali = sasia500eurove * VLERA_500_EURO
                + sasia200eurove * 200.00
                + sasia100eurove * 100.00
                + sasia50eurove * 50.00
                + sasia20eurove * 20.00
                + sasia10eurove * 10.00
                + sasia5eurove * 5.00
                + sasia2eurove * 2.00
                + sasia1eurove * 1.00
                + sasia50centshe * 0.50
                + sasia20centshe * 0.20
                + sasia10centshe * 0.10
                + sasia5centshe * 0.05
                + sasia2centshe * 0.02
                + sasia1centshe * VLERA_1_CENTSHE;
        System.out.printf("TOTALI:                 %10.2f EUR%n", totali);
        System.out.println("------------------------------------------------");
        System.out.printf("Data dhe Koha: %s%n", LocalDateTime.now());
        System.out.println("------------------------------------------------");
    }
}









