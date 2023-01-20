package loops.nested;

import java.util.Scanner;

public class TaxRateCalculator {
    public static void main(String[] args) {
        Scanner perdoruesi = new Scanner(System.in);
        System.out.println("Shkruani pagen qe deshironi: ");
        double paga = perdoruesi.nextDouble();

        if (paga < 0) {
            System.out.println("I lumi ti borxh koke!");
        } else {
            float rate = 0.35f;

            if (paga < 47450)
                rate = 0.22f;
            else if (paga < 114649)
                rate = 0.25f;
            else if (paga < 174699)
                rate = 0.28f;
            else if (paga < 311949)
                rate = 0.33f;

            double rateValue = paga * rate;
            double pagaNeto = paga - rateValue;

            System.out.printf("Nga paga juaj %.2f shtetit i takojne %.2f dhe ju merrni %.2f %n",
                    paga, rateValue, pagaNeto
            );
        }

    }
}
