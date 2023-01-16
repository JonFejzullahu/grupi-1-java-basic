package loops.do_while_loop.ushtrimet;

import java.util.Scanner;

public class Detyra1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        int numri = sc.nextInt();
        int counter = 1;

        do {
            System.out.printf("%5d %15d %15d %15.2f %n",
                    counter, counter * counter, counter * counter * counter,
                    Math.sqrt(counter));
            counter++;
        } while (counter <= numri);
    }
}












