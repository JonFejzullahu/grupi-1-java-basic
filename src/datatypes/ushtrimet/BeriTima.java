package datatypes.ushtrimet;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sa euro jane: ");
        int euro = scanner.nextInt();
        System.out.print("Sa centa jane: ");
        int centet = scanner.nextInt();
        int parate = (euro * 100) + centet;

        System.out.println("5-euro jane: " + parate / 500);
        parate = parate % 500;
        System.out.println("2-euro jane: " + parate / 200);
        parate = parate % 200;
        System.out.println("1-euro jane: " + parate / 100);
        parate = parate % 100;
        System.out.println("50-centet jane: " + parate / 50);
        parate = parate % 50;
        System.out.println("20-centet jane: " + parate / 20);
        parate = parate % 20;
        System.out.println("10-centet jane: " + parate / 10);
        parate = parate % 10;
        System.out.println("5-centet jane: " + parate / 5);
        parate = parate % 5;
        System.out.println("3-centet jane: " + parate / 3);
        parate = parate % 3;
        System.out.println("2-centet jane: " + parate / 2);
        parate = parate % 2;
        System.out.println("1-centet jane: " + parate / 1);
        parate = parate % 1;
    }
}









