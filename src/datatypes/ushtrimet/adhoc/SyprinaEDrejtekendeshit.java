package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class SyprinaEDrejtekendeshit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruani vleren e brinjes a: ");
        double a = scanner.nextDouble();
        System.out.println("Shkruani vleren e brinjes b: ");
        double b = scanner.nextDouble();
        System.out.println("Syprina e drejtkendeshit eshte " + a * b);

    }
}
