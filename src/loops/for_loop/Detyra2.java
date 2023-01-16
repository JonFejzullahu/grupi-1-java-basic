package loops.for_loop;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("N = ");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}









