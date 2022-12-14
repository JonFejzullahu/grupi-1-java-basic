package selection_decision;

import java.util.Scanner;

public class Detyra1Semafori {
    //E punuar nga Arbenita
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer nga 1 deri te 4: ");

        int numri = reader.nextInt();

        if (numri == 1) {
            System.out.println("Semafori eshte i kuq");
        } else if (numri == 2) {
            System.out.println("Smeafori eshte i verdhe");
        } else if (numri == 3) {
            System.out.println("Semafori eshte i gjelbert");
        } else if (numri == 4) {
            System.out.println("Semafori eshte duke blinkuar");
        } else {
            System.out.println("Nuk ka rryme");
        }
    }
}









