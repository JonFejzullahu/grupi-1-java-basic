package selection_decision.switch_examples;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin e pare: ");
        int numri1 = reader.nextInt();
        System.out.println("Shkruaj njerin nga operatoret (+,-,*,/,%):");
        char operator = reader.next().charAt(0);
        System.out.println("Shkruaj numrin e dyte: ");
        int numri2 = reader.nextInt();
        double rezultati = 0;
        switch (operator) {
            case '+':
                rezultati = numri1 + numri2;
                break;
            case '-':
                rezultati = numri1 - numri2;
                break;
            case '*':
                rezultati = numri1 * numri2;
                break;
            case '/':
                rezultati = numri1 / numri2;
                break;
            case '%':
                rezultati = numri1 % numri2;
                break;
            default:
                System.out.printf("Operator %c is not allowed here!", operator );
                break;
        }
        System.out.println(rezultati);
    }
}












