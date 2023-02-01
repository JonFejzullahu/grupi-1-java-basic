package arrays_matrixes.mutlidimensional_array;

public class MatrixPrinting {
    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        for (int m = 0; m < array2D.length; m++) {
            for (int n = 0; n < array2D[m].length; n++) {
                System.out.printf("%5d ", array2D[m][n]);
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int[] array : array2D) {
            for (int number : array) {
                System.out.printf("%5d ", number);
            }
            System.out.println();
        }

    }
}
