package loops.do_while_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner lexuesi = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter an integer: ");
        int num = lexuesi.nextInt();

        do {
            fact *= num--;
        } while (num >= 1);

        System.out.println("Factorial = " + fact);
    }
}
