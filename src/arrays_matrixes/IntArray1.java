package arrays_matrixes;

public class IntArray1 {
    public static void main(String[] args) {
        int[] array = {1, -98, 2 + 3, 10, 100 * 2, 12, 33};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}






