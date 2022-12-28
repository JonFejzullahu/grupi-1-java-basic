package selection_decision.switch_examples;

import java.util.Scanner;

public class SwitchBasic {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer prej 0 deri ne 9:");
        int numri = reader.nextInt();

        switch (numri) {
            case 0:
                System.out.println("Numri zero");
                break;
            case 1:
                System.out.println("Numri nje!");
            case 2:
                System.out.println("Numri dy!");
                break;
            default:
                System.out.println("Nuk eshte zero, as nje dhe as dy, por tjeter numer!");
                break;
        }
    }
}














