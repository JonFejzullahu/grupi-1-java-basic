package loops.for_loop.ushtrime;

import java.util.Scanner;

public class EvenOddNumbersByChoice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NR= ");
        int numri = reader.nextInt();

        System.out.println("Shkruaj 0 cift, cfaredo tjeter per tek");
        int cift = reader.nextInt();

        for (int i = cift == 0 ? 2 : 1; i <= numri; i += 2) {
            System.out.println(i);
        }

    }
}
