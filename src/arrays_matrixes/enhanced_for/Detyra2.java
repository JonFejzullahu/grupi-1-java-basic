package arrays_matrixes.enhanced_for;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }

        for (int number : numbers) {
            System.out.printf("%5d ", number);
        }

    }
}
