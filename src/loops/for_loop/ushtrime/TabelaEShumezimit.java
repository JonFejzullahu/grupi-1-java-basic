package loops.for_loop.ushtrime;

import java.util.Scanner;

public class TabelaEShumezimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NR= ");
        int numri = reader.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d  *  %d = %d %n", i, numri, i * numri);
        }
    }
}















