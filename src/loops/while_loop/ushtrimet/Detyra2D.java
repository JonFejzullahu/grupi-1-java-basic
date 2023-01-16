package loops.while_loop.ushtrimet;

import java.util.Scanner;

public class Detyra2D {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("N: ");
        int n = reader.nextInt();
        int count = 1;

        while (count <= n) {
            System.out.printf("%d,", count);
            if (count % 3 == 0)
                System.out.println();
            count++;
        }
        if (n % 3 == 1) {
            System.out.println("0,0,");
        } else if (n % 3 == 2) {
            System.out.println("0,");

        }

    }
}


















