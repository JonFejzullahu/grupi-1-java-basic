package loops.for_loop.ushtrime;

import java.util.Scanner;

public class Detyra3A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sheno nr: ");
        int nr = reader.nextInt();

        for (int i = 1; i <= nr; i++) {
            System.out.printf("%4d %15d %15d %15.2f%n", i, i * i, i * i * i, Math.sqrt(i));
        }
    }
}





