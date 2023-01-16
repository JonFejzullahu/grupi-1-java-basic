package loops.while_loop;

import java.util.Scanner;

public class Task1While {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        int counter = 0;

        while (num2 <= num1) {
            counter++;
            num1 -= num2;
        }

        System.out.println(counter);
    }
}







