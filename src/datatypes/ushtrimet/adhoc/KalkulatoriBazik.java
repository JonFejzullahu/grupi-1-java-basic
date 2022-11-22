package datatypes.ushtrimet.adhoc;

import java.util.Scanner;

public class KalkulatoriBazik {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Shkruaj numrin e pare te plote: ");
        int nr1 = reader.nextInt();

        System.out.println("Shkruaj numrin e dyte te plote: ");
        int nr2 = reader.nextInt();

        // tash vjen shfaqja ne konsolle

        System.out.printf("%d + %d = %d %n", nr1, nr2, nr1 + nr2);
        System.out.printf("%d - %d = %d %n", nr1, nr2, nr1 - nr2);
        System.out.printf("%d * %d = %d %n", nr1, nr2, nr1 * nr2);
        System.out.printf("%d / %d = %d %n", nr1, nr2, nr1 / nr2);
        System.out.printf("%d %s %d = %d %n", nr1, "%", nr2, nr1 % nr2);

    }
}








