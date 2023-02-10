package workshop;

import java.util.Scanner;

public class MosterProvimi {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani vlerat n, a,b: ");
        int n = reader.nextInt();
        int a = reader.nextInt();
        int b = reader.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int rndNumber = (int) (Math.random() * a + (b - a) + 1);
            sum += rndNumber;
        }

        System.out.printf("Shuma e %d numrave te gjeneruar random nga [%d] deri me [%d] eshte: %d",
                n, a, b, sum);


    }


}
