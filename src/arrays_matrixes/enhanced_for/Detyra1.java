package arrays_matrixes.enhanced_for;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Shkruaj numrin e %d te vargut: "
                    , i + 1);
            numbers[i] = reader.nextInt();
        }
        for(int number:numbers){
            System.out.printf("%5d ",number);
        }

    }
}





