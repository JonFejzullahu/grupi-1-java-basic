package arrays_matrixes.mutlidimensional_array.ushtrimet;

public class Detyra1B {
    public static void main(String[] args) {
        int[] arrayA = {1, 8, 23, 56, 23, 12, 90};
        int[] arrayB = {9, 88, 77, 11};

        int[] arrayC = new int[arrayA.length + arrayB.length];

        int cIndex = 0;
        int aIndex = 0;
        do {
            arrayC[cIndex++] = arrayA[aIndex++];
        } while (aIndex < arrayA.length);

        int bIndex = 0;
        do {
            arrayC[cIndex++] = arrayB[bIndex++];
        } while (bIndex < arrayB.length);

        for (int number : arrayC) {
            System.out.printf("%d ", number);
        }

    }
}
