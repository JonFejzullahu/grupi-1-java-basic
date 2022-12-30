package selection_decision.string_examples;

import java.util.Scanner;

public class Detyra3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mosha: ");
        int mosha = sc.nextInt();
        System.out.println("gjinia: ");
        char gjinia = sc.next().toUpperCase().charAt(0);
        System.out.println("statusi: ");
        char statusi = sc.next().toUpperCase().charAt(0);

        if (gjinia == 'F') {
            System.out.println("zona urbane");
        } else if (gjinia == 'M' && mosha >= 20 && mosha <= 40) {
            System.out.println("kudo");
        } else if (gjinia == 'M' && mosha >= 40 && mosha <= 60) {
            System.out.println("zona urbane");
        } else {
            System.out.println("Gabim!");
        }
    }
}
