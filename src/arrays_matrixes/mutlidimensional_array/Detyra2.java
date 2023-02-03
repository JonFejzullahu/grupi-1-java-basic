package arrays_matrixes.mutlidimensional_array;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Mbushja e Matrices A:");
        int[][] matA = new int[2][2];
        for (int m = 0; m < matA.length; m++) {
            for (int n = 0; n < matA[m].length; n++) {
                System.out.printf("Matrix[%d,%d]= ", m + 1, n + 1);
                matA[m][n] = reader.nextInt();
            }
        }
        System.out.println("Mbushja e Matrices B:");
        int[][] matB = new int[2][2];
        for (int m = 0; m < matB.length; m++) {
            for (int n = 0; n < matB[m].length; n++) {
                System.out.printf("Matrix[%d,%d]= ", m + 1, n + 1);
                matB[m][n] = reader.nextInt();
            }
        }

        int[][] matC = new int[2][2];
        for (int m = 0; m < matC.length; m++) {
            for (int n = 0; n < matC[m].length; n++) {
                matC[m][n] = matA[m][n] + matB[m][n];
            }
        }

        for (int[] vargu : matC) {
            for (int number : vargu) {
                System.out.printf("%5d ", number);
            }
            System.out.println();
        }
    }
}
