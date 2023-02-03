package arrays_matrixes.mutlidimensional_array.ushtrimet;

public class Detyra1BGood {
    public static void main(String[] args) {
        int[] arrayA = {1, 8, 23, 56, 23, 12, 90};
        int[] arrayB = {9, 88, 77, 11};

        int[] arrayC = joinArray(arrayA, arrayB);

        printArray(arrayC);
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    public static int[] joinArray(int[] arrayA, int[] arrayB) {
        int[] combinedArray = new int[arrayA.length + arrayB.length];
        int maxLength = Math.max(arrayA.length, arrayB.length);
        int cIndex = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < arrayA.length) {
                combinedArray[cIndex++] = arrayA[i];
            }
            if (i < arrayB.length) {
                combinedArray[cIndex++] = arrayB[i];
            }
        }
        return combinedArray;
    }


}
