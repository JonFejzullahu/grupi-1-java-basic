package loops.ushtrime;

import java.util.Scanner;

public class DetyraPse1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("N = ");
        int n = reader.nextInt();

        for (int rreshti = 1; rreshti <= n; rreshti++) {
            //for - rrites
            for (int i = 1; i <= rreshti; i++) {
                System.out.print(i);
            }
            //for - zbrites
            for (int j = rreshti; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}











