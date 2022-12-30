package selection_decision.string_examples;

import java.util.Scanner;

public class Detyra2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ju lutem shenoni sasin e blere (Kg): ");
        int sasia = sc.nextInt();

        if (sasia >= 10) {
            System.out.println("vlera totale eshte: " + (sasia * 100) * 0.9);
        } else {
            System.out.println("vlera totale eshte: " + sasia * 100);
        }
    }
}
