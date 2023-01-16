package loops.while_loop;

import java.util.Scanner;

public class SentinelWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0, num, count = 0;
        System.out.println("Enter an integer (0 to quit): ");
        num = reader.nextInt();

        while (num != 0) {
            count++;
            sum += num;
            System.out.println("Enter an integer (0 to quit): ");
            num = reader.nextInt();
        }
        if (count != 0) {
            double avg = (double) sum / count;
            System.out.println("Average: " + avg);
        }
        else {
            System.out.println("Nuk keni dhene asnje numer!");
        }
    }
}









