package selection_decision;

import java.util.Scanner;

public class TwoSort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();

        if (b < a) {
            int t = b;
            b = a;
            a = t;
        }
        System.out.println(a);
        System.out.println(b);
    }
}









