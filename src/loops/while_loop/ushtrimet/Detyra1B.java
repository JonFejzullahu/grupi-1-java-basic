package loops.while_loop.ushtrimet;

import java.util.Scanner;

public class Detyra1B {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("n=");
        int n = reader.nextInt();

        int counter = 1;
        while (counter <= n) {
            System.out.printf("%3d %15d %15d %n", counter, counter * counter,
                    counter * counter * counter);
            counter++;
        }
    }
}
