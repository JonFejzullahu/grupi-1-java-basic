package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class SyprinaERrethit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruani rrezen e rrethit: ");
        double rrezja = scanner.nextDouble();
        System.out.println();
        double syprina = Math.PI * rrezja * rrezja;
        System.out.printf("Syprina e rrethit eshte %.3f", syprina);
    }
}
