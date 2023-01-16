package loops.do_while_loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reverseNumber = 0;
        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();

        do {
            int lastDigit = num % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num /= 10;
        } while (num > 0);

        System.out.println("Reverse number is: " + reverseNumber);
    }
}







