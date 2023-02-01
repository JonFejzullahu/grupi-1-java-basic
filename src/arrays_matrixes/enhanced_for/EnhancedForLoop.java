package arrays_matrixes.enhanced_for;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 6, 10, -1, 6, 4};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        /*
            foreach(int number: numbers){}
            for(int number in numbers){}
         */
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}




