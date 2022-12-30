package selection_decision.string_examples;

import java.util.Scanner;

public class Detyra2D {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Paga:");
        double paga = reader.nextDouble();
        System.out.println("Sa vite ke punuar: ");
        int exp = reader.nextInt();
        if (exp >= 5) {
            System.out.println("Bonusi yt eshte: " + paga * 0.05);
        } else {
            System.out.println("Nuk ke punuar sa duhet!");
        }
        double bonusi = paga * (exp >= 5 ? 0.05 : 0.0);

        System.out.println("Bonusi yt eshte: " + bonusi);
    }
}
