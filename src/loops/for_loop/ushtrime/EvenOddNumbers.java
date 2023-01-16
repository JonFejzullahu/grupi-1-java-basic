package loops.for_loop.ushtrime;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NR= ");
        int numri = reader.nextInt();

        System.out.println("---------EVEN-------------");
        for (int i = 2; i <= numri; i += 2) {
            System.out.println(i);
        }

        System.out.println("--------ODD------------");
        for (int i = 1; i <= numri; i += 2) {
            System.out.println(i);
        }


    }
}
