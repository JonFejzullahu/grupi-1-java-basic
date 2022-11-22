package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruaje masen e trupit (kg): ");
        double masa = scanner.nextDouble();
        System.out.println("Shkruaje nxitimin e trupit (m/(v^2)):");
        double nxitimi = scanner.nextDouble();
        double forca = masa * nxitimi;

        System.out.printf("Forca eshte e barabarte me %.2f N.", forca);
    }
}
