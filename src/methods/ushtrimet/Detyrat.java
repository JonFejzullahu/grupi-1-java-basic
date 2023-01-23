package methods.ushtrimet;

import java.sql.SQLOutput;

public class Detyrat {
    public static void main(String[] args) {
        printOk();
        print("Mesazhi jone");
        zbritja(20, 5);
        System.out.println(deduction(20.0, 15.5));
        shtypAlfabetin();
        System.out.println();
        shtypAlfabetin(true);
        System.out.println();
        shtypAlfabetin(false);
        System.out.println();
        printAlphabet(true);
        System.out.println();
        printAlphabet(false);
        System.out.println();
        System.out.println(devide(10,2));
        System.out.println(devide(4,2));
        System.out.println(devide(5,2));


    }

    public static void printOk() {
        //System.out.println("OK");
        print("OK");
    }

    public static void print(String mesazhi) {
        System.out.println(mesazhi);
    }

    public static void zbritja(double a, double b) {
        System.out.println(a - b);
    }

    public static double deduction(double a, double b) {
        return a - b;
    }

    public static void shtypAlfabetin() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }

    public static void shtypAlfabetin(boolean printToLowerCase) {
        if (printToLowerCase) {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
            }
        } else {
            shtypAlfabetin();
        }
    }

    public static void printAlphabet(boolean printToLowerCase) {
        char start = printToLowerCase ? 'a' : 'A';

        for (char c = start; c < start + 26; c++) {
            System.out.print(c + " ");
        }
    }

    public static void printoAlfabetin(boolean printToLowerCase) {
        String alfabeti = "abc";
        System.out.println(printToLowerCase ? alfabeti : alfabeti.toUpperCase());
    }

    public static double devide(long a, long b){
        double vlera = a / (double)b;
        return vlera;
    }
}





