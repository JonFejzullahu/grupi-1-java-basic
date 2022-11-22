package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class SyprinaEKatrorit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani vleren e brinjes se katrorit: ");
        double brinja = sc.nextDouble();
        double syprina = brinja * brinja;
        System.out.printf("Syprina e katrorit eshte : %.2f m^2", syprina);

    }
}
