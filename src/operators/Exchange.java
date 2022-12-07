package operators;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Nr1 = ");
        int nr1 = reader.nextInt();

        System.out.println("Nr2 = ");
        int nr2 = reader.nextInt();

        //ruaje vleren e variable nr1 ne temp perkohesisht
        int temp = nr1;
        nr1 = nr2; // mbishkruaje nr 1 me vleren e nr 2
        nr2 = temp;

        System.out.println("Nr1 = " + nr1);
        System.out.println("Nr2 = " + nr2);
    }
}





