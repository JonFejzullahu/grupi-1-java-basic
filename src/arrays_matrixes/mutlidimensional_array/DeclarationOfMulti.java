package arrays_matrixes.mutlidimensional_array;

public class DeclarationOfMulti {
    public static void main(String[] args) {
        int[][] intArray2D = new int[3][2];
        String[][] stringArray2D = new String[4][4];

        int[] vargu1 = {1, 2, 3};
        int[] vargu2 = {2, 3, 4};

        int[][] array2D = {vargu1, vargu2, {5, 6, 7}};
        int[][] jagged2DArray = {
                vargu1, vargu2, {1}, {4, 5}, {1, 2, 3, 4}
        };

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][][] array3D = {
                matrix, array2D,
                {{1, 2, 3}, {4, 5, 6}}
        };

    }
}



