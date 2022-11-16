package datatypes.ushtrimet.gr1;

import java.util.Scanner;

public class BadScannerExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int a = reader.nextInt();
        byte d = reader.nextByte();
        boolean b = reader.nextBoolean();

    }
}
