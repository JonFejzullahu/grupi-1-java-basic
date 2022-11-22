package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class Hipotenuza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj kateten A (cm): ");
        double a = reader.nextDouble();
        System.out.print("Shkruaj kateten B (cm): ");
        double b = reader.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        System.out.printf("Hipotenuza eshte %.2f (cm) %n", c);

    }
}
