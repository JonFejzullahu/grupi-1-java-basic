package arrays_matrixes.mutlidimensional_array.ushtrimet;

public class Detyra2A {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 9, 5, 6},
                {2, 3, 5, 6},
                {1, 1, 1, 1},
                {8, 5, 6, 7}
        };

        detyraShumaEAntareveTeMatrices(matrix);
        detyraMesatarjaEAntareveTeMatrices(matrix);
    }

    private static void detyraMesatarjaEAntareveTeMatrices(int[][] matrix) {
        int sum = shumaEAntareveTeMatrices(matrix);
        int rows = matrix.length;
        int cols = matrix[0].length;
        double average = (double) sum / (rows * cols);
        System.out.println("Mesatarja = " + average);
    }

    public static int shumaEAntareveTeMatrices(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int number : row) {
                sum += number;
            }
        }
        return sum;
    }

    private static void detyraShumaEAntareveTeMatrices(int[][] matrix) {
        int sum = shumaEAntareveTeMatrices(matrix);
        System.out.println("Shuma e matrices = " + sum);
    }


    private static void detyraShumaEAntareveTeMatrices1(int[][] matrix) {
        int sum = 0;
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                sum += matrix[m][n];
            }
        }
        System.out.println("Shuma e matrices = " + sum);
    }
}
