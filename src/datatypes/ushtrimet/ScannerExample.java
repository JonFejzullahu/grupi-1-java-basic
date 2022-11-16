package datatypes.ushtrimet;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //deklaro nje scanner i cili skanon se cka shkruajme ne console
        Scanner useri = new Scanner(System.in);
        System.out.println("Shkruaje emrin: ");
        String emri = useri.nextLine();

        System.out.println("Welcome " + emri + "!");
    }
}

