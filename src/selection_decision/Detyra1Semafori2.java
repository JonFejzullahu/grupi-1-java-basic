package selection_decision;

import java.util.Scanner;

public class Detyra1Semafori2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer nga 1 deri te 4: ");

        int numri = reader.nextInt();

        String rezultati = "Nuk ka rryme";
        if (numri == 1) {
            rezultati = "Semafori eshte i kuq";
        } else if (numri == 2) {
            rezultati = "Smeafori eshte i verdhe";
        } else if (numri == 3) {
            rezultati = "Semafori eshte i gjelbert";
        } else if (numri == 4) {
            rezultati = "Semafori eshte duke blinkuar";
        }
        System.out.println(rezultati);
    }
}
