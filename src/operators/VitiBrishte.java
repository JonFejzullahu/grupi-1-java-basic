package operators;

import java.util.Scanner;

public class VitiBrishte {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj vitin: ");
        int viti = reader.nextInt();

        //viti i brishte eshte kur viti eshte i plotpjestueshem me 400 ose
        // i plotpjestueshem me 4 dhe jo me 10
        boolean vitiBrishte =
                (viti % 400 == 0) || (viti % 4 == 0 && viti % 100 != 0);

        System.out.println(vitiBrishte);
        //perdorimi i operatorit ternar ?:
        System.out.println(vitiBrishte ? "Viti eshte i brishte" : "Viti eshte normal");
    }
}











