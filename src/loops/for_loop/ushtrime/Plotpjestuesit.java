package loops.for_loop.ushtrime;

import java.util.Scanner;

public class Plotpjestuesit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NR= ");
        int numri = reader.nextInt();

        for (int i = 1; i <= numri / 2; i++) {
            if (numri % i == 0)
                System.out.println(i);
        }
        System.out.println(numri);
    }
}









