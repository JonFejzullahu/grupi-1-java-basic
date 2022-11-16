package datatypes.ushtrimet.gr1;


import java.util.Scanner;

public class ScannerExampleTypes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje vlere booleane (true / false)");
        boolean vleraBoolean = reader.nextBoolean();
        System.out.println("Ju keni zgjedhur: " + vleraBoolean);

        System.out.println("Shkruani nje vlere byte (-128 / 127):");
        byte vleraByte = reader.nextByte();
        System.out.println("Ju keni zgjedhur: " + vleraByte);

        System.out.println("Shkruani nje vlere short (-32K / +32K):");
        short vleraShort = reader.nextShort();
        System.out.println("Ju keni zgjedhur: " + vleraShort);

        System.out.println("Shkruani nje vlere int (-2B / +2B):");
        int vleraInt = reader.nextInt();
        System.out.println("Ju keni zgjedhur: " + vleraInt);

        System.out.println("Shkruani nje vlere float: ");
        float vleraFloat = reader.nextFloat();
        System.out.println("Ju keni zgjedhur: " + vleraFloat);

        System.out.println("Shkruani nje vlere double: ");
        double vleraDouble = reader.nextDouble();
        System.out.println("Ju keni zgjedhur: " + vleraDouble);

        System.out.println("Shkruani nje vlere long: ");
        long vleraLong = reader.nextLong();
        System.out.println("Ju keni zgjedhur: " + vleraLong);


        System.out.println("Shkruani nje karakter: ");
        char shkronja = reader.next().charAt(0); // shkronjen e pare te tekstit
        System.out.println("Ju keni zgjedhur: " + shkronja);
        reader.nextLine();
        System.out.println("Shkruani nje tekst: ");
        String teksti = reader.nextLine();
        System.out.println("Ju keni zgjedhur: " + teksti);
    }
}







