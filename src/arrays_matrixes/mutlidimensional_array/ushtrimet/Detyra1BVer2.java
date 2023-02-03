package arrays_matrixes.mutlidimensional_array.ushtrimet;

public class Detyra1BVer2 {
    public static void main(String[] args) {
        int[] arrayA = {1, 8, 23, 56, 23, 12, 90};
        int[] arrayB = {9, 88, 77, 11};

        int[] arrayC = new int[arrayA.length + arrayB.length];

        int maxLength = Math.max(arrayA.length, arrayB.length);
        int cIndex = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < arrayA.length) {
                arrayC[cIndex++] = arrayA[i];
            }
            if (i < arrayB.length) {
                arrayC[cIndex++] = arrayB[i];
            }
        }

        for (int number : arrayC) {
            System.out.printf("%d ", number);
        }

    }
}
