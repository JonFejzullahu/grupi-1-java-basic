package loops.nested;

import methods.MyClass;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner perdoruesi = new Scanner(System.in);
        System.out.println("Shkruaj nje numer te plote pozitiv: ");
        long number = perdoruesi.nextLong();

        for (long i = 2; i < number / i; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        if (number > 1) System.out.println(number);

    }
}







