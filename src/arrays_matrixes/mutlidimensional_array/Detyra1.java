package arrays_matrixes.mutlidimensional_array;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[][] array2D = new int[2][2];
        for (int m = 0; m < array2D.length; m++) {
            for (int n = 0; n < array2D[m].length; n++) {
                System.out.printf("Matrix[%d,%d]= ", m + 1, n + 1);
                array2D[m][n] = reader.nextInt();
            }
        }
        for (int[] vargu : array2D) {
            for (int number : vargu) {
                System.out.printf("%5d ", number);
            }
            System.out.println();
        }


    }
}










