package selection_decision.string_examples;

import java.util.Scanner;

public class Detyra2B {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("nr1 ");
        int nr1 = reader.nextInt();

        System.out.println("nr2");
        int nr2 = reader.nextInt();

        System.out.println(Math.max(nr1, nr2));

        System.out.println(nr1 >= nr2 ? nr1 : nr2);

        if (nr1 >= nr2) System.out.println(nr1);
        else System.out.println(nr2);

        if (nr1 <= nr2) System.out.println(nr2);
        else System.out.println(nr1);
    }
}
