package loops.do_while_loop;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please, enter a positive number: ");
        int number;
        do {
            number = user.nextInt();
            if (number <= 0)
                System.out.println("Incorrect number! Try again?");
        } while (number <= 0);

        System.out.println("Me ne fund ja qellove!");
    }
}









